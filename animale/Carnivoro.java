package animale;

/**
 * Cranivouros
 * @author simon
 */
public class Carnivoro extends Animale implements ICarnivoro {

    @Override
    public void mangiaAnimale(Animale a) {
        if( !(a instanceof Erbivoro)) throw new EatOnlyVegan("Hai provato a mangiare un carnivoro");
    }
      
}
