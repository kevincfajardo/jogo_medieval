/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhamedieval;

import java.util.Random;
/**
 *
 * @author Aluno
 */
public class RpgWeapons extends RpgClass{
    Random rand = new Random();
    public String weaponName;
    private int damage;
    private int attackSpeed;

    public RpgWeapons(String className, int strength, int dextery, int health) {
        super(className, strength, dextery, health);
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int atackSpeed) {
        this.attackSpeed = atackSpeed;
    }
    
    public boolean weaponAttack(int dex){
        int missHit = 6 - dex;
        int dice = rand.nextInt(6);
        if(dice>missHit){
            return true;
        } else {
            return false;
        }
    }
    
    public int attackDamage(int strn){
        int dice = rand.nextInt(damage);
        int dmg = dice + strn;
        return dmg;
    }
    
}
