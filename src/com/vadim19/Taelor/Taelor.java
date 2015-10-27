package com.vadim19.Taelor;


public class Taelor {

    private static double x;

    public static void main(String[] args) {
        double x = 2;
        double result = 1;
        long fact = 1;
        double nominator = 1;

        for (int i = 1; i < 20; i++) {
            fact = fact * i;
            nominator = nominator * x;
            result = result + nominator / fact;
        }
        System.out.println(result);
        System.out.println(result - Math.E * Math.E);
        System.out.println(Sin.sin(0.6));
        System.out.println(Cos.cos(0.6));
    }
}