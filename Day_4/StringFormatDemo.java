package Day_4;

public class StringFormatDemo {
    static void main() {
        int age = 21;
        String name = "Srijan";
        double height = 5.11;

        System.out.println("My name is " + name + " I am " +age +" years old " + "My height is " + height);
        System.out.println(String.format("My name is %s I am %d years old My height is %.2f", name,age,height));
    }
}
