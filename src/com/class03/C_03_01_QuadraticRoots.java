package com.class03;
import java.util.Scanner;
import java.lang.Math;

public class C_03_01_QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double b2x2 = Math.pow(b, 2) - (4 * a * c);

        if (b2x2 > 0)
        {
            double x1 = (-b + Math.sqrt(b2x2)) / (2 * a);
            double x2 = (-b - Math.sqrt(b2x2)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if (b2x2 == 0)
        {
            double x = (-b) / (2 * a);
            System.out.println(x);
            System.out.println(x);
        }
        else
        {
            System.out.println("roots imaginary");
        }
    }
}
