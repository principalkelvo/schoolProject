/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getallsubstringsofastring;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class GetAllSubStringsOfAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str="abbc";
        System.out.println("All substring of abbc are: ");
        for(int i=0; i<=str.length();i++){
            for(int j=i+1; j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    
}
