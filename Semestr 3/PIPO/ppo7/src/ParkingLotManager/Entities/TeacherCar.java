package ParkingLotManager.Entities;

public class TeacherCar extends Car {

   
    public TeacherCar(String plate) {
        super(plate);
    }
    public boolean canPay(){
        return false;
    }
    public boolean isPrivilaged(){
        return false;
    }

    public String identify(){
        return "Teacher ";

    }
  

}
