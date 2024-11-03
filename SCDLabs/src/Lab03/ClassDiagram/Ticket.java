package Lab03.ClassDiagram;

import java.util.Date;

import java.util.Date;

public class Ticket {
    private char source;
    private char destination;
    private Date dateOfJourney;
    private Date time;
    private String busNo; 
    private String seatNo; 

    public void displayTicketInfo() {
        System.out.println("Ticket Information:");
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("Time: " + time);
        System.out.println("Bus No: " + busNo);
        System.out.println("Seat No: " + seatNo);
    }

    // Getters and Setters
    public char getSource() {
        return source;
    }

    public void setSource(char source) {
        this.source = source;
    }

    public char getDestination() {
        return destination;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBusNo() { 
        return busNo;
    }

    public void setBusNo(String busNo) {  
        this.busNo = busNo;
    }

    public String getSeatNo() { 
        return seatNo;
    }

    public void setSeatNo(String seatNo) { 
        this.seatNo = seatNo;
    }
}

