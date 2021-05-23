import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagmentOfRents implements Managment<Rent>{
    private List<Rent> rents = new ArrayList<Rent>();
    @Override
    public boolean dodaj(Rent obj) {
        rents.add(obj);
        return true;
    }

    @Override
    public boolean usun(Rent obj) {
        rents.remove(obj);
        return true;
    }

    @Override
    public List<Rent> policz() {
        return Collections.unmodifiableList(rents);
    }
}
