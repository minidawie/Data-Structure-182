package Recursion;

import java.util.Scanner;

/*
Programmer: David Koh
 */

public class Harmonic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number and I will determine its harmonic sum: ");
        int n = s.nextInt();
        System.out.println("The harmonic sum of " + n + " is " + harmonicSum(n));

    }

    public static double harmonicSum(double n) {
        if (n == 1.0) {
            return 1.0;
        } else {
            return 1.0 / n + harmonicSum(n - 1.0);
        }
    }
}
