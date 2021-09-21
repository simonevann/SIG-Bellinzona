
package figuregeometriche;

/**
 * Definition of a triangle
 * @author Simone Vannucci
 */
public class Triangle extends Polygon{

    public static int NSIDES = 3; //Number of side in  triangle
    
    public Triangle (int x, int y){
        super(x, y, Triangle.NSIDES);
    }
        
    public Triangle (int x, int y, boolean equilateral){
        super(x, y, Triangle.NSIDES, equilateral);
    }
    
}
