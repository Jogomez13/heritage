/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

/**
 *
 * @author jonathan-gomez
 */
public class Tripoteur {
    
    public String prenom = "";
    
    public void tripote(Animal animal) {
        this.prenom = "François";
        
        System.out.println(
                prenom + " "
                + this.getClass().getDeclaredMethods()[0].getName() + " "
                + animal.getClass().getSimpleName());
        animal.emettreSon();
        System.out.println(prenom + " Force "
                + animal.getClass().getSimpleName());
        animal.son = "adore ça";
       
    }
}
