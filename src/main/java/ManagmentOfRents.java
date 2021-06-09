import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagmentOfRents implements Managment<Rent>{
    //metody override
    List<Rent> rents = new ArrayList<Rent>();
    @Override
    public boolean dodaj(Rent obj) {
        rents.add(obj);
        return true;
    }

//policzenie
    @Override
    public List<Rent> policz() {
        return Collections.unmodifiableList(rents);
    }
}
