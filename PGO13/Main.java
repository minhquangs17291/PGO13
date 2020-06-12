package PGO13;

public class Main {
    public static void main(String[] args) throws AccountOperationException {
        BankAccount acc = new BankAccount("Quang", "Tran",9909);
        BankAccount acc2 = new BankAccount("Le", "Linh", 2311);

            acc.deposit(1000);
            acc.transfer(500, acc2);
            acc2.makingPayment(100);
            acc2.deposit(5000);
            acc2.transfer(750, acc);
            acc.getHistory();
            acc2.getHistory();
    }
}
