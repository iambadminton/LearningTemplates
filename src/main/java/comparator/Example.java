package comparator;

import java.util.TreeSet;

class Compare implements Comparable<Object> {
    String str;
    int num;
    String TEMPLATE = "num = %d, str = %s";

    public Compare(String str, int num) {
        this.str = str;
        this.num = num;
    }

    @Override
    public int compareTo(Object obj) {
        Compare entry = (Compare) obj;
        int result = str.compareTo(entry.str);
        if(result != 0) return result;

        result = num - entry.num;
        if(result != 0)
            return (int) result / Math.abs(result);

        return 0;
    }

    @Override
    public String toString() {
        return String.format(TEMPLATE, num, str);
    }
}

public class Example {
    public static void main(String[] args) {
        TreeSet<Compare> data = new TreeSet<>();
        data.add(new Compare("Начальная школа", 234));
        data.add(new Compare("Начальная школа", 132));
        data.add(new Compare("Средняя школа", 357));
        data.add(new Compare("Высшая школа", 246));
        data.add(new Compare("Музыкальная школа", 789));
        for (Compare o : data) {
            System.out.println(o);
        }
    }
}
