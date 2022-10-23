package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse()
    {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = (new Effect().chance(0.2)).attack(0.0).turns((int)(Math.random() * 4.0 + 1.0));
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет DarkPulse";
    }
}