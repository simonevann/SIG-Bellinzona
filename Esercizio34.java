
package Esercizio34;

import static java.lang.Math.pow;

/**
 *
 * @author Simone
 * 
 */

public class Esercizio34 {
    
    public static byte getNumberElementsArray( double a, double b, double c ){
    
        double delta = 0.0;
        delta = pow(b,2) - (a*c);
        
        if (delta > 0){
            return 2;
        }else if(delta == 0){
            return 1; 
        }else if(delta < 0){
            return 0;        
        }
        
        return -1;
        
    }
    
    
    public static double[] solveEqSec( double a, double b, double c, double ris[] ){
    
        double delta = sqrt​((pow(b,2) - (a*c)));
        double divis = 2 * a;
        ris[0] = Double.NaN;
        ris[0] = Double.NaN;
        
        if(ris.length >= 1 ){
            ris[0] = (( -1 * b) + delta) / divis;        
        }
        if(ris.length == 2){
            ris[1] = (( -1 * b) - delta) / divis;
        }
        
        return ris;
    
    }

    
    public static void main(String[] args) {
        
        double a = 3;
        double b = -15;        
        double c = 12; 
        byte range = getNumberElementsArray( a, b, c );
        
        if( range > 0 ){
            double[] ris = new double[range];
            ris = solveEqSec( a, b, c, ris );
            
            for (int i = 0; i < ris.length; i++) {
                System.out.format("Il risultato %d è %f\n", (i + 1), ris[i]);
            }
        } else {
            System.out.format("L'equazione non ha risultati");       
        }
        
    }
    
}
