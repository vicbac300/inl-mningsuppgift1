import Animals.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    // En arraylist för att lagra alla djuren.
    private static ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public static void main(String[] args) {
        
        animals.add(new Dog("Sixten", 5000));
        animals.add(new Dog("Dogge", 10000));
        animals.add(new Cat("Venus", 5000));
        animals.add(new Cat("Ove", 3000));
        animals.add(new Snake("Hypno", 1000));
        
        
        // En while-loop så man kan kolla flera djur utan att starta om.
        while (true) {
            String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            // Om användaren tryckt på avbryt eller kryss så ska vi stänga ner.
            if (input == null) {
                System.exit(0);
            }
        
            // Hitta djuret/omvandla texten som matats in.
            Animal a = getAnimal(input);
    
            // Visningsmeddelande.
            String msgToShow;
    
            if (a == null) {
                msgToShow = "Det finns inget djur som heter \"" + input.trim() + "\".";
            }
            else {
                msgToShow = a.getName() + " ska ha " + a.howMuchFood() + " gram " + a.getFoodType().toLowerCase() + ".";
            }
    
            // Visa meddelande.
            JOptionPane.showMessageDialog(null, msgToShow);
        }
        
        
    }
    
    private static Animal getAnimal(String name) {
        name = name.trim();
        
        // Gå igenom listan för att hitta djuret.
        for (Animal a : animals) {
            
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        
        }
        
        // Om vi kommit hit utan att hitta något så finns djuret inte.
        return null;
    }
}
