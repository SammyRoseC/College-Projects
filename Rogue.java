
package rpg;

public class Rogue extends Character {
    public Rogue(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    public int castQuickStrike(){
        int heavyStrike = dice.roll()+getDexterity();
        return heavyStrike;
    }
    
    public int castHeal(){
        int heal = dice.roll()+getIntelligence();
        return heal;
    }
    
    public int getMaxMagic(){
        return 10;
    }
    
    public int getCurrentMagic(){
        int currentMagic = getMaxMagic();
        return currentMagic;
    }
}
