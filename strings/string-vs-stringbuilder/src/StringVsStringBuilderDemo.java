public class StringVsStringBuilderDemo {
    public static void main(String[] args) {
        String text1 = "Hello";
        text1.concat(" World");

        StringBuilder text2 = new StringBuilder("Hello");
        text2.append(" World");

        System.out.println("String: " + text1);
        System.out.println("StringBuilder: " + text2);
    }
}
