package OracleTutorial.DeckOfCards.innerclasses;

public class Outer5 {
    int value;
    class Inner5 {
        private Outer5 myOuter;

        public Inner5() {
            myOuter = Outer5.this;
        }

        public void printOuter5Value() {
            System.out.println(myOuter.value);
        }
    }

    public Outer5(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Inner5 inner5 = new Outer5(5).new Inner5();
        inner5.printOuter5Value();
    }
}
