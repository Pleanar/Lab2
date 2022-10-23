package pokemons;

import attacks.specialAttacks.Moonblast;
public class Clefairy extends Cleffa{
    public Clefairy(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(70,45,48,60,65,35);
        this.addMove(new Moonblast());

    }
}