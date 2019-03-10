
package rpg;

import java.util.Random;

public class Dice {
    private Random r;
    
    public Dice(){
    }
    
    public int roll(){
        r = new Random();
        int roll = r.nextInt(((6-1)+1)+1);
        
        return roll;
    }
    
}
