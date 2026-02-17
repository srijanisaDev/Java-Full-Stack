package Day_2;

import java.util.Scanner;

public class function {

    public static void main(String[] args) {
        areaOfRectangle();
        areaOfCircle();
    }

    static void areaOfRectangle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length:");
        int length = sc.nextInt();

        System.out.println("Enter the Width:");
        int width = sc.nextInt();

        System.out.println("Area of Rectangle = " + (length * width));
    }

    static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        int radius = sc.nextInt();

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}
