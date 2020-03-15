package ParkingLotManager.Entities;



public class InPost extends Privileged{


    public String identify() {
        return "POST CAR";
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

}