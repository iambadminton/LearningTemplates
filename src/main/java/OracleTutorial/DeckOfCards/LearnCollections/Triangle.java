package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 07.06.17.
 */
class Triangle implements  NestedClass {
    private NestedClass.Color color;

    @Override
    public NestedClass.Color getColor() {
        return color;
    }

    public static void main(String[] args) {
        Color color = new NestedClass.Color(0, 0, 0);
        color = new Triangle.Color(256, 256, 256);
    }
}
