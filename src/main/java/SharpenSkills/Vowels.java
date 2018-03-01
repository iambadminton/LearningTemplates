package SharpenSkills;

/**
 * Created by Sanya on 28.02.2018.
 */
public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }


    public static void main(String[] args) {
        Vowels vowels = new Vowels();
        System.out.println(vowels.getCount("soodlfuai"))       ;
    }

}
