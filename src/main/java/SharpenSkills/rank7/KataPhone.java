package SharpenSkills.rank7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in
 the form of a phone number.
 Example:
 Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 The returned format must be correct in order to complete this challenge.
 Don't forget the space after the closing parentheses!
 */
public class KataPhone {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        // мое решение
        return (Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(""))).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        // еще одно решение от других пользователей
        //return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }



    public static void main(String[] args) {
        KataPhone phone = new KataPhone();
        System.out.println(phone.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));    }
}