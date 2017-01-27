package com.austinkemper.concurrentsorting;

import java.util.Arrays;

public class SimpleSorter implements Sorter{

    public int[] sort(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        return sorted;
    }

    @Override
    public String toString() {
        return "SimpleSorter";
    }
}
