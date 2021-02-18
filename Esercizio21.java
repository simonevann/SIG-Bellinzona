
package Esercizio21;

import java.util.Scanner;

/**
 *
 * @author Simone
 *
 */

public class Esercizio21 {
    
    public static String askUser() {
        
        Scanner in = new Scanner(System.in);
            
        return in.nextLine().trim();

    }
    
    public static Boolean isInt(String num) {
        
        if ( (num.length() >= 2 && num.charAt(0) == '+' || 
              num.charAt(0) == '-') || 
              Character.isDigit(num.charAt(0)) == true  ) {

            for (int i = 1; i < num.length(); i++) {

                if ( Character.isDigit(num.charAt(i)) == false  ) {            
                    return false;
                }

            }
        }
        
        return true;
      
    }
    
    public static Boolean isDouble(String num) {
        
        boolean comma = false;
        boolean e = false;
        
        if ( (num.length() >= 2 && num.charAt(0) == '+' || 
              num.charAt(0) == '-') || 
              (Character.isDigit(num.charAt(0)) == true && 
               Character.isDigit(num.charAt(num.length()-1)) == true )) {
    
            for (int i = 1; i < num.length()-1; i++) {

                if ( Character.isDigit(num.charAt(i)) == false  ) {
                    
                    if ( !comma && num.charAt(i) == '.') {               
                        comma = true;              
                    } else if ((!e && num.charAt(i) == 'e')) {
                        e = true;
                    } else {
                        return false;               
                    }
                    
                }

            }
            
        }
        
        return true;
   
    }
    
    public static Boolean isScient(String num) {
        
        if ( Character.isDigit(num.charAt(0)) == true && 
             Character.isDigit(num.charAt(num.length()-1)) == true ) {
    
            for (int i = 1; i < num.length()-1; i++) {

                if ( num.charAt(i) == 'e' ) {    
                    return true;               
                }

            }
            
        }
        
        return false;
   
    }
    
      
    public static void main(String[] args) {

        String primo, secondo; 
        int priInt = 0;
        double secInt = 0;
        
        do{
        
            System.out.println("Inserisci un numero intero:");        
            primo = askUser().toLowerCase();

            if ( isInt(primo) ) {
                priInt = Integer.valueOf(primo);
            } else {
                System.out.println("Valore errato");
            }            
        
        } while( !isInt(primo) );
        
        Integer priIntFloat = new Integer(priInt);
        System.out.println( "" + priIntFloat.floatValue() );
        
        do{
        
            System.out.println("Inserisci un numero double:");        
            secondo = askUser();

            if ( isDouble(secondo) ) {
                secInt = Double.valueOf(primo);
                
                if ( isScient(secondo) ){
                    System.out.println("Hai usato la notazione scientifica.");
                } else {               
                    System.out.println("Non hai usato la notazione scientifica.");                
                }
                
            } else {
                System.out.println("Valore errato");
            }            
        
        } while( !isDouble(secondo) );   
        
    }
    
}
