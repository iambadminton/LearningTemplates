package JavaCore;

public class NonStaticForwardReference {
    {
        nsf1 = 10;
        nsf1 = sf1;
        int b = nsf1 = 20;
        int c = this.nsf1;
        System.out.println("b=" + b);
    }

    int nsf1 = nsf2 = 30;
    int nsf2;
    static int sf1 = 5;

//    {
//        int d = 2 * nsf1;
//        int e = nsf1 = 50;
//    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println("a=" + a);
        NonStaticForwardReference ref1 = new NonStaticForwardReference();
        System.out.println("ref1.nsf1 = " + ref1.nsf1);


    }


}
