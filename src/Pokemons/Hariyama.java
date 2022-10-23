package Pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Hariyama extends Pokemon{
    public Hariyama(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(144,120,60,40,60,50);
        this.setType(Type.FIGHTING);
        this.setMove(new WakeUpSlap() , new FocusBlast() , new WorkUp() , new StoneEdge());
    }
}