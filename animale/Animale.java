package animale;

/**
 *
 * @author simone vannucci
 */
public class Animale {

    public static void main(String[] args) {
        Carnivoro faina = new Carnivoro();
        Erbivoro ghiro = new Erbivoro();
        Onnivoro orso = new Onnivoro();
        ghiro.mangiaErba();
        faina.mangiaAnimale(ghiro);
        orso.mangiaErba();
        orso.mangiaAnimale(ghiro);
        
        new Carnivoro().mangiaAnimale(orso);
        
    }
    
}
