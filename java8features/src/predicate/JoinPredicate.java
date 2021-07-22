package predicate;

import java.util.function.Predicate;

public class JoinPredicate {

    public static void main(String[] args) {


        int[] numbers = {0, 5, 10, 15, 20, 30};

        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i1 -> i1 > 10;

        for (Integer n: numbers
             ) {
            if(p1.and(p2).test(n))
            {
                System.out.println(n);
            }

        }
    }

}
