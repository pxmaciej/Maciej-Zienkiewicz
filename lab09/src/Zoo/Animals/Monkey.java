package Zoo.Animals;

public class Monkey extends Animal{

    public Monkey(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water", "fruits", "vegetables"};
    }
}