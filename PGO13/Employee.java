package PGO13;

public class Employee extends User {
    private static String ID;

    public Employee(String name, String surname, String ID) {
        super(name, surname);
        this.ID = ID;
    }

    public Client addClient( String name, String surname, BankAccount account) {
        return null;
    }

    public BankAccount openBankAccount() {
        return null;
    }

    public Transaction acceptPayment() {
        return null;
    }


}
