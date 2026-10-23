public class StringBuilderBasicsDemo {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Hello");
        System.out.println("Before: " + message);
        message.append(" World");
        System.out.println("After: " + message);
    }
}
