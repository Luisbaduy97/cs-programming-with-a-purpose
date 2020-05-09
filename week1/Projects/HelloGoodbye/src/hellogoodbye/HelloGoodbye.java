/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogoodbye;

/**
 *
 * @author DELL
 */
public class HelloGoodbye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = args[0], n2 = args[1];
        
        System.out.println("Hello " + n1 + " and " + n2);
        System.out.println("Goodbye " + n2 + " and " + n1);
    }
    
}
