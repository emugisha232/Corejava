package function;

import java.util.function.Function;

public class Student {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Function<Student, String>f=s -> {
            int marks= s.marks;
            String grade="";

            if(marks>=80) grade="A[Distinction]";
            else if(marks>=60) grade="B[First Class]";
            else if(marks>=50) grade="C[Second Class]";
            else if(marks>=35) grade="D[Third Class]";
            else grade="F[Failed]";
            return grade;
        };
        Student[] s={new Student("Ernest", 100),
                new Student("Sunny", 65),
                new Student("Bunny", 55),
                new Student("Shinny", 45),
                new Student("Vinny", 25)
        };

        for (Student s1:s
             ) {
            System.out.println("Student Name:" +s1.name);
            System.out.println("Student Marks:" +s1.marks);
            System.out.println("Student Grade: "+f.apply(s1));
            System.out.println();

        }
    }
}
