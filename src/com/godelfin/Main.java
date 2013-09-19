package com.godelfin;

import com.godelfin.sieve.Eratosthenes;

public class Main {

    public static void main(String[] args) {
	    Eratosthenes sieve = Eratosthenes.makeSieve();
        sieve.primes(100);
    }
}
