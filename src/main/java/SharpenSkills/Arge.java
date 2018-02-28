/* практикум
 http://www.codewars.com/kata/563b662a59afc2b5120000c6/solutions/java
*/

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int year = 0;
        double res = p0;
        while(res < p) {
            year++;
            res = res*(1+percent/100) + aug;
        }
        return (int)year;
    }

    public static void main(String args[]) {
        Arge arge = new Arge();
        System.out.println(arge.nbYear(1000, 2, 50, 1200));
    }
}