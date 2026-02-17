package Day_4;

public class string {
    static void main() {
        String name = "Srijan";
        String name1 = "Srijan" ;
        String name2 = "Ben";
        String name3 = new String("Srijan");
        String name4 = new String("Srijan");
        String name5 = new String("srijan");

        System.out.println(name==name1);
        System.out.println(name==name3);
        System.out.println(name3==name4);
        System.out.println(name3.equals(name5));
        System.out.println(name3.equalsIgnoreCase(name5));

    }
}
