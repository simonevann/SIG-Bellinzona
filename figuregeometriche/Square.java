
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
     * Get the perimeter ot the square
     * @return perimeter
     */
    @Override
    public double getPerimeter(){
        return super.getLengthSide(0) * Square.NSIDES;
    }
    
    public Square(int x, int y){
        super(x, y, Square.NSIDES, Square.EQUILATERAL);
    }
}
