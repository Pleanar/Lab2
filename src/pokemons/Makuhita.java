package pokemons;
import ru.ifmo.se.pokemon.*;

public class Makuhita extends Pokemon{
    public Makuhita(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(72,60,30,20,30,25);
        this.setType(Type.FIGHTING);
        this.setMove(new WakeUpSlap() , new FocusBlast() , new WorkUp());

    }
}