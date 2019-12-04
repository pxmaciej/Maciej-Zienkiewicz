package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Bicycle implements EntityInterface {

    public String identify() {
        return "Unknown bicycle";
    }

    public boolean canEnter() {
        return true;
    }
    public boolean canPay(){
        return false;
    }
    public boolean isPrivilaged(){
        return false;
    }
    public String getPlate(){
        return " ";
    }

}
