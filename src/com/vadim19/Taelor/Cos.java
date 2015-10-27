package com.vadim19.Taelor;


public class Cos {
    public static double cos(double x) {
        double cost;
        double stx;
        double e = 0.0001;
        int z = -1;
        int i = 1;
        int factorial = 1;

        stx = x*x;
        cost = 0;

        while (stx / factorial >= e) {
            cost = cost + z * stx / factorial;
            i += 2;
            stx = stx * x * x;
            factorial = factorial * (i - 1) * i;
            z = z * (-1);
        }
        return cost;
    }
}
