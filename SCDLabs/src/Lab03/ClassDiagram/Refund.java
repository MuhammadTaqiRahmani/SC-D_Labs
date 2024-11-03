package Lab03.ClassDiagram;

public class Refund {
    private float amount;
    private char customerId;

    public void refundAmount() {
        System.out.println("Processing refund...");
        System.out.println("Refunded amount: " + amount);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }
}
