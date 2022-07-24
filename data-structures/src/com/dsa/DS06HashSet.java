package com.dsa;

import java.util.HashSet;

public class DS06HashSet {
    public DS06HashSet() {
        // Create a new HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // Add element
        System.out.println(hashSet.add(1));

        // Add element that exists
        System.out.println(hashSet.add(1));
    }

    public static void main(String args[]) {
        new DS06HashSet();
    }
}
