package interfaces;

public class TestMammal {
    public static void main(String[] args) {
        Mammal fox = new Fox("Red fox");
        System.out.println(fox.milkAvailable);
        //Mammal anotherFox = (Fox)fox.clone();
    }
}
