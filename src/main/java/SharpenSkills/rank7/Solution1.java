package SharpenSkills.rank7;

/**
 Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 The first word within the output should be capitalized only if the original word was capitalized.
 Examples:
 // returns "theStealthWarrior"
 toCamelCase("the-stealth-warrior")
 // returns "TheStealthWarrior"
 toCamelCase("The_Stealth_Warrior")
 */
class Solution1 {

    static String toCamelCase(String s) {
        StringBuilder bldr = new StringBuilder(s);
        replaceAll(bldr, "-", "");
        replaceAll(bldr, "_", "");
        return bldr.toString();
    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index+from.length(), index+from.length()+1,
                    String.valueOf(Character.toUpperCase(builder.charAt(index+from.length()))));
            builder.replace(index, index + from.length(), to);
            index+= to.length();
            index = builder.indexOf(from, index);
        }

    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.toCamelCase("the_Stealth_Warrior"));
    }
}
