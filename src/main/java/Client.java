
public class Client {
    int clientID;
    String firstName;
    String lastName;
    String personalID;

    public Client(int clientID, String firstName, String lastName, String personalID) {
        this.clientID = clientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalID = personalID;
    }


    public int getClientID() {
        return clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalID() {
        return personalID;
    }
}
