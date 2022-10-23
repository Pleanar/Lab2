package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {
    public Moonblast()
    {
        super(Type.FAIRY, 95, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Moonblast";
    }
}