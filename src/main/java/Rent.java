
public class Rent {
    int rentID;
    int beginTime;
    int endTime;
    int rentCost;
    Client client;
    Equipment equipment;
    Equipment equipment1;

    public Rent(int rentID, int beginTime, int endTime, int rentCost, Client client, Equipment equipment, Equipment equipment1) {
        this.rentID = rentID;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.rentCost = rentCost;
        this.client = client;
        this.equipment = equipment;
        this.equipment1 = equipment1;
    }

    //gettery
    public int getRentID() {
        return rentID;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public Client getClient() {
        return client;
    }

    public int getRentDays() {
        return endTime - beginTime;
    }

    public int getRentCost() {
        return Equipment.getActualRentalPrice() * getRentDays();
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentID=" + rentID +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", rentCost=" + rentCost +
                ", client=" + client +
                ", equipment=" + equipment +
                ", equipment1=" + equipment1 +
                '}';
    }
}