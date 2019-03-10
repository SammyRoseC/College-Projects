
package rpg;

import java.util.Random;

public class TestCharacter {
    static Character character = new Character("",0,0,0);
    static int player1Health,player1Max,player2Health,player2Max;
    static String player1Name,player2Name;
    
    public static void main (String [] args){
        
        int gameOver = 0;
        int round = 0;
        
        getPlayer1();
        getPlayer2();
        
        System.out.println("------------------------------------------");
        
        do{
            if(player1Health <= 0){
                System.out.println(player2Name+" WINS!");
                gameOver = 1;
            }else if(player2Health <= 0){
                System.out.println(player1Name+" WINS!");
                gameOver = 1;
            }else{
                round++;
                int attack1 = getAttack();
                player1Health = player1Health-attack1;
                System.out.println("ROUND "+round+":");
                System.out.println(player1Name+" attacks "+player2Name+" for "+attack1);
                printPlayerHP();
                System.out.println("----------------------------------------");
                
                int attack2 = getAttack();
                player2Health = player2Health-attack2;
                System.out.println("ROUND "+round+":");
                System.out.println(player2Name+" attacks "+player1Name+" for "+attack2);
                printPlayerHP();
                System.out.println("----------------------------------------");
                
            }
        }while(gameOver != 1);
    }
    
    public static int getAttack(){
        int attack = character.attack();
        return attack;
    }
        
    public static void getPlayer1(){
        player1Health = character.getCurrentLife();
        player1Max = character.getMaxLife();
        player1Name = "Sia";
        System.out.println("Player 1: " + player1Name);
        
    }
    
    public static void getPlayer2(){
        
        player2Health = character.getCurrentLife();
        player2Max = character.getMaxLife();
        player2Name = "Ice";
        System.out.println("Player 2: " + player2Name);
        
    }
    
    public static void printPlayerHP(){
        System.out.println(player1Name+" HP: "+player1Health+"/"+player1Max);
        System.out.println(player2Name+" HP: "+player2Health+"/"+player2Max);
    }
}