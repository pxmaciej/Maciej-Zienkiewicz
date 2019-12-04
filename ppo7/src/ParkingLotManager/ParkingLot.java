package ParkingLotManager;


import ParkingLotManager.Entities.Bicycle;
import ParkingLotManager.Entities.Car;
import ParkingLotManager.Interfaces.EntityInterface;

import java.util.ArrayList;



final public class ParkingLot {
    private String hours;
    private int cash;
    private int bike;
    
    private static final int MAX_SIZE=70;
    private static final int MAX_SIZE_BICYCLE=20;
    private static String blackList [] = {"DLX 99999", "DLX 99998", "DLX 99997" , "DLX 99996" , "DLX 99995"};
    private int carsOnProperty = 0;

    
    public void setkTime(String hour){
       this.hours=hour;
    }

    public  int pay(){
            int tmp=getCash();
            tmp+=10;
            setCash(tmp);
            return tmp;
        }

    public boolean checkBike(){
        if(bike<MAX_SIZE_BICYCLE){
            return true;
            
        }else{
            
            return false;
        }
    }    
  
   private ArrayList<EntityInterface> entitiesOnProperty = new ArrayList<>();
 
    
    public boolean checkIfCanEnter(EntityInterface entity) {

           for(String black: blackList){
                if(entity.getPlate() == black){
                    Log.info("Is on Black List "+ entity.identify());
                    return false;
                }
            }

            if(carsOnProperty<MAX_SIZE && checkBike() || entity.isPrivilaged()){
            return entity.canEnter();
            }else{
                Log.info("too much on property!! move on "+ entity.identify());
                return false;
            }
    }


    public boolean checkifCanPay(EntityInterface entity) {
        return entity.canPay();
    }

  
    public void letIn(EntityInterface entity) {
        if(checkifCanPay(entity)){
            this.pay();
        }

        entitiesOnProperty.add(entity);
        Log.info(entity.identify() +" let in. "+this.hours);
        
        if(entity instanceof Car && entity.isPrivilaged()==false) {
            carsOnProperty++;
        }

        if(entity instanceof Bicycle){
            bike++;
        }
    }

    public int countCars() {
        return carsOnProperty;
    } 
    public int getCash(){
        return cash;
    }
    public void setCash(int tmp){
        this.cash=tmp;
    }
    
    
}

