package Ejercicio5;

public class Ejercicio5 {
    private int roomNumber;
    private double pricePerNight;
    private boolean availability;
    private String huesped;

    public Ejercicio5(int roomNumber, double pricePerNight, boolean availability, String huesped) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.huesped = huesped;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }
    public String getDetails() {
        return "Room Number: " + this.roomNumber +
                ", Price: " + this.pricePerNight +
                ", Availability: " + (this.isAvailability() ? "Available" : "Not Available") +
                ", Guest: " + this.huesped;
    }



}