public class VoiceVisitor implements Visitor{



    @Override
    public void visit(Cat cat) {

        System.out.println("Hello I'm a cat, my name is " + cat.getName() +
                ", Meow!");
    }
    @Override
    public void visit(Dog dog) {

        System.out.println("Hello I'm a dog, my name is " + dog.getName() +
                ", Gav!");
    }
}
