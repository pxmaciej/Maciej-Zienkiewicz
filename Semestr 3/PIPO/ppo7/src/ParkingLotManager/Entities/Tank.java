package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Tank implements EntityInterface {
    
    
    
    public String identify() {
    return "Tank is comming";
}

public boolean canEnter() {
    return false;
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