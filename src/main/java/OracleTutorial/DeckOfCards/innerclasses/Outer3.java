package OracleTutorial.DeckOfCards.innerclasses;

public class Outer3 {
    private static int prStOuterVar;

    public Outer3() {
    }

    static class Nested3 {
        int getStaticOuterVar() {
            return Outer3.prStOuterVar;
        }
        void setStaticOuterVar(int var) {
            Outer3.prStOuterVar = var;
        }
    }

    public static void main(String[] args) {
        Outer3.Nested3 nestedObj = new Outer3.Nested3();
        Outer3.prStOuterVar = 19;

        System.out.println("nestedObj.getStaticOUterVAr() = " + nestedObj.getStaticOuterVar());

        nestedObj.setStaticOuterVar(77);
        System.out.println("Outer3.prStOuterVar = " + Outer3.prStOuterVar);
    }
}
