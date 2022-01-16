package com.algorithms;

public class Fibonacci {

    public Integer findByTerm(int term){
        if(term < 2) return term;
        return findByTerm(term - 1) + findByTerm(term - 2);
    }

    public int[] getSequenceByTerm(int term){
        var sequence = new int[term + 1];
        int index = 0;
        while(index <= term){
            sequence[index] = findByTerm(index);
            index++;
        }
        return sequence;
    }

}
