package figuregeometriche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esercizio ereditarietà
 * @author Simone Vannucci
 */
public class FigureGeometriche {
    
    public static void main(String[] args) {  
        
        //Test quadrato
        Square sq = new Square(122,11);
        System.out.println(sq.getSides());
        try {
            sq.setLengthSide(12.22);
        } catch (InvalidNumberOfSideException ex) {
            Logger.getLogger(FigureGeometriche.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(sq.getPerimeter());
        
        //Test triangolo
        Triangle tr = new Triangle (113,42);
        try {
            tr.setLengthSides(2, 0);
            tr.setLengthSides(10, 1);
            tr.setLengthSides(5, 2);
            tr.setLengthSides(5, 3);
        } catch (InvalidNumberOfSideException ex) {
            Logger.getLogger(FigureGeometriche.class.getName()).log(Level.SEVERE, null, ex);
        }       
        System.out.println(tr.getPerimeter());
        
        //Test triangolo equilatero
        TriangleEqui eq = new TriangleEqui(223,554);
        try {
            eq.setLengthSide(10);
        } catch (InvalidNumberOfSideException ex) {
            Logger.getLogger(FigureGeometriche.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(eq.getPerimeter());
        
    }
    
}
