public class Cat extends Animal{

    public Cat(boolean improve, String name) {
        super(improve, name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
