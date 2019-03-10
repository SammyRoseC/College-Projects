
package rpg;


public class Wizard extends Character{
    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    public int castLightningBolt(){
        int lightningBolt = dice.roll()+getIntelligence();
        return lightningBolt;
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
    

