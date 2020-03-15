package ParkingLotManager.Interfaces;

public interface EntityInterface {

    String identify();
    boolean canEnter();
    boolean canPay();
    boolean isPrivilaged();
    String getPlate();

}
