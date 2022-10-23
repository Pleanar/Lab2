package Pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Clefable extends Pokemon {
    public Clefable(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(95,70,73,95,90,60);
        this.setType(Type.FAIRY);
        this.setMove(new Swagger() , new Moonblast() , new ShadowBall());

    }
}