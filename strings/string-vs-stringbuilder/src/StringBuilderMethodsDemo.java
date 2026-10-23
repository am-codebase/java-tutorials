public class StringBuilderMethodsDemo {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello");
        text.append(" Java");
        System.out.println("Append: " + text);
        text.insert(6, "Amazing ");
        System.out.println("Insert: " + text);
        text.replace(6, 13, "Cool");
        System.out.println("Replace: " + text);
        text.delete(6, 11);
        System.out.println("Delete: " + text);
        text.reverse();
        System.out.println("Reverse: " + text);
    }
}
