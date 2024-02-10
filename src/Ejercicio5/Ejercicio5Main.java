package Ejercicio5;

import javax.swing.*;

public class Ejercicio5Main {
    public static void main(String[] args) {
        Ejercicio5[] rooms = new Ejercicio5[5];
        rooms[0] = new Ejercicio5(0, 100.0, true, "Guest");
        rooms[1] = new Ejercicio5(1, 200.0, true, "Guest");
        rooms[2] = new Ejercicio5(2, 1200.0, true, "Guest");
        rooms[3] = new Ejercicio5(3, 1100.0, true, "Guest");
        rooms[4] = new Ejercicio5(4, 1600.0, true, "Guest");


        for (Ejercicio5 room : rooms) {
            JOptionPane.showMessageDialog(null,room.getDetails());
        }


        rooms[0].setPricePerNight(150.0);
        rooms[0].setAvailability(false);


        for (Ejercicio5 room : rooms) {
            JOptionPane.showMessageDialog(null,room.getDetails());
        }
    }
}