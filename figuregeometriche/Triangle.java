
package figuregeometriche;

/**
 * Definition of a triangle
 * @author Simone Vannucci
 */
public class Triangle extends Polygon{

    public static int NSIDES = 3; //Number of side in  triangle
    
    /**
     * Crating a triangle
     * @param x position
     * @param y position
     * @throws InvalidNumberOfSideException 
     */
    public Triangle (int x, int y) throws InvalidNumberOfSideException{
        super(x, y, Triangle.NSIDES);
    }
    
    /**
     * Crating a triangle
     * @param x position
     * @param y position
     * @param equilateral is equilateral
     * @throws InvalidNumberOfSideException 
     */
    public Triangle (int x, int y, boolean equilateral) throws InvalidNumberOfSideException{
        super(x, y, Triangle.NSIDES, equilateral);
    }
    
     /**
     * Crating a triangle
     * @param x position
     * @param y position
     * @param sideLengths array with the lenghts of the sides
     * @throws InvalidNumberOfSideException 
     */
    public Triangle (int x, int y, double sidesideLenghtA, double sidesideLenghtB, double sidesideLenghtC) throws InvalidNumberOfSideException{      
        super(x, y, new double[] { sidesideLenghtA, sidesideLenghtB, sidesideLenghtC });
    }
    
}
