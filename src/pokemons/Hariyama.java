package pokemons;

import attacks.physicalAttacks.StoneEdge;

public class Hariyama extends Makuhita{
    public Hariyama(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(144,120,60,40,60,50);
        this.addMove(new StoneEdge());
    }
}