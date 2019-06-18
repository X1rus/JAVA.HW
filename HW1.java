package Video7;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        Random rd = new Random();

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            set1.add(rd.nextInt(50));
            set2.add(rd.nextInt(50));

        }
        System.out.println(set1);
        System.out.println(set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println(unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println(intersectSet);
    }

            public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
                Set<Integer> set = new HashSet<>();
                set.addAll(set1);
                set.addAll(set2);
                return set;
            }

            public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
                Set<Integer> set = new HashSet<>();
                set.addAll(set1);
                set.retainAll(set2);
                return set;
            }
       }

