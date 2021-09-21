package figuregeometriche;

/**
 * Definition of a basic polygon
 * @author simon
 */
public class Polygon extends Shape{
    
    private int sides; //Numeber of the sides
    private int[] lengthSides; //Lenghts of the sides
    private boolean equilateral = false; //If the shape is equilateral
    
    /**
     * Set number of sides
     * @param sides 
     */
    private void setSides(int sides) {
        this.sides = sides;
    }
    
    /**
     * Set the lenght of the sides
     * @param lenghtSides 
     */
    public void setLengthSides(int[] lenghtSides) {
        if(lenghtSides.length > this.sides){
            System.out.println("Error: values exeeds the number of sides of the polygon");
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
     * @param lenghtSides 
     */
    public void setLengthSides(int length, int i){
        if( i > this.sides  - 1){
            System.out.println("Error: index " + i + " exeed the number of sides of the polygon");
        } else {
            if (this.isEquilateral()) {
               this.setEquilateralSides(length);
            } else {
               int[] sides = this.getLengthSides();
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
    public int[] getLengthSides() {
        return lengthSides;
    }
    
    /**
     * Set side length if in the caso of equilaterla shape
     * @param length 
     */
    private void setEquilateralSides(int length){
        for (int i = 0; i < this.getSides(); i++) {
            this.lengthSides[i] = length;
        }
    }
    
    /**
     * Get the length of a particular side
     * @param iof side
     * @return lenght
     */
    public int getLengthSide(int i){
        return this.getLengthSides()[i];
    }
    
    /**
     * Get the perimeter of the shape
     * @return 
     */
    public int getPerimeter(){
        int perimeter = 0;
        for (int i = 0; i < this.getSides(); i++) {
            perimeter += this.getLengthSide(i);
        }
        return perimeter;
    }
    
    public Polygon(int x, int y, int sides){
        super(x,y);
        this.lengthSides = new int[sides];
        this.setSides(sides);
    }
    
    public Polygon(int x, int y, int sides, boolean equilateral){
        super(x,y);
        this.setEquilateral(equilateral);
        this.lengthSides = new int[sides];
        this.setSides(sides);
    }
    
}
