package pokemons;

import attacks.physicalAttacks.WakeUpSlap;
import attacks.specialAttacks.FocusBlast;
import attacks.statusAttacks.WorkUp;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Makuhita extends Pokemon{
    public Makuhita(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(72,60,30,20,30,25);
        this.setType(Type.FIGHTING);
        this.setMove(new WakeUpSlap() , new FocusBlast() , new WorkUp());

    }
}