public class CatVisitor implements Visitor{

    public void visit(Animal cat) {
        String myBody;
        if (cat.isImprove()) {
            myBody = "catgirl";
            System.out.println("Hello, I'm a " + cat.getName() + " and I'll making a bite 'Kus'." +
                    " I'm the first " + myBody + " in history!");
        }else{
            myBody = "cat";
            System.out.println("Hello, I'm a " + cat.getName() + ". I'm a ordinary " + myBody + ".");
        }
    }
}
