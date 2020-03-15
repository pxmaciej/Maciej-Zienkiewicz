package Zoo.Animals;


public class Tiger extends Animal{

    public Tiger(String name){
        super(name);
    }

   @Override
   String[] getDiet() {
    return new String[]{"water", "meats"};
} 
}