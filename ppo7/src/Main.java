import ParkingLotManager.Interfaces.EntityInterface;
import ParkingLotManager.Log;
import ParkingLotManager.ParkingLot;
import ParkingLotManager.QueueGenerator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
 

    public static void main(String[] args) {

        String hours[]={"10.00", "15.00"}; 
        Scanner scan = new Scanner(System.in);
        QueueGenerator gen = new QueueGenerator();
        ParkingLot parking = new ParkingLot();
       
            Log.info("Set paramiters on 10:00em and 15:00pm");
            Log.info("Number of ANONYMOUS PEDESTRIANS"); 
            gen.setAnonymousPedestrians(scan.nextInt());
            Log.info("Number of PEDESTRIANS"); 
            gen.setPedestrians(scan.nextInt());
            Log.info("Number of CARS"); 
            gen.setCarCount(scan.nextInt());
            Log.info("Number of  TEACHER CARS");
            gen.setTeacherCar(scan.nextInt());
            Log.info("Number of BICYCLES");
            gen.setBicycles(scan.nextInt());
            Log.info("Number of PRIVILAGES");
            gen.setPrivilages(scan.nextInt());
            Log.info("Number of POST CARS");
            gen.setInPosts(scan.nextInt());
            Log.info("Number of TANKS");
            gen.setTanks(scan.nextInt());

        ArrayList<EntityInterface> queue = QueueGenerator.generate();
       
        for(String hour : hours){

            parking.setkTime(hour);

            Log.info("There's " + parking.countCars() + " cars in the parking lot");
            Log.info();

            for (EntityInterface entity : queue) {
                if(parking.checkIfCanEnter(entity)) {
                    parking.letIn(entity);
                }
            }
            Log.info();
            Log.info("There's " + parking.countCars() + " cars in the parking lot and money We have is: "+ parking.getCash()+"$");
            Log.info("Is car "+ parking.getCars());
            Log.info("Is bike "+ parking.getBike());
        }
    }
    
}
