/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandmatrix;

/**
 *
 * @author DELL
 */
public class BandMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((Math.abs(j-i) == 0) || (Math.abs(j-i) <=width)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
