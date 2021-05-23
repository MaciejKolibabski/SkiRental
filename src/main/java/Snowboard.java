public class Snowboard extends Equipment {
    private String size;
    private String typeofSnowboard;

    public Snowboard(String nazwa, int equipmentID, boolean rented, int basePrice, String size, String typeofSnowboard) {
        super(nazwa, equipmentID, rented, basePrice);
        this.size = size;
        this.typeofSnowboard = typeofSnowboard;
    }


    public static int getActualRentalPrice() {
        return Equipment.getActualRentalPrice();
    }

    @Override
    public void getEquipmentInfo() {
        super.getEquipmentInfo();
    }
}
