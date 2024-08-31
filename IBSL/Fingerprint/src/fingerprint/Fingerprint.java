/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprint;

/**
 *
 * @author Dave
 */
import java.util.*;
public class Fingerprint {

    /**
     * @param args the command line arguments
     */
    static Scanner all = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter name: ");
        String name = all.nextLine();
        
        if (name.equalsIgnoreCase("dave"))
        {
            System.out.println("Hi There");
        }
        else
        {
            System.out.println("bye");
        }
    }
}
