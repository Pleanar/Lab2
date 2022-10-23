package Pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Clefairy extends Pokemon{
    public Clefairy(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(70,45,48,60,65,35);
        this.setType(Type.FAIRY);
        this.setMove(new Swagger() , new Moonblast() , new ShadowBall());

    }
}