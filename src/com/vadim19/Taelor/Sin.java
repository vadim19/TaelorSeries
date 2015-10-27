package com.vadim19.Taelor;


public class Sin {

    public static double sin(double x) {
        double sint;
        double stx;
        double e = 0.0001;
        int z = 1;
        int i = 1;
        int factorial = 1;

        stx = x;
        sint = 0;

        while (stx / factorial >= e) {
            sint = sint + z * stx / factorial;
            i += 2;
            stx = stx * x * x;
            factorial = factorial * (i - 1) * i;
            z = z * (-1);
        }
        return sint;
    }
}

