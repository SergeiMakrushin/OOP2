package Product;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetIntegers {


    public static final Set<Integer> number = new HashSet<>();

    public static void oddSet(Set<Integer> b) {
        Random random = new Random();
        while (b.size() < 20) {
            b.add(random.nextInt(1000) + 1);
            b.removeIf(i -> i % 2 == 0);
        }
        System.out.println(b);
    }


}