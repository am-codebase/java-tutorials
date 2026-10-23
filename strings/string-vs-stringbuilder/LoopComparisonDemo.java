public class LoopComparisonDemo {
    public static void main(String[] args) {
        String numbers = "";
        for (int i = 1; i <= 5; i++) {
            numbers = numbers + i;
        }
        System.out.println("String: " + numbers);

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            builder.append(i);
        }
        System.out.println("StringBuilder: " + builder);
    }
}
