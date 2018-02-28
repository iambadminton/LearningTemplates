package SharpenSkills;

/**
 * Created by a.shipulin on 28.02.18.
 */
public class Printer {

    /*public static String printerError(String s) {
        // your code
        int i=0;
        int j=0;
        String letters = new String("abcdefghijklm");
        for(int k=0; k<s.length(); k++) {
            if(!(letters.contains(s.substring(k,k+1)))) {
                i++;
            }
            j++;
        }
        //System.out.println((i) +"/" + j);
        return (i) +"/" + j;
    }

    */
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }

    /* Хорошее решение
    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }*/

    // еще одно решение с помощью лямбд
    public static String printerError(String s) {
        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
    }
}
