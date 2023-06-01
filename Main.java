import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
            
        System.out.println(ints);
        for (double j : ints) {
            result += j;
        }
        System.out.println("Min: " + Collections.min(ints));
        System.out.println("Max: " + Collections.max(ints));
        System.out.println("Average: " + result / ints.size());
        ints.removeIf(i -> i  % 2 == 0);
        System.out.println(ints);
        
    }
}