package Zoo.Animals;

public class Porcupine extends Animal{

    public Porcupine(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water", "meat"}; //ryba to mieso!!!!
    }

}