package JustTest;

public class SplitTest {
    public static void main(String[] args) {
        String bidKind = "9,15";
        String[] bidKindArray = bidKind.split(",");
        for(int i=0; i< bidKindArray.length; i++){
            System.out.println(bidKindArray[i]);
        }
    }
}
