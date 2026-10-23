
public class StringComparisonDemo {

    public static void main(String[] args) {

        // Creating two separate String objects
        String a = new String("Java");
        String b = new String("Java");

        // == compares object references
        System.out.println(a == b);

        // .equals() compares String contents
        System.out.println(a.equals(b));
    }
}
