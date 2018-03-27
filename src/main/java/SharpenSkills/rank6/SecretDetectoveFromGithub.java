package SharpenSkills.rank6;

/**
 Чужое решение, взято с https://github.com/mattesno1/codewars/blob/master/SecretDetective.java

 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** https://www.codewars.com/kata/53f40dff5f9d31b813000774 */
public class SecretDetectoveFromGithub {

    public String recoverSecret(char[][] triplets) {
        Set<Character> chars = getAllChars(triplets);
        return recursivelyBuildString(new StringBuilder(chars.size()), triplets, chars).toString();
    }

    private StringBuilder recursivelyBuildString(StringBuilder sb, char[][] triplets, Set<Character> remainingChars) {

        if (remainingChars.size() == 0) {
            return sb;
        }

        for (Iterator<Character> iterator = remainingChars.iterator(); iterator.hasNext();) {
            Character c = iterator.next();
            if (isNext(c, triplets, remainingChars)) {
                sb.append(c);
                iterator.remove();
            }
        }
        return recursivelyBuildString(sb, triplets, remainingChars);
    }

    private boolean isNext(char c, char[][] triplets, Set<Character> remainingChars) {

        for (char[] triplet : triplets) {
            for (int i = 1; i < triplet.length; i++) {
                if (triplet[i] == c && remainingChars.contains(triplet[i - 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    private Set<Character> getAllChars(char[][] triplets) {
        Set<Character> allChars = new HashSet<>();
        for (char[] triplet : triplets) {
            for (char c : triplet) {
                allChars.add(c);
            }
        }
        return allChars;
    }

    public static void main(String[] args) {
        SecretDetectoveFromGithub detective = new SecretDetectoveFromGithub();
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };
        System.out.println(detective.recoverSecret(triplets));
    }
}
