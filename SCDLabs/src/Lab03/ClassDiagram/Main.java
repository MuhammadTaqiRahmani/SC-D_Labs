package Lab03.ClassDiagram;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerId('C');
        customer.addDetails();
        customer.modifyDetails();

        Agent agent = new Agent();
        agent.setId(1);
        agent.setName('A');
        agent.searchTicket();
        agent.bookTicket();
        agent.cancelTicket();
        agent.makePayment();
        agent.fillDetails();

        Ticket ticket = new Ticket();
        ticket.setSource('S');
        ticket.setDestination('D');
        ticket.setBusNo("B12");
        ticket.setSeatNo("12A");
        ticket.displayTicketInfo();

        Refund refund = new Refund();
        refund.setAmount(100.0f);
        refund.setCustomerId('C');
        refund.refundAmount();

        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.manageBooking();

        System.out.println("Program executed successfully.");
    }
}
