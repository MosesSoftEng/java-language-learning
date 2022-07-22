package DataStrucutures;

import java.util.HashMap;

public class DS04HashMap {
    public static void main (String args[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, 0);
        hashMap.put(2, 1);
        hashMap.put(3, 0);

        System.out.println("set: " + hashMap);
        System.out.println("set: " + hashMap.put(1, 4));
        System.out.println("set: " + hashMap);

        System.out.println("set 1: " + hashMap.get(5));
    }
}
