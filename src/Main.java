public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "Barsik");
        Dog dog = new Dog(false, "Sharik");


        VoiceVisitor voiceVisitor = new VoiceVisitor();

        cat.accept(voiceVisitor);
        dog.accept(voiceVisitor);
    }
}
