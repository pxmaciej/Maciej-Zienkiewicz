package Zoo.Animals;

public class Bear extends Animal {

    public Bear(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water","honey","meat"};
    }

}