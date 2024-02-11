package Ejercicio4;

import javax.swing.*;
import java.util.jar.JarEntry;

public class RealStateMain {
    public static void main(String[] args) {
        RealState property1 = new RealState(1,"Cr 18 # 70-20",50,1700000,3,2,"Yes","Available");
        RealState property2 = new RealState(2," Cl 10 No. 62C-06",70,1500000,1,1,"No","Sold");
        RealState property3 = new RealState(3,"Cr 19 santa Clara",300,19000000,7,5,"No","Rented");

    RealState[] propertiesArray = {property1, property2, property3};// Crear un array para almacenar las instancias de RealState
        for (RealState property : propertiesArray){
            property.showData();
        }








    }







}
