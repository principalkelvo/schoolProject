/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findcost;

/**
 *
 * @author KELVO FRAYAY
 */
public class FindCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price,tax;
        price = 500;
        tax = 17.5;
        price = price*(1+tax/100);
        System.out.println("Cost = "+price);
        // TODO code application logic here
    }
    
}
