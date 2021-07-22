package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Peter",1000));
        employees.add(new Employee("Andrew",2000));
        employees.add(new Employee("John",3000));
        employees.add(new Employee("Bruce",4000));
        employees.add(new Employee("Ernest",5000));
        employees.add(new Employee("Clementine",6000));
        Predicate<Employee>p=emp -> emp.salary>3000;

        for (Employee e1:employees
             ) {
            if(p.test(e1))
            {
                System.out.println(e1);
            }

        }
    }
}
