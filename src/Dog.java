public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
