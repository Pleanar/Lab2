package Pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Cleffa extends Pokemon{
    public Cleffa(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,25,28,45,55,15);
        this.setType(Type.FAIRY);
        this.setMove(new Swagger() , new ShadowBall());
    }
}