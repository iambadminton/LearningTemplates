package SharpenSkills.rank7;

/**
 * Created by a.shipulin on 06.03.18.
 */
public class Line {
    public static String Tickets(int[] peopleInLine) {
        // в лоб
        int price = 25;
        int change = 0;
        int sum = 0;
        int bill25 = 0;
        int bill50 = 0;
        int bill100 = 0;
        for (int i = 0; i < peopleInLine.length; i++) {

            if(peopleInLine[i] == 25) bill25++;
            if(peopleInLine[i] == 50) {
                bill50++;
                bill25--;
            }
            if(peopleInLine[i] == 100) {
                bill100++;
                if(bill50 >0 ) {
                    bill50--;
                    bill25--;
                }
                else {
                    bill25 = bill25 - 3;
                }
            }
            if (bill25 < 0 || bill50 < 0 || bill100 < 0) {
                return new String("NO");
            }

            //System.out.println("шаг = " + (i+1) + " change=" + change + " sum=" + sum);
        }
        return new String("YES");
    }

    public static void main(String[] args) {
        Line line = new Line();
        System.out.println(line.Tickets(new int[]{25, 100}));
    }
}
