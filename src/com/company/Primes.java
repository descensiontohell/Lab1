package com.company;

public class Primes {
    public static boolean isPrime(int n) { // получает число, возвращает принадлежность к простым
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            if (Primes.isPrime(n)) {
                System.out.println(n);
            }
        }
    }
}