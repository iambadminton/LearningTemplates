package OracleTutorial.DeckOfCards.LearnCollections;

/**
пример со stackoveflow
 */
class OtherCls {
    Integer i;
}

public class MovieData {
    static OtherCls someField;
    static String[] list = new String[3];

    static {
        someField = new OtherCls();
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.toString(i);
        }
        System.out.println(list.toString());
        System.out.println("Статический блок");
    }
    {
        System.out.println("Нестатический блок");
    }


    // SAG -->
    public static void main(String[] args) {
        MovieData movieData = new MovieData();
        /*for(int i = 0; i< list.length; i++) {
            System.out.println(list[i]);
        }
        */
    }
    // <--

}
