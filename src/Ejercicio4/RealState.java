package Ejercicio4;


import javax.swing.*;

public class RealState {
    private int propertyId;
    private String address;
    private int areaM2;
    private long price;
    private int numberRooms;
    private int numberBathrooms;
    private String garage;
    private String status;

    public RealState(int propertyId, String address, int areaM2, long price, int numberRooms, int numberBathrooms, String garage, String status) {
        this.propertyId = propertyId;
        this.address = address;
        this.areaM2 = areaM2;
        this.price = price;
        this.numberRooms = numberRooms;
        this.numberBathrooms = numberBathrooms;
        this.garage = garage;
        this.status = status;
    }


    public void showData() {
        String Details  =  "Property details:\n" +
                "Property ID: " + propertyId + "\n" +
                "Address: " + address + "\n" +
                "Área (m2): " + areaM2 + "\n" +
                "Price: $" + price + "\n" +
                "Number of rooms: " + numberRooms + "\n" +
                "Number of bathrooms: " + numberBathrooms + "\n" +
                "Garage: " + garage + "\n" +
                "Status: " + status;
        JOptionPane.showMessageDialog(null,Details);
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(int areaM2) {
        this.areaM2 = areaM2;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public int getNumberBathrooms() {
        return numberBathrooms;
    }

    public void setNumberBathrooms(int numberBathrooms) {
        this.numberBathrooms = numberBathrooms;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
