/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalkers;

/**
 *
 * @author DELL
 */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long total_steps = 0;
        int num_steps, x, y, mDistance;
        double rand, avg;
        for (int i = 0; i < trials; i++) {
            num_steps = 0;
            x = 0;
            y = 0;
            mDistance = 0;
            while (mDistance < r) {
                rand = Math.random()*100;
                if (rand < 25) x++;
                else if (rand < 50) x--;
                else if (rand < 75) y++;
                else y--;
                num_steps++;
                mDistance = Math.abs(x) + Math.abs(y);
            }
            total_steps += num_steps;
        }
        avg = (double) total_steps / (double) trials;
        System.out.println("average number of steps = " + avg);
    }
}
