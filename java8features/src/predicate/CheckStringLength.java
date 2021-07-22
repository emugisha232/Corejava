package predicate;

import java.util.function.Predicate;

public class CheckStringLength {

    public static void main(String[] args) {

        String[] names = {"Ernest", "Joh", "Johnson", "Clementine", "Josiane", "Peter"};
        Predicate<String> s = s1 -> s1.length() > 5;
        for (String s1 : names) {

            if (s.test(s1)) {
                System.out.println(s1);
            }

        }
    }
}
