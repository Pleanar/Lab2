package pokemons;

import attacks.specialAttacks.Moonblast;
import attacks.specialAttacks.ShadowBall;
import attacks.statusAttacks.Swagger;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Pokemon{
    public Clefairy(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(70,45,48,60,65,35);
        this.setType(Type.FAIRY);
        this.setMove(new Swagger() , new Moonblast() , new ShadowBall());

    }
}