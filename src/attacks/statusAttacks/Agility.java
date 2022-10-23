package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public Agility()
    {
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.SPEED, 2);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Agility";
    }
}