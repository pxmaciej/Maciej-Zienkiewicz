package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Privileged implements EntityInterface {

    public String identify() {
        return "Unknown Privilaged car";
    }

    public boolean canEnter() {
        return true;
    }
    public boolean canPay(){
        return false;
    }
    public boolean isPrivilaged(){
        return true;
    }
    public String getPlate(){
        return " ";
    }

}
