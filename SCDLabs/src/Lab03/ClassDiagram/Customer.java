package Lab03.ClassDiagram;

public class Customer {
    private char customerId;
    private char name;
    private char address;
    private int phNo;
    private int age;

    public void addDetails() {
        System.out.println("Adding customer details...");
    }

    public void modifyDetails() {
        System.out.println("Modifying customer details...");
    }

    public char getCustomerId() {
        return customerId;
    }

    public void setCustomerId(char customerId) {
        this.customerId = customerId;
    }
}
