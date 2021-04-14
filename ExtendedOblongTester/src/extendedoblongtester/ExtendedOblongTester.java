/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendedoblongtester;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class ExtendedOblongTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("please input symbol: ");
        char symbol= keyboard.next().charAt(0);
        ExtendedOblong extOblong= new ExtendedOblong(10.2,5.3,symbol);
        System.out.println(extOblong.draw());
        System.out.print("please input another symbol: ");
        char newSymbol= keyboard.next().charAt(0);
        extOblong.setSymbol(newSymbol);
        extOblong.setHeight(3);
        extOblong.setLength(6.9);
        System.out.println(extOblong.draw());
    }
    
}
