package Zoo.Animals;

public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water", "fruits", "vegetables"};
    }
}