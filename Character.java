
package rpg;


public class Character {
    
    static Dice dice = new Dice();
    static String name;
    static int str, dex, intel, maxHealth, currentHealth;
    
    public Character (String n, int s, int d, int i){
        name = n;
        str = s;
        dex = d;
        intel = i;
    }
    
    public int attack(){
        return dice.roll();
    }
    
    public void wound (int damage){
        
        int currentLife = getCurrentLife();
        currentLife = currentLife - damage;
    }
    
    public void heal (int heal){
        int currentLife = getCurrentLife();
        currentLife = currentLife + heal;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStrength(){
        return str;
    }
    
    public int getDexterity(){
        return dex;
    }
    
    public int getIntelligence(){
        return intel;
    }
    
    public int getCurrentLife(){
        return getMaxLife();
    }
    
    public int getMaxLife(){
        return 100;
    }
}
