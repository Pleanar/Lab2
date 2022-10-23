package pokemons;

import attacks.physicalAttacks.Crunch;
import attacks.specialAttacks.DarkPulse;
import attacks.specialAttacks.ShockWave;
import attacks.statusAttacks.Agility;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Thundurus extends Pokemon{
    public Thundurus(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(72,60,30,20,30,25);
        this.setType(Type.FLYING , Type.ELECTRIC );
        this.setMove(new Agility() ,new DarkPulse(),new ShockWave(),new Crunch());
    }
}