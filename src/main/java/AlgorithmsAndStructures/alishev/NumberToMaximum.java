package AlgorithmsAndStructures.alishev;

import java.util.*;

public class NumberToMaximum {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        Integer[] numbers = new Integer[line.length()];
//        System.out.println(line);
//        for (int i = 0; i < line.length() ; i++) {
//            System.out.println(line.charAt(i));
//            numbers[i] = Integer.valueOf(Character.toString(line.charAt(i)));
//        }
//
//        System.out.println(Arrays.toString(numbers));
//
//        Arrays.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 < o2 ) return 1;
//                else return -1;
//            }
//        } );
//
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = new int[]{8,8,6,2,0,1,9,7,9,0};
        System.out.println(String.join("", Arrays
                .stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new)));

    }
}
