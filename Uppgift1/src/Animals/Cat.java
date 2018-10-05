package Animals;

public class Cat extends Animal {
    
    @Override
    public String getFoodType() { return "Kattfoder"; }
    
    public Cat(String name, int weightInGrams) {
        super(name, weightInGrams);
    }
    
    @Override
    public int howMuchFood() {
        return weightInGrams / 150;
    }
}
