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
        System.out.println(test.contains(72));
        System.out.println(test.size());
        int val;
        for (test.iterator(); test.hasNext(); ) {
            val = test.next();
            System.out.println(val);

        }

    }
}
