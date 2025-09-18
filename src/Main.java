public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat(false, "Barsik");
        Animal dog1 = new Dog(false, "Sharik");
        Animal cat2 = new Cat(true, "Bastet");
        Animal dog2 = new Dog(true, "Cerberus");

        CatVisitor catVisitor = new CatVisitor();
        DogVisitor dogVisitor = new DogVisitor();

        cat1.accept(catVisitor);
        dog1.accept(dogVisitor);
        System.out.println("---------------------------------------------------------------");
        cat2.accept(catVisitor);
        dog2.accept(dogVisitor);
    }
}
