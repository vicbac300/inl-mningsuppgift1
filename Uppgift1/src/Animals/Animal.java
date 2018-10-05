package Animals;

// Gör klassen abstrakt så att man inte göra "new Animal".
// Detta gör egentligen interfacet överflödigt, men eftersom det skulle vara med i uppgiften så
// lägger jag till den :)
public abstract class Animal implements Feedable {
    
    private String name;
    protected int weightInGrams; // Detta är ett exempel på inkapsling.
    
    public String getName() {return name; }
    public abstract String getFoodType();
    public int getWeightInGrams() { return weightInGrams; }
    
    protected Animal(String name, int weightInGrams) {
        this.name = name;
        this.weightInGrams = weightInGrams;
    }
    
    
    public abstract int howMuchFood();
    
    
    
}
