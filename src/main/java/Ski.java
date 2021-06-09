public class Ski extends Equipment{
    private String size;
    private String typeOfSki;

    public Ski(String nazwa, int equipmentID, boolean rented, int basePrice, String size,String typeOfSki ) {
        super(nazwa, equipmentID, rented, basePrice);
        this.size = size;
        this.typeOfSki = typeOfSki;

    }


    public static int getActualRentalPrice() {
        return Equipment.getActualRentalPrice();
    }

    @Override
    public void getEquipmentInfo() {
        super.getEquipmentInfo();
    }
}
