
package figuregeometriche;

/**
 * Definition of a square
 * @author Simone Vannucci
 */
public class Square extends Polygon{
    
    public static int NSIDES = 4; //Number of side in  square
    public static boolean EQUILATERAL = true; //Is equilateral
    
    /**
     * Set the square sides length
     * @param length of the side
     */
    public void setLengthSide(double length) throws InvalidNumberOfSideException{
        super.setLengthSides(length, 0);
    }
    
    /**
     * Overriding the setLengthSides in Polygon class to mantain all sides equal
     * @param length
     * @param i
     * @throws InvalidNumberOfSideException 
     */
    @Override
    public void setLengthSides(double length, int i) throws InvalidNumberOfSideException {
        this.setLengthSide(length);
    }
    
    /**
     * Get the perimeter ot the square
     * @return perimeter
     */
    @Override
    public double getPerimeter(){
        return super.getLengthSide(0) * Square.NSIDES;
    }
    
    /**
     * Crating a square
     * @param x position
     * @param y position
     * @throws InvalidNumberOfSideException 
     */
    public Square(int x, int y) throws InvalidNumberOfSideException{
        super(x, y, Square.NSIDES, Square.EQUILATERAL);
    }
    
    /**
     * Crating a square
     * @param x position
     * @param y position
     * @param length lenght of the sides
     * @throws InvalidNumberOfSideException 
     */
    public Square(int x, int y, double length) throws InvalidNumberOfSideException{
        super(x, y, Square.NSIDES, length);
    } 
       
}
