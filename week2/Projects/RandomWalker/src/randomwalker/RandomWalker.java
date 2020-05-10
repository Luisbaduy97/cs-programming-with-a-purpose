/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalker;

/**
 *
 * @author DELL
 */
public class RandomWalker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;
        double rand;
        int distance = 0;
        System.out.println("(" + x + ", " + y + ")");
        while(distance < r){
            rand = Math.random()*100;
            if (rand < 25) x++;
            else if (rand < 50) x--;
            else if (rand < 75) y++;
            else y--;
            distance =  Math.abs(x) + Math.abs(y);
            System.out.println("(" + x + ", " + y + ")");
            steps++;
            
        }
        System.out.println("steps = " + steps);
        
    }
    
}
