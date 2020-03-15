package Zoo;

import Zoo.Animals.Animal;
import Zoo.Interfaces.FoodInterface;

import java.util.ArrayList;

public final class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();
    private String name;

    public Zoo(String name) {
        this.name = name;
        Log.info(name + " created.");
    }

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        Log.info(animal.getName() + " added to zoo.");
        return this;
    }

    public void feedAnimals(FoodInterface Food) {
        Log.info();
        Log.info("Feeding started.");

        for(Animal animal : animals) {
            try {
                animal.feed(Food.food());
            } catch (Exception e) {
                Log.warning(e.getMessage());
            }
        }
    }

}
