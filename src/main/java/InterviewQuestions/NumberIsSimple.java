package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Sanya on 12.02.2018.
 */
public class NumberIsSimple {


    public static void main(String[] args) {
        int dig = 0;
        int j;
        boolean isSimple = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        if(scanner.hasNextInt()) {
            dig = scanner.nextInt();
            System.out.println("Вы ввели " + dig);
            for(int i=2; i<=(int)dig/2; i++) {
                if( (j =dig%i) == 0) {
                    isSimple = false;
                    System.out.println("делитель : " + i );
                    break;
                }
            }
            if(isSimple == true) System.out.println("Простое");
            else System.out.println("Непростое");
        }



    }



}
