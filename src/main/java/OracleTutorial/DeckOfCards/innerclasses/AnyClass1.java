package OracleTutorial.DeckOfCards.innerclasses;

public class AnyClass1 {

    public static void main(String[] args) {
        new AnyClass1(){
            {
                this.anyNewMethod();
            }

            void anyNewMethod(){ // добавили новый метод нашему анонимному классу
                System.out.println("Hello from anonimous");
            }
        };
    }
}
