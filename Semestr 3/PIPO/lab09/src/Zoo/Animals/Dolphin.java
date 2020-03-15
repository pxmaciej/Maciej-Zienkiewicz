package Zoo.Animals;

public class Dolphin extends Animal{

    public Dolphin(String name){
        super(name);
    }

    @Override
    String[] getDiet() {
        return new String[]{"water", "meats"};//ryby to miesoo!!
    }
}