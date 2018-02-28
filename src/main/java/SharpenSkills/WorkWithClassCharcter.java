package SharpenSkills;

/**
 * Created by a.shipulin on 28.02.18.
 */
public class WorkWithClassCharcter {
    public static void main(String[] args) {
        int b = 258;
        char elem = 'a';
        Character character = Character.valueOf((char)b);

        for(int i=0; i<1000; i++) {
            System.out.println("i=" + i + " char=" + (char)i);
        }
    }
}
