package com.class03;

import java.util.Scanner;

public class C_03_03_CrammersRule {

    public static double Det(double a, double b, double c, double d) {
        return (a * c) - (b * d);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a1, b1, c1 : ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();

        System.out.println("Enter a2, b2, c2 : ");
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double c2 = input.nextDouble();

        double de = Det(a1, b1, a2, b2);

        if (de == 0) {
            System.out.println("don't have solution");
        }
        else {
            double x = Det(c1, b1, c2, b2) / de;
            double y = Det(a1, c1, a2, c2) / de;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
}

// 3, 4, 9, 13, 17, 41