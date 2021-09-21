package figuregeometriche;

/**
 * Definition of a basic polygon
 * @author simon
 */
public class Polygon extends Shape{
    
    private int sides; //Number of the sides
    private double[] lengthSides; //Lenghts of the sides
    private boolean equilateral = false; //If the shape is equilateral
    
    /**
     * Set number of sides
     * @param sides 
     */
    private void setSides(int sides) {
        this.sides = sides;
    }
    
    /**
     * Set the lenght of the sides.
     * If is an equilateral shape, set all sides equal to the first side
     * @param lenghtSides 
     * @throws InvalidNumberOfSideException if the number of items in the array are greater than the number of side
     */
    public void setLengthSides(double[] lenghtSides) throws InvalidNumberOfSideException {
        if(lenghtSides.length > this.sides){
            throw new InvalidNumberOfSideException();
        } else {
            if (this.isEquilateral()) {
                this.setEquilateralSides(lenghtSides[0]);
            } else {
                this.lengthSides = lenghtSides;
            }
        }
    }

      /**
     * Set the lenght of one side
     * If is an equilateral shape, set all sides equal to the inserted side
     * @param lenghtSides 
     * @throws InvalidNumberOfSideException if the index i is greater than the number of side
     */
    public void setLengthSides(double length, int i) throws InvalidNumberOfSideException{
        if( i > this.sides  - 1){
            throw new InvalidNumberOfSideException();
        } else {
            if (this.isEquilateral()) {
               this.setEquilateralSides(length);
            } else {
               double[] sides = this.getLengthSides();
               sides[i] = length;
               this.setLengthSides(sides);
            }       
        }
    }
    
    /**
     * Set if the shape is equilateral or not
     * @param equilateral 
     */
    public void setEquilateral(boolean equilateral) {
        this.equilateral = equilateral;
    }
    
    /**
     * Get if the shape is equilateral or not
     * @return 
     */
    public boolean isEquilateral() {
        return equilateral;
    }
    
    /**
     * Get number of sides
     * @return 
     */
    public int getSides() {
        return sides;
    }
    
    /**
     * Get the sigle legths of sides
     * @return 
     */
    public double[] getLengthSides() {
        return lengthSides;
    }
    
    /**
     * Set side length if in the caso of equilaterla shape
     * @param length 
     */
    private void setEquilateralSides(double length){
        for (int i = 0; i < this.getSides(); i++) {
            this.lengthSides[i] = length;
        }
    }
    
    /**
     * Get the length of a particular side
     * @param iof side
     * @return lenght
     */
    public double getLengthSide(int i){
        return this.getLengthSides()[i];
    }
    
    /**
     * Get the perimeter of the shape
     * @return 
     */
    public double getPerimeter(){
        int perimeter = 0;
        for (int i = 0; i < this.getSides(); i++) {
            perimeter += this.getLengthSide(i);
        }
        return perimeter;
    }
    
    /**
     * Creating a polygon
     * @param x position
     * @param y position
     * @param sides number of sides 
     */
    public Polygon(int x, int y, int sides) throws InvalidNumberOfSideException{
        super(x,y);
        if (sides < 3) throw new InvalidNumberOfSideException();
        this.lengthSides = new double[sides];
        this.setSides(sides);
    }
    
    /**
     * Creating a polygon
     * @param x position
     * @param y position
     * @param sides number of sides 
     * @param sideLenghts array with the lenghts of the sides
     * @throws InvalidNumberOfSideException 
     */
    public Polygon(int x, int y, int sides, double[] sideLenghts) throws InvalidNumberOfSideException{
        this(x, y, sides);
        this.setLengthSides(sideLenghts);
    }
   
    /**
     * Creating a polygon
     * @param x position
     * @param y position
     * @param sides number of sides 
     * @param equi is equilateral
     * @throws InvalidNumberOfSideException 
     */
    public Polygon(int x, int y, int sides, boolean equi) throws InvalidNumberOfSideException{
        this(x, y, sides);
        this.setEquilateral(equi);
    }
    
    /**
     * Creating an equilateral polygon
     * @param x position
     * @param y position
     * @param sides number of sides 
     * @param sideLength lenght of the sides
     * @throws InvalidNumberOfSideException 
     */
     public Polygon(int x, int y, int sides, double sideLength) throws InvalidNumberOfSideException{
        this(x, y, sides, true);
        this.lengthSides = new double[sides];
        this.setEquilateralSides(sideLength);
    }
    
}
