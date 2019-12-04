package ParkingLotManager;

import ParkingLotManager.Entities.Bicycle;
import ParkingLotManager.Entities.Car;
import ParkingLotManager.Entities.InPost;
import ParkingLotManager.Entities.Pedestrian;
import ParkingLotManager.Entities.Privileged;
import ParkingLotManager.Entities.TeacherCar;
import ParkingLotManager.Entities.Tank;
import ParkingLotManager.Interfaces.EntityInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class QueueGenerator {
  

    private static  int ANONYMOUS_PEDESTRIANS_COUNT;
    private static  int PEDESTRIANS_COUNT;
    private static  int CARS_COUNT;
    private static  int TEACHER_CARS_COUNT;
    private static  int BICYCLES_COUNT;
    private static  int PRIVILAGES_COUNT;
    private static  int INPOST_CAR;
    private static  int TANK;
    private static String plate [] =  {"DLX 99999", "DLX 99998", "DLX 99997" , "DLX 99996" , "DLX 887787" ,"DLX 546544",
     "DLX 465456", "DLX 45654", "DLX 654214"};

    public void setAnonymousPedestrians(int anpedestrians){
        ANONYMOUS_PEDESTRIANS_COUNT=anpedestrians;
     }
    public void setPedestrians(int pedestrians){
        PEDESTRIANS_COUNT=pedestrians;
    }
    public void setCarCount(int car){
        CARS_COUNT=car;
    }
    public void setTeacherCar(int teacherCar){
        TEACHER_CARS_COUNT=teacherCar;
    }
    public void setBicycles(int bicycles){
        BICYCLES_COUNT=bicycles;
    }
    public void setPrivilages(int privilages){
        PRIVILAGES_COUNT=privilages;
    }
    public void setInPosts(int posts){
        INPOST_CAR=posts;
    }
    public void setTanks(int tanks){
        TANK=tanks;
    }
   
    
    

    public static ArrayList<EntityInterface> generate() {
        ArrayList<EntityInterface> queue = new ArrayList<>();
        
        for (int i = 0; i <= ANONYMOUS_PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian());
        }
        
        for (int i = 0; i <= PEDESTRIANS_COUNT; i++) {
            queue.add(new Pedestrian(getRandomName()));
        }
  
        for (int i = 0; i <= CARS_COUNT; i++) {
            queue.add(new Car(getRandomPlateNumber()));
        }
        
        for (int i = 0; i <= TEACHER_CARS_COUNT; i++) {
            queue.add(new TeacherCar(getRandomPlateNumber()));
        }
    
        for (int i = 0; i <= BICYCLES_COUNT; i++) {
            queue.add(new Bicycle());
        }
      
        for (int i = 0; i <= PRIVILAGES_COUNT; i++) {
            queue.add(new Privileged());
        }
      
        for (int i = 0; i <= INPOST_CAR; i++) {
            queue.add(new InPost());
        }
      
        for (int i = 0; i <= TANK; i++) {
            queue.add(new Tank());
        }
      
        Collections.shuffle(queue);

        return queue;
    }

    private static String getRandomPlateNumber() {
        Random generator = new Random();
        return plate[generator.nextInt(8)];
        
    }

    private static String getRandomName() {
        String[] names = {"John", "Jack", "James", "George", "Joe", "Jim"};
        return names[(int) (Math.random() * names.length)];
    }

}
