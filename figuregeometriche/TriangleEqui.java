
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
    public void setLengthSide(int length){
        super.setLengthSides(length, 0);
    }
    
      /**
     * Get the perimeter ot the equilateral triangle
     * @return perimeter
     */
    @Override
    public int getPerimeter(){
        return super.getLengthSide(0) * Triangle.NSIDES;
    }
    
    public TriangleEqui (int x, int y){
        super(x, y, true);
    }
    
}
