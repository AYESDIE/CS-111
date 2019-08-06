package com.class02;
import java.util.Scanner;

public class C_02_01_VolumeOfCylinder {
    public static void main(String[] args) {
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = input.nextDouble();

        System.out.println("Enter Height: ");
        double height = input.nextDouble();

        double area = (PI * radius * radius)
            + (2 * PI * radius * height);

        double volume = (PI * radius * radius * height);
        System.out.println("Surface Area: " + area +"\nVolume: "
            + volume);
    }
}
