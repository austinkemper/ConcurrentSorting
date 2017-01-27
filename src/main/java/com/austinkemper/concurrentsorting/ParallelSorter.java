package com.austinkemper.concurrentsorting;

import java.util.Arrays;

public class ParallelSorter implements Sorter{

    public int[] sort(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.parallelSort(sorted);
        return sorted;
    }
    
    @Override
    public String toString() {
        return "ParallelSorter";
    }

}
