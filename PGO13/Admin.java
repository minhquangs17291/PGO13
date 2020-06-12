package PGO13;

public class Admin extends Employee {

    public Admin(String name, String surname, String ID) {
        super(name, surname, ID);
    }

    @Override
    public Client addClient(String name, String surname, BankAccount account) {
        return super.addClient(name, surname, account);
    }



    @Override
    public BankAccount openBankAccount() {
        return super.openBankAccount();
    }

    @Override
    public Transaction acceptPayment() {
        return super.acceptPayment();
    }

    public String addEmployee() {
        return null;
    }
    public String removeEmployee() {
        return null;
    }
}