package Day_5;

public class ArrayTwoSum {
    static void main() {
        int arr[] = {10,20,30,40,50,60};
        int sum = 90;
        int flag = 0;

        for(int i = 0 ; i  < arr.length ;i++){
            int num1 = arr[i];
            int num2 = sum - num1;


            for(int j = i ; j < arr.length ;j++){
                if (arr[j] == num2){
                    System.out.println("["+num1+","+num2+"]");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag ==0){
            System.out.println("No pair Found");
        }
    }
}
 // Time complexity is O(n)2 (O of n square)