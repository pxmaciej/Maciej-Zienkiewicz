package Zoo.Animals;

public class Penguin extends Animal{

    public Penguin(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water", "meat"}; //ryba to mieso!!!!
    }
}

