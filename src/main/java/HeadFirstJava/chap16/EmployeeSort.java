package HeadFirstJava.chap16;

import java.util.Arrays;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];

        empArr[0] = new Employee(10, "Andrew", 21, 10000);
        empArr[1] = new Employee(20, "Dmitriy", 49, 20000);
        empArr[2] = new Employee(5, "Victor", 45, 5000);
        empArr[3] = new Employee(1, "Alex", 42, 50000);

        Arrays.sort(empArr);
        System.out.println("Стандартная сортировка для массивов объектов Employee: \n" + Arrays.toString(empArr));
    }
}
