package pokemons;

import attacks.specialAttacks.ShadowBall;
import attacks.statusAttacks.Swagger;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon{
    public Cleffa(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,25,28,45,55,15);
        this.setType(Type.FAIRY);
        this.setMove(new Swagger() , new ShadowBall());
    }
}