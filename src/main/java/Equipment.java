
public  class Equipment {
    private String nazwa;
    private int equipmentID;
    private boolean Rented;
    public static int basePrice = 111;


    public Equipment(String nazwa, int equipmentID, boolean rented, int basePrice) {
        this.nazwa = nazwa;
        this.equipmentID = equipmentID;
        Rented = rented;
        this.basePrice = basePrice;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getEquipmentID() {
        return equipmentID;
    }

    public boolean isRented() {
        return Rented;
    }

    public static int getBasePrice() {
        return basePrice;
    }

    public static int getActualRentalPrice() {
        return basePrice;
    }

    public void getEquipmentInfo() {

    }
}
