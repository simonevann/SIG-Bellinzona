
package figuregeometriche;

/**
 * Definition of an equilateral triangle
 * @author Simone Vannucci
 */
public class TriangleEqui extends Triangle{
    
    public static boolean EQUILATERAL = true; //Is equilateral
    
      /**
     * Set the equilateral triangle sides length
     * @param length of the side
     */
    public void setLengthSide(double length) throws InvalidNumberOfSideException{
        super.setLengthSides(length, 0);
    }
    
      /**
     * Get the perimeter ot the equilateral triangle
     * @return perimeter
     */
    @Override
    public double getPerimeter(){
        return super.getLengthSide(0) * Triangle.NSIDES;
    }
    
    /**
     * Crating an equilateral triangle
     * @param x position
     * @param y position
     * @throws InvalidNumberOfSideException 
     */
    public TriangleEqui (int x, int y) throws InvalidNumberOfSideException{
        super(x, y, true);
    }
    
    /**
     * Crating an equilateral triangle
     * @param x position
     * @param y position
     * @param length lenght of the sides
     * @throws InvalidNumberOfSideException 
     */
    public TriangleEqui (int x, int y, double lenght) throws InvalidNumberOfSideException{
        this(x, y);
        this.setLengthSide(lenght);
    }
    
}
