package Day_3;

public class callbyrefDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20};

        System.out.println("Before function call: " + arr[0]);

        demo(arr);

        System.out.println("After function call: " + arr[0]);
    }

    static void demo(int[] brr) {

        System.out.println("Inside function before change: " + brr[0]);

        brr[0] = 99;

        System.out.println("Inside function after change: " + brr[0]);
    }
}
