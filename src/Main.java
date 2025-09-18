public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Sharik");

        VoiceVisitor voiceVisitor = new VoiceVisitor();

        cat.accept(voiceVisitor);
        dog.accept(voiceVisitor);
    }
}
