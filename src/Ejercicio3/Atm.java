package Ejercicio3;

public class Atm {
    private long accountNumber;
    private double balance;
    private String password;
    public String accountStatus;


    //constructor que reciba y asigne el número de cuenta, saldo y estado iniciales de
    //la cuenta.
    public Atm(long accountNumber, double initialBalance, String accountStatus,String password) {
        this.accountNumber = 1092850181;
        this.balance = initialBalance;
        this.accountStatus = "User active";
        this.password = password;
    }

    //Crear el método consultarSaldo() que simplemente imprime en pantalla el saldo actual.
    public void consultBalance(){
        System.out.println("Current Balance: " + balance);
    }

    //Crear el método retirarEfectivo(valor) que simula un retiro si hay saldo suficiente. Debe
    //imprimir el nuevo saldo
    public void withdrawCash(double value){
        if (value <= balance){
            balance -= value;
            System.out.println("Withdrawal successful.");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    //Crear el método consignarEfectivo(valor) que aumenta el saldo en la cantidad indicada.
    //Imprime el nuevo saldo.
    public void setCash(double value){
        balance += value;
        System.out.println("Deposit successful.");
        System.out.println("New balance: " + balance);
    }

    //Crear el método cambiarClave() que pide ingresar la clave actual y la nueva clave. Valida la
    //clave actual y cambia la clave si es correcto.
    public void changePassword(){
        if (password.equals(password)) {
            System.out.println("Ingrese clave nueva");
           // String nuevaClave = scanner.nextLine();
            System.out.println("La clave ha sido cambiada");
        }else {
            System.out.println("Clave incorrecta");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
