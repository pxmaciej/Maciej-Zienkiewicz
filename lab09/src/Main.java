import Zoo.Animals.Elephant;
import Zoo.Animals.Lion;
import Zoo.Animals.Bear;
import Zoo.Meats;
import Zoo.Vegetables;
import Zoo.Water;
import Zoo.Zoo;

public class Main {


    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Legnica");
        Meats meats = new Meats();
        Vegetables vege = new Vegetables();
        Water water = new Water();
        String hours[] = {"10:00","12:00","13:00"};

        zoo.addAnimal(new Lion("Simba"))
            .addAnimal(new Lion("Mufasa"))
            .addAnimal(new Elephant("Dumbo"))
            .addAnimal(new Bear("Borys"));

        for(String hour : hours){
            if(hour=="10:00"){
              zoo.feedAnimals(meats);  
            }else if (hour=="12:00"){
                zoo.feedAnimals(vege);
            }else if (hour=="13:00"){
                zoo.feedAnimals(water);
            }
            
            
        }
        
    }
}
