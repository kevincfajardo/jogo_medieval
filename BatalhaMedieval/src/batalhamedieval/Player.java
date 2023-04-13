/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhamedieval;

public class Player extends RpgWeapons {
    private String name;

    public Player(String name, String className, int strength, int dextery, int health) {
        super(className, strength, dextery, health);
        this.name = name;
    }

    public void takeDmg(int dmg){
        this.setHealth(this.getHealth() - dmg); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
