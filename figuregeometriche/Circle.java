package figuregeometriche;

/**
 * Definition of a circle
 * @author simon
 */
public class Circle extends Shape {
    
    private int radius; //radius value
    
    /**
     * Get radius value
     * @return radius
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * Get the diameter
     * @return diameter
     */
    public int getDiameter(){
        return this.getRadius() * 2;
    }
    
    /**
     * Set the radius
     * @param radius 
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    /**
     * Get the perimeter of the shape
     * @return perimeter
     */
    public float getPerimeter(){
        return (float) (this.getDiameter() * Math.PI);
    }
    
    public Circle(int x, int y, int r){
        super(x,y);
        this.setRadius(radius);
    }
    
}
