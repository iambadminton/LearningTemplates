package udemy_java.regular_expression;

public class TestRegex {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до
        ( | ) - одна строка из множества строк
        [^] - отрицание
        . - любой символ
        {2} - 2 символа до
        {2,} - 2 или более символа до
        {2,4} - от 2 до 4 символов
        \\w - одна буква
         */
        String a = "-12121212";
        String b = "9898989";
        String c = "+1212122";
        System.out.println(a.matches("-?\\d*"));
        System.out.println(b.matches("-?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*")); // т.к. + - это спецсимвол в регулярных выражениях

        String d = "SASAffffsfss12121212";
        System.out.println(d.matches("[a-zA-Z]*(-|\\+)?\\d+"));

        String e = "helalo";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        String url2 = "http://www.yandex.ru";
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println("dfdfd.dfdfdf".matches("http://www\\..+\\.(com|ru)"));

        String f = "12";
        System.out.println(f.matches("\\d{2,}"));

    }
}
