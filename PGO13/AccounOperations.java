package PGO13;

public interface AccounOperations{

    double getBalance();
    void transfer() throws AccountOperationException;
    void makingPayment()throws AccountOperationException;

}
