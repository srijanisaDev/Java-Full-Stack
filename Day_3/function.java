package Day_3;

import java.util.Scanner;

public class function {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double result = calculateSI(principal, rate, time);

        System.out.println("Simple Interest = " + result);

        sc.close();
    }

    // Function with arguments
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
