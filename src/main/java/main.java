import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class main {


    public static void main(String[] args) throws FileNotFoundException {

        ManagmentOfEquipment managmentOfEquipment = new ManagmentOfEquipment();
        ManagmentOfClients managmentOfClients = new ManagmentOfClients();
        ManagmentOfRents managmentOfRents = new ManagmentOfRents();
        Scanner scan = new Scanner(System.in);
        String [] tabNAZW = new String[100];
        Client [] tabCLIENT = new Client[100];
        Rent[] tabRENT = new Rent[100];
        Random random = new Random();
        managmentOfEquipment.dodawanie();
        managmentOfEquipment.dodawanieNart();
        managmentOfEquipment.dodawanieSnowboardu();

        do {
        //wybor czy user czy admin
            System.out.println("Korzystasz jako: ");
            System.out.println("1. Klient");
            System.out.println("2. Admin");
            System.out.print("Wybór: ");
        int wyborroli = scan.nextInt();


        //user
        if (wyborroli == 1 ) {
        //wybor czy ski czy snowboard
            System.out.println("Jaki rodzaj sprzetu chcesz wypozyczyc");
            System.out.println("1.Narty");
            System.out.println("2.Snowboard");
            System.out.print("Twój wybór: ");
        int wyborsprzetu = scan.nextInt();

        //ski
        if(wyborsprzetu ==1){

            int i=0;
            do {

                System.out.print("Imię: ");
                String nazwaklienta = scan.next();
                tabNAZW[0] = nazwaklienta;
                System.out.print("Nazwisko: ");
                String nazwisko = scan.next();
                System.out.print("Pesel: ");
                String pesel = scan.next();
                Client client1 = new Client(123, nazwaklienta, nazwisko, pesel);
                tabCLIENT[i] = client1;
                managmentOfClients.dodaj(client1);
                int rentid = random.nextInt(100000);
                int begintime = 0;
                System.out.print("Podaj ilośc dni wypożyczenia: ");
                int endtime = scan.nextInt();
                System.out.println("Wybierz sprzęt narciarski:  ");
                System.out.println("1. Narty typu SKITOUR - rozmiar 46");
                System.out.println("2. Narty typu Extreme - rozmiar 42");
                System.out.println("3. Narty typu SKITOUR - rozmiar 43");
                System.out.println("4. Narty typu Extreme - rozmiar 41");
                System.out.println("5. Narty typu Extreme - rozmiar 39");
                int wybor = scan.nextInt();
                Rent rent1 = new Rent(rentid,begintime,endtime, Ski.getActualRentalPrice(), tabCLIENT[i], managmentOfEquipment.tabEQUIPMENT[wybor-1], managmentOfEquipment.tabSKI[wybor-1]);
                tabRENT[i]=rent1;
                managmentOfRents.dodaj(rent1);
                System.out.println("Twoje wypożyczenie: ");
                System.out.println("RentID" + rentid + " Czas trwania: "+ rent1.getRentDays() + " Klient: " + tabCLIENT[i] + " Sprzęt: " + managmentOfEquipment.tabEQUIPMENT[wybor-1] + managmentOfEquipment.tabSKI[wybor-1]);
                System.out.println("Koszt wypożyczenia: ");
                System.out.println(rent1.getRentCost());

                System.out.println("Dodać kolejną osobę wyporzyczającą? ");
                System.out.println("1. Tak ");
                System.out.println("2. Nie ");
                System.out.print("Wybór: ");
                int odp = scan.nextInt();



                if (odp == 2) {
                    break;
                }
                i++;
            }
            while(true);
        }

        if (wyborsprzetu == 2) { //snowboard
            int i=0;
            do {

                System.out.print("Imię: ");
                String nazwaklienta = scan.next();
                tabNAZW[0] = nazwaklienta;
                System.out.print("Nazwisko: ");
                String nazwisko = scan.next();
                System.out.print("Pesel: ");
                String pesel = scan.next();
                Client client1 = new Client(123, nazwaklienta, nazwisko, pesel);
                tabCLIENT[i] = client1;
                managmentOfClients.dodaj(client1);
                int rentid = random.nextInt(100000);
                int begintime = 0;
                System.out.println("Podaj ilośc dni wypożyczenia: ");
                int endtime = scan.nextInt();
                System.out.println("Wybierz sprzęt narciarski:  ");
                System.out.println("1. Snowboard typu SKITOUR - rozmiar 46");
                System.out.println("2. Snowboard typu Extreme - rozmiar 42");
                System.out.println("3. Snowboard typu SKITOUR - rozmiar 43");
                System.out.println("4. Snowboard typu Extreme - rozmiar 41");
                System.out.println("5. Snowboard typu Extreme - rozmiar 39");
                int wybor = scan.nextInt();
                Rent rent2 = new Rent(rentid,begintime,endtime, Snowboard.getActualRentalPrice(), tabCLIENT[i], managmentOfEquipment.tabEQUIPMENT[wybor-1], managmentOfEquipment.tabSNOWBOARD[wybor-1]);
                tabRENT[i]=rent2;
                managmentOfRents.dodaj(rent2);
                System.out.println("Twoje wypożyczenie: ");
                System.out.println("RentID" + rentid + " Czas trwania: "+ rent2.getRentDays() + " Klient: " + tabCLIENT[i] + " Sprzęt: " + managmentOfEquipment.tabEQUIPMENT[wybor-1] + managmentOfEquipment.tabSNOWBOARD[wybor-1]);
                System.out.println("Koszt wypożyczenia: ");
                System.out.println(rent2.getRentCost());
                System.out.println("Dodać kolejną osobę wyporzyczającą? Jeśli nie wpisz -> n, jeśli tak wciśnij dowolny klawisz");
                String odp = scan.next();
                if (odp.equals("n")) {
                    break;
                }
                i++;
            }
            while(true);
        }
        }

        //admin
        if (wyborroli == 2) {
            System.out.println("Wyświetl: ");
            System.out.println("1. Bazę sprzętów");
            System.out.println("2. Bazę Klientów");
            System.out.println("3. Bazę wyporzyczeń");
            int wyborzadania = scan.nextInt();
            if (wyborzadania == 1) {
                System.out.println(managmentOfEquipment.policz());
            }
            if(wyborzadania == 2){
                System.out.println(managmentOfClients.policz());
            }
            if(wyborzadania == 3) {
                System.out.println(managmentOfRents.policz());
            }
        }

            System.out.println("Powróć do menu głównego, lub zakończ działanie. ");
            System.out.println("1.Zakończenie. ");
            System.out.println("2.Powrót do menu głównego ");
            int decyzja = scan.nextInt();
            if (decyzja == 1){
                break;
            }
        }
        while (true);
    }
}
