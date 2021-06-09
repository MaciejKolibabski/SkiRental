import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagmentOfClients implements Managment<Client> {
    //metody override
    List<Client> clients = new ArrayList<Client>();
    @Override
    public boolean dodaj(Client obj) {
        clients.add(obj);
        return true;
    }



    @Override
    public List<Client> policz() {
        return Collections.unmodifiableList(clients);
    }
}
