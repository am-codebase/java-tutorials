public class StringImmutabilityDemo {
    public static void main(String[] args) {
        // Example A: concat returns a String, but we do not save it.
        String message = "Hello";
        message.concat(" World");
        System.out.println("Without reassignment: " + message);

        // Example B: assign the returned String to the variable.
        message = message.concat(" World");
        System.out.println("With reassignment: " + message);
    }
}
