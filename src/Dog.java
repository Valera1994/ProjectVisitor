public class Dog extends Animal{

    public Dog(boolean improve, String name) {
        super(improve, name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
