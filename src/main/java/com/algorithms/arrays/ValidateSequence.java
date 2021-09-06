package com.algorithms.arrays;

import java.util.List;

public class ValidateSequence {


//
//    Given two non-empty arrays of integers, write a function that determines
//    whether the second array is a subsequence of the first one.

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sqIdx = 0;
        for(Integer value: array){
            if(sequence.size() == sqIdx){ break; }
            if(sequence.get(sqIdx).equals(value)) { sqIdx++; }
        }
        return sequence.size() == sqIdx;
    }
}
