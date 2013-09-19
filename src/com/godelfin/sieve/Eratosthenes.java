package com.godelfin.sieve;

import com.godelfin.Sieve;

import java.util.ArrayList;

public class Eratosthenes implements Sieve {


    private Eratosthenes() {
    }

    public static Eratosthenes makeSieve() {
        return new Eratosthenes();
    }

    @Override
    public ArrayList<Integer> primes(Integer max) {

        ArrayList<Integer> allIntegers = allPossiblePrimesUpToMax(max);

        Integer p = 2;
        while (p < max) {
            for (Integer i = p * 2; i <= max; i += p) {
                allIntegers.remove(i);
            }
            p++;
        }

        return allIntegers;
    }

    private ArrayList<Integer> allPossiblePrimesUpToMax(Integer max) {
        ArrayList<Integer> list = new ArrayList<Integer>(max - 1);
        for (Integer i = 2; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

}