package Recursion;

/*
Programmer: David Koh
 */

public class Iteration {
    public static void main(String[] args) {
        power1(10);
        power2(0);
        }
    public static void power1(int n){
        double x = 2;
        for (int i = 0; i <= n; i++){
            System.out.println(x + "^" + i + " = " + Math.pow(x,i) + " computed iteratively");
        }
    }
    public static void power2(int n){
        double x = 2;
        if (n<=10){
            System.out.println(x + "^" + n + " = " + Math.pow(x,n) + " computed recursively");
            power2(n+1);
        }
    }
}
