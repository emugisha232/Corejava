package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable {

    int eNo;
    String eName;

    public Employee(int eNo, String eName) {
        this.eNo = eNo;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_Id=" + eNo +
                ", Employee_Name='" + eName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class SortingUsingComparable {

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(123, "Ernest"));
        emp.add(new Employee(124, "John"));
        emp.add(new Employee(120, "Peter"));
        emp.add(new Employee(111, "Andrew"));

        Comparator<Employee> em = (e1, e2) -> (e1.eNo < e2.eNo) ? -1 : (e1.eNo > e2.eNo) ? 1 : 0;
        System.out.println("Unsorted List:");
        emp.stream().forEach(System.out::println);
        System.out.println("Sorting based on Employee_Id:");
        Collections.sort(emp, em);
        emp.stream().forEach(System.out::println);

        Collections.sort(emp, (emp1, emp2) -> (emp1.eName).compareTo(emp2.eName));
        System.out.println("Sorting based on EmployeeName:");
        emp.stream().forEach(System.out::println);


    }


}
