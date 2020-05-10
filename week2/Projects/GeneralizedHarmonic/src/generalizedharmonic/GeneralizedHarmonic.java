/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalizedharmonic;

/**
 *
 * @author DELL
 */
public class GeneralizedHarmonic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double res = 0;
        for (int i = 1; i < n+1; i++) {
            res += 1/Math.pow(i, r);
        }
        System.out.println(res);
    }
    
}
