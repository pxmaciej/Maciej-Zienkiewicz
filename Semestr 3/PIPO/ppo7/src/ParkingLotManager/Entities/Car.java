package ParkingLotManager.Entities;

import ParkingLotManager.Interfaces.EntityInterface;

public class Car implements EntityInterface {

    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }
    public String getPlate(){
        return plate;
    }

    public String identify() {
        return "Car with plate number " + plate;
    }

    public boolean canEnter() {
   
        return true;
    }
    public boolean canPay(){
        return true;
    }
    public boolean isPrivilaged(){
        return false;
    }
    
      
       
    

}
