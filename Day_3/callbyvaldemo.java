package Day_3;

public class callbyvaldemo {

    public static void main(String[] args) {
        int a=10;
        System.out.println(a);				//10
        demo(a);	//call by value
        System.out.println(a);			    //10
    }

    private static void demo(int b) 	//copy
    {
        System.out.println(b);				//10
        b=99;	//modify copy
        System.out.println(b);				//99
    }


}