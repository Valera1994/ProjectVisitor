public class Animal {
    private boolean improve;
    private String name;

    public Animal(boolean improve, String name){
        this.improve = improve;
        this.name = name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public String getName(){
        return this.name;
    }

    public boolean isImprove() {
        return improve;
    }
}
