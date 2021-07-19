package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Is this Even Number ?:");
        int n=in.nextInt();
        Predicate<Integer>p=i -> i%2==0;
        System.out.println(p.test(n));


    }
}
