package Animals;

public class Dog extends Animal {
    
    @Override
    public String getFoodType() { return "Hundfoder"; } // Detta är ett exempel på polymorfism.
    
    public Dog(String name, int weightInGrams) {
        super(name, weightInGrams);
    }
    
    @Override
    public int howMuchFood() {
        return weightInGrams / 100;
    }
}
