/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.pc;

import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.Staff;
import boardgame.character.equipment.Sword;

/**
 *
 * @author Cloudbuilt
 */
public class Mage extends PlayableCharacter{

    public Mage(String name, IEquipment weapon, IEquipment shield) {
        super(name, 20, 20, 200, Role.MAGE, weapon, shield);
    }

    @Override
    protected double weaponAttackBonus() {
        if(getWeapon() instanceof Sword){
            return 5;
        }else if(getWeapon() instanceof Staff){
            return 45;
        }
        return 0;
    }

    @Override
    protected double weaponDefenseBonus() {
        if(getWeapon() instanceof Sword){
            return 5;
        }else if(getWeapon() instanceof Staff){
            return 25;
        }
        return 0;
    }

    @Override
    protected double shieldAttackBonus() {
        if(getWeapon() instanceof Sword){
            return 5;
        }
        return 0;
    }

    @Override
    protected double shieldDefenseBonus() {
        if(getWeapon() instanceof Sword){
            return 10;
        }
        return 0;
    }
    
}
