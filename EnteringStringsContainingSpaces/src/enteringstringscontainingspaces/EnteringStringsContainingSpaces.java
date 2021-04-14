/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteringstringscontainingspaces;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class EnteringStringsContainingSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d;
        int i;
        String s;
        Scanner keyboardString= new Scanner(System.in);//scanner object for string input
        Scanner keyboard = new Scanner (System.in);//scanner object for all other types
        System.out.println("Enter a double");
        d=keyboard.nextDouble();
        System.out.println("Enter an integer");
        i= keyboard.nextInt();
        System.out.println("Enter a string");
        s=keyboardString.nextLine();//use the scanner object reserved for string input
        System.out.println();
        System.out.println("You entered: ");
        System.out.println("Double: "+d);
        System.out.println("Integer: "+i);
        System.out.println("String: "+s);
        
    }
    
}
