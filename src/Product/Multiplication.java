package Product;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multiplication {
    public static Set<String> tasks = new HashSet<>();

    public static String task() {

        int a;
        int b;
        Random random = new Random();
        a = random.nextInt(9);
        b = random.nextInt(9);

        return a + "*" + b;

    }


    public static void fd() {
        int f = 0;
        while (f < 15) {
            String task = task();
            String inverseTask = task.charAt(2) + "*" + task.charAt(0);
            if (!tasks.contains(task) && !tasks.contains(inverseTask)) {
                tasks.add(task);
                f++;
            }
        }
        System.out.println(tasks);
   }

}

