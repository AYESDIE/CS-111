package com.class02;
import java.util.Scanner;

public class C_02_01_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in C: ");
        double celcius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celcius + 32;
        System.out.println("Temperature in F: " + fahrenheit);
    }
}
