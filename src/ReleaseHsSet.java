import java.util.TreeSet;

/**
 * Created by Kubish on 12.03.2015.
 */
public class ReleaseHsSet {
    public static void main(String[] argc) {

        IntHashSet test = new IntHashSet();
        test.add(23);
        test.add(33);
        test.add(43);
        test.add(38);
        test.add(40);
        test.add(73);
        test.add(23);
        System.out.println(test);
        long start = System.nanoTime();
        System.out.println(test.contains(43));
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнения кода IntHashSet: " + timeConsumedMillis + " наносекунд");
        TreeSet hs = new TreeSet();
        hs.add(23);
        hs.add(33);
        hs.add(43);
        hs.add(38);
        hs.add(40);
        hs.add(73);
        hs.add(23);
        start = System.nanoTime();
        System.out.println(hs.contains(43));
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Время выполнения кода TreeSet: " + timeConsumedMillis + " наносекунд");
        int val;
        for (test.iterator(); test.hasNext(); ) {
            val = test.next();
            System.out.print(val + " ");
        }

    }
}
