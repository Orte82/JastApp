package com.orte.javaalgorithms;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i = 0; i < N; i++){
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);

        }
    }
}
