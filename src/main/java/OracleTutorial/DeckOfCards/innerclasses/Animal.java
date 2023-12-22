package OracleTutorial.DeckOfCards.innerclasses;

public class Animal {
    public void eat() {
        System.out.println("Anymal is eating");
    }

    public static void main(String[] args) {
        Animal otherAnymal = new Animal(){
            @Override
            public void eat() {
                System.out.println("Other anymal is eating");
            }
        };

        otherAnymal.eat();
    }
}
