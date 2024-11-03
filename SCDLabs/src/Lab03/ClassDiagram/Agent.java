package Lab03.ClassDiagram;

public class Agent implements CommonFunctions {
    private int id;
    private char name;

    @Override
    public void searchTicket() {
        System.out.println("Agent is searching for tickets...");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent is booking a ticket...");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent is canceling a ticket...");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent is processing payment...");
    }

    @Override
    public void fillDetails() {
        System.out.println("Agent is filling in details...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
