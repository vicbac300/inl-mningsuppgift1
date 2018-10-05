package Animals;

public class Snake extends Animal {
    
    @Override
    public String getFoodType() { return "Ormpellets"; }
    
    public Snake(String name, int weightInGrams) {
        super(name, weightInGrams);
    }
    
    @Override
    public int howMuchFood() {
        return 20;
    }
}
