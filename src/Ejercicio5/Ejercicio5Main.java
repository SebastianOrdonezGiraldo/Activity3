package Ejercicio5;

import javax.swing.*;

public class Ejercicio5Main {
    public static void main(String[] args) {
        Ejercicio5[] rooms = new Ejercicio5[6];
        rooms[0] = new Ejercicio5(1, 100.0, true, "Guest");
        rooms[1] = new Ejercicio5(2, 200.0, true, "Guest");
        rooms[2] = new Ejercicio5(3, 1200.0, true, "Guest");
        rooms[3] = new Ejercicio5(4, 1100.0, true, "Guest");
        rooms[4] = new Ejercicio5(5, 1600.0, true, "Guest");

        // Printing initial room details
        for (Ejercicio5 room : rooms) {
            if (room != null) {
                JOptionPane.showMessageDialog(null, room.getDetails());
            }
        }

        // Modifying the price and availability of room 3
        if (rooms[2] != null) {
            rooms[2].setPricePerNight(1500.0);
            rooms[2].setAvailability(false);
        }

        // Printing room details after modification
        for (Ejercicio5 room : rooms) {
            if (room != null) {
                JOptionPane.showMessageDialog(null, room.getDetails());
            }
        }
    }
}
