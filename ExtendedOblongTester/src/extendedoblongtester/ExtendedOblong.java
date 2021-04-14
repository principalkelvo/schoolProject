/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendedoblongtester;


public class ExtendedOblong extends Oblong {
    private char symbol;
    public ExtendedOblong(double lengthIn, double heightIn,char symbolIn) {
        super(lengthIn, heightIn);
        symbol= symbolIn;
    }
    public void setSymbol(char symbolIn){
        symbol= symbolIn;
    }
    public String draw(){
        String s= new String();//start off with an empty string
        int l,h;
        /*in the next two lines we type cast from double to integre so that we 
        are able to count how many times we print the symbol*/
        l= (int)getLength();
        h= (int)getHeight();
        for(int i=1;i<=h;i++){
            for(int j=1;j<=l;j++){
                s= s+symbol;//add the symbol to the string
            }
            s= s+ '\n';//add the <NEWLINE> character
        }
        return s;//return the string representation
    }
}
