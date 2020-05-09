/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmyktorgb;

/**
 *
 * @author DELL
 */
public class CMYKtoRGB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        
        double white, red, green, blue;
        white = 1 - k;
        red = (255*white) * (1-c);
        green = (255*white) * (1-m);
        blue = (255*white) * (1-y);
        
        System.out.println("red   = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue  = " + Math.round(blue));
    }
    
}
