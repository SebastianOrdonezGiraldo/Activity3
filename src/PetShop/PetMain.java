package PetShop;

import javax.swing.*;

public class PetMain {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Simon", 1,"Golden Retriver","Gold");
        Pet pet2 = new Pet("Ahito", 4,"Akita","Black");
        Pet pet3 = new Pet("Coffee", 3,"American Bulldog","brown");
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n" +
                    "1. Dog 1\n" +
                    "2. Dog 2\n" +
                    "3. Dog 3\n" +
                    "0. Exit\n" +
                    "Choose your option: "));

            switch (option){
                case 1:
                    JOptionPane.showMessageDialog(null,"Your dog name is: "+ pet1.name + "\nAge: " + pet1.age + "\nBreed: " + pet1.breed + " \nColor: " + pet1.color);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Your dog name is: "+ pet2.name + "\nAge: " + pet2.age + "\nBreed: " + pet2.breed + " \nColor: " + pet2.color);
                break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Your dog name is: "+ pet3.name + "\nAge: " + pet3.age + "\nBreed: " + pet3.breed + " \nColor: " + pet3.color);
                break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Exit.....");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Unvalid option. Please, choose a valid option.");
            }
        } while (option != 0);
    }
}
