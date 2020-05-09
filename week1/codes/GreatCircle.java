/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class GreatCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
        
        double a = Math.pow(Math.sin((x2-x1)/2), 2);
        double b = Math.cos(x1) * Math.cos(x2)* Math.pow(Math.sin((y2-y1)/2), 2);
        
        double c = 2*r* Math.asin(Math.sqrt(a+b));
        
        System.out.println(c + " kilometers");
    }
    
}
