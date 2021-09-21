package figuregeometriche;

/**
 * Minimum definition of a shape
 * @author Simone Vannucci
 */
public class Shape {
    
    private int coordX, coordY; //Shape position in the space
    
    /**
     * Get horizontal positioning
     * @return X coordinate
     */
    public int getCoordX() {
        return coordX;
    }
    
    /**
     * Get vertical positioning
     * @return Y coordinates
     */
    public int getCoordY() {
        return coordY;
    }
    
   /**
    * Set X positioning
    * @param X coordinate
    */
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }
    
    /**
    * Set Y positioning
    * @param Y coordinate
    */
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
    
    public Shape(int x, int y){
        this.setCoordX(x);
        this.setCoordY(y);
    }
    
}
