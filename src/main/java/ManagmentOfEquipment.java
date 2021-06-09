import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ManagmentOfEquipment implements Managment<Equipment>{
    List<Equipment> equipmentmanage = new ArrayList<Equipment>();


    Random random = new Random();
    boolean wolne = true;
    int equipmentid = random.nextInt(10000);
    Equipment [] tabEQUIPMENT = new Equipment[11];
    Ski [] tabSKI = new Ski[5];
    Snowboard [] tabSNOWBOARD = new Snowboard[5];



    @Override
    public boolean dodaj(Equipment obj) {
        equipmentmanage.add(obj);
        return true;
    }




    void dodawanie() {

        Equipment equipment1 = new Equipment("eq1", equipmentid, true, Equipment.basePrice);
        Equipment equipment2 = new Equipment("eq2", equipmentid, true, Equipment.basePrice);
        Equipment equipment3 = new Equipment("eq3", equipmentid, true, Equipment.basePrice);
        Equipment equipment4 = new Equipment("eq4", equipmentid, true, Equipment.basePrice);
        Equipment equipment5 = new Equipment("eq5", equipmentid, true, Equipment.basePrice);
        Equipment equipment6 = new Equipment("eq6", equipmentid, true, Equipment.basePrice);
        Equipment equipment7 = new Equipment("eq7", equipmentid, true, Equipment.basePrice);
        Equipment equipment8 = new Equipment("eq8", equipmentid, true, Equipment.basePrice);
        Equipment equipment9 = new Equipment("eq9", equipmentid, true, Equipment.basePrice);
        Equipment equipment10 = new Equipment("eq10", equipmentid, true, Equipment.basePrice);
        dodaj(equipment1);
        dodaj(equipment2);
        dodaj(equipment3);
        dodaj(equipment4);
        dodaj(equipment5);
        dodaj(equipment6);
        dodaj(equipment7);
        dodaj(equipment8);
        dodaj(equipment9);
        dodaj(equipment10);
        tabEQUIPMENT[0] = equipment1;
        tabEQUIPMENT[1] = equipment2;
        tabEQUIPMENT[2] = equipment3;
        tabEQUIPMENT[3] = equipment4;
        tabEQUIPMENT[4] = equipment5;
        tabEQUIPMENT[5] = equipment6;
        tabEQUIPMENT[6] = equipment7;
        tabEQUIPMENT[7] = equipment8;
        tabEQUIPMENT[8] = equipment9;
        tabEQUIPMENT[9] = equipment10;
    }

    void dodawanieNart() {
        Ski ski1 = new Ski("Nartki1", 99, true, Equipment.basePrice, "46", "All mountain");
        Ski ski2 = new Ski("Nartki1", 99, true, Equipment.basePrice, "42", "Easy ");
        Ski ski3 = new Ski("Nartki1", 99, true, Equipment.basePrice, "43", "Skitour");
        Ski ski4 = new Ski("Nartki1", 99, true, Equipment.basePrice, "41","Extreme");
        Ski ski5 = new Ski("Nartki1", 99, true, Equipment.basePrice, "39","Allround ");
        dodaj(ski1);
        dodaj(ski2);
        dodaj(ski3);
        dodaj(ski4);
        dodaj(ski5);
        tabSKI[0] = ski1;
        tabSKI[1] = ski2;
        tabSKI[2] = ski3;
        tabSKI[3] = ski4;
        tabSKI[4] = ski5;
    }



    void dodawanieSnowboardu() {
        Snowboard snowboard1 = new Snowboard("Snow1", 91, true, Equipment.basePrice,"38", "FreeRide");
        Snowboard snowboard2 = new Snowboard("Snow2", 92, true, Equipment.basePrice,"41", "Boardercross");
        Snowboard snowboard3 = new Snowboard("Snow3", 93, true, Equipment.basePrice,"43", "All Mountain");
        Snowboard snowboard4 = new Snowboard("Snow4", 94, true, Equipment.basePrice,"37", "FreeRide");
        Snowboard snowboard5 = new Snowboard("Snow5", 95, true, Equipment.basePrice,"44", "Freestyle");
        dodaj(snowboard1);
        dodaj(snowboard2);
        dodaj(snowboard3);
        dodaj(snowboard4);
        dodaj(snowboard5);
        tabSNOWBOARD[0]= snowboard1;
        tabSNOWBOARD[1]= snowboard2;
        tabSNOWBOARD[2]= snowboard3;
        tabSNOWBOARD[3]= snowboard4;
        tabSNOWBOARD[4]= snowboard5;
    }

    @Override
    public List<Equipment> policz() {
        return Collections.unmodifiableList(equipmentmanage);
    }
}