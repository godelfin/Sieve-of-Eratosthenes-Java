package com.godelfin;

import java.util.ArrayList;
import java.util.logging.*;

import com.godelfin.sieve.Eratosthenes;

public class Main {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        Eratosthenes sieve = Eratosthenes.makeSieve();
        ArrayList<Integer> primes = sieve.primes(100);

        LOGGER.info(primes.toString());
    }
}

