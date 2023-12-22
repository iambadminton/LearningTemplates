package interfaces;

public class Fox implements Mammal, Cloneable {
    public String name;

    @Override
    public String getMilk() {
        return "fox milk";
    }

    public Fox(String name) {
        this.name = name;
    }

     protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Mammal fox = new Fox("Red fox");
        System.out.println(fox.milkAvailable);
        Mammal anotherFox = (Fox)((Fox)fox).clone();
        System.out.println(fox == anotherFox);

    }
}
