package pokemons;

import attacks.physicalAttacks.StoneEdge;
import attacks.physicalAttacks.WakeUpSlap;
import attacks.specialAttacks.FocusBlast;
import attacks.statusAttacks.WorkUp;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hariyama extends Pokemon{
    public Hariyama(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(144,120,60,40,60,50);
        this.setType(Type.FIGHTING);
        this.setMove(new WakeUpSlap() , new FocusBlast() , new WorkUp() , new StoneEdge());
    }
}