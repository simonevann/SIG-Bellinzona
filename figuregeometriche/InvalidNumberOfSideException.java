package figuregeometriche;

/**
 * Exeption throwed when user is tryng to manipluate an exixting side of a shape
 * @author Simone Vannucci
 */
public class InvalidNumberOfSideException extends Exception {

    public InvalidNumberOfSideException() {
        System.out.println("Error: values exeeds the number of sides of the polygon");
    }
    
}
