package figuregeometriche;

/**
 * Esercizio ereditarietà
 * @author Simone Vannucci
 */
public class FigureGeometriche {
    
    public static void main(String[] args) {
        
      //Test
      Square sq = new Square(122,11);
      System.out.println(sq.getSides());
      sq.setLengthSide(12);
      System.out.println(sq.getPerimeter());

      Triangle tr = new Triangle (113,42);
      tr.setLengthSides(2, 0);
      tr.setLengthSides(10, 1);
      tr.setLengthSides(5, 2);
       tr.setLengthSides(5, 3);
      System.out.println(tr.getPerimeter());

      TriangleEqui eq = new TriangleEqui(223,554);
      eq.setLengthSide(10);
      System.out.println(eq.getPerimeter());       
    }
    
}
