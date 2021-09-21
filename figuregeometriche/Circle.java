package figuregeometriche;

/**
 * Definition of a circle
 * @author simon
 */
public class Circle extends Shape {
    
    private double radius; //radius value
    
    /**
     * Get radius value
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Get the diameter
     * @return diameter
     */
    public double getDiameter(){
        return this.getRadius() * 2;
    }
    
    /**
     * Set the radius
     * @param radius 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Get the perimeter of the shape
     * @return perimeter
     */
    public double getPerimeter(){
        return this.getDiameter() * Math.PI;
    }
    
    public Circle(int x, int y, double r){
        super(x,y);
        this.setRadius(radius);
    }
    
}
