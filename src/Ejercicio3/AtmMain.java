package Ejercicio3;


import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        Atm atm = new Atm(1092850181,190000,"Actived","1234");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Consignar efectivo");
            System.out.println("4. Cambiar clave");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    atm.consultBalance();
                    break;
                case 2:
                    System.out.print("Ingrese el valor a retirar: ");
                    double valorRetiro = scanner.nextDouble();
                    atm.withdrawCash(valorRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a consignar: ");
                    double valorConsignacion = scanner.nextDouble();
                    atm.setCash(valorConsignacion);
                    break;
                case 4:
                    atm.changePassword();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese una opción válida.");
            }
        } while (option != 5);
        scanner.close();
    }
}



