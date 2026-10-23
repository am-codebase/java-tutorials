import java.util.Locale;

public class ReceiptDemo {
    public static void main(String[] args) {
        StringBuilder receipt = new StringBuilder();
        String[] products = {"Milk", "Bread", "Eggs"};
        double[] prices = {3.50, 2.25, 4.00};
        double total = 0;

        receipt.append("MY SHOP\n");
        receipt.append("--------------------\n");
        for (int i = 0; i < products.length; i++) {
            receipt.append(products[i]);
            receipt.append(": $");
            receipt.append(String.format(Locale.US, "%.2f", prices[i]));
            receipt.append("\n");
            total += prices[i];
        }
        receipt.append("--------------------\n");
        receipt.append("Total: $");
        receipt.append(String.format(Locale.US, "%.2f", total));
        System.out.println(receipt);
    }
}
