/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class CarSmoothieBar extends SmoothieBar{
    
    public Smoothie createSmoothie(String s){
        if(s.equals("Banana")) {
            Smoothie drink = new Banana();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Orange")) {
            Smoothie drink = new Orange();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Strawberry")) {
            Smoothie drink = new Strawberry();
            drink = new Icecream(drink);
            return drink;
        }
        if(s.equals("Mango")) {
            Smoothie drink = new Mango();
            drink = new Icecream(drink);
            return drink;
        }
        else
            return null;
    }
    
}
