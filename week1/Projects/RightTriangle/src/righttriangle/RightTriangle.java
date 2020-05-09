/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package righttriangle;

/**
 *
 * @author DELL
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(args[0]), a2 = a*a;
        int b = Integer.parseInt(args[1]), b2 = b*b;
        int c = Integer.parseInt(args[2]), c2 = c*c;
        
        boolean co1 = c2 == a2+b2, co2 = a2 == c2+b2, co3 = b2 == c2+a2;
        boolean f = co1||co2||co3, i = a>0 && b>0&& c>0;
        boolean fin = f && i;
        System.out.println(fin);
    }
    
}
