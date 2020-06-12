package PGO13;

public class Client extends User {

    private String ID;

    public Client(String name, String surname, String ID) {
        super(name, surname);
        this.ID = ID;
    }

    public Client(String name, String surname) {
        super(name, surname);
    }

}
