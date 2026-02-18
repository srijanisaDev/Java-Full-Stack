package Day_5;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        int arr[] = new int[5];   // array declaration of size 5

        // int -> Datatype
        // arr -> array name
        // [] -> array declaration / Dimension
        // [5] -> length of array

        Scanner sc = new Scanner(System.in);

        // Input values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print using for-each loop
        for (int n : arr) {
            System.out.println(n);
        }

        sc.close();
    }
}
