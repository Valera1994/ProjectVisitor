public class DogVisitor implements Visitor{

    public void visit(Animal dog){
        int numberOfHead;
        if (dog.isImprove()) {
            numberOfHead = 3;
            System.out.println("I'm a " + dog.getName() +" and I'll bite your throat! " +
                    "I have " + numberOfHead + " heads.");
        }else{
            numberOfHead = 1;
            System.out.println("I'm a " + dog.getName() +". I'm a ordinary dog. " +
                    "I have " + numberOfHead + " head.");
        }

    }
}
