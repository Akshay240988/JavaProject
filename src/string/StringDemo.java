package string;

public class StringDemo {
    public static void main(String[] args) {

        char arr[]={'c','o','d','e'};
        String s = new String(arr);
        System.out.println(s);

        String s1 = new String("Pune");
        String s2 = "Mumbai";
        System.out.println(s2.concat("Latur"));
       // s2=s2.concat("Latur");

        String a1 = new String("code");
        String a2 = new String("code");

        System.out.println(a1==a2);// reference or address comparison
        System.out.println(a1.equals(a2));// content comparison

    }
}
