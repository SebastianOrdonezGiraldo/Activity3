package  Ejercicio5;

import javax.swing.*;

public class Ejercicio5Main {
    public static void main(String[] args) {
        Ejercicio5[] rooms = new Ejercicio5[5];
        for (int i = 0; i < 5; i++) {
            rooms[i] = new Ejercicio5(i+1, 100.0, true, "Guest" + (i+1));
        }

        // Print room details
        for (Ejercicio5 room : rooms) {
            JOptionPane.showMessageDialog(null, "Room Number: " + room.getRoomNumber() + "\nPrice per Night: " + room.getPricePerNight() + "\nAvailability: " + room.isAvailability() + "\nGuests: " + room.getHuesped());
        }

        // Modify room details
        rooms[0].setPricePerNight(120.0);
        rooms[0].setAvailability(false);

        // Print room details after modification.showMessageDialog(null, "After modification:");
        for (Ejercicio5 room : rooms) {
            JOptionPane.showMessageDialog(null, "Room Number: " + room.getRoomNumber() + "\nPrice per Night: " + room.getPricePerNight() + "\nAvailability: " + room.isAvailability() + "\nGuests: " + room.getHuesped());
        }
    }
}