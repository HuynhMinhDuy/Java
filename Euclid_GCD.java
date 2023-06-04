package org.example;

public class Main {

    public static int GCD (int p, int q) {
        if (p % q == 0) return q;
        return GCD(q, p%q);
    }
    public static void main(String[] args) {
        System.out.println("Test here");

        int p = 18;
        int q = 24;

        System.out.println(GCD(p,q));
    }
}
