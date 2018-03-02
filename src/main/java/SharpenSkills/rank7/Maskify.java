package SharpenSkills.rank7;

/**
 Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
 Your task is to write a function maskify, which changes all but the last four characters into '#'.
 Examples
 Maskify.Maskify("4556364607935616"); // should return "############5616"
 Maskify.Maskify("64607935616");      // should return "#######5616"
 Maskify.Maskify("1");                // should return "1"
 Maskify.Maskify("");                 // should return ""
 // "What was the name of your first pet?"
 Maskify.Maskify("Skippy");                                   // should return "##ippy"
 Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 */
public class Maskify {
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        if(str.length() <4) {
            return str;
        }
        else {
            return str.substring(0, str.length() - 4).replaceAll(".", "#") + str.substring(str.length() - 4, str.length());
        }

    }

    public static void main(String[] args) {
        Maskify maskify = new Maskify();
        System.out.println(maskify.maskify("qwqeweweweq"));
    }
}
