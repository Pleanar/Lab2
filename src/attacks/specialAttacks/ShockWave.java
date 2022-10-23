package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class ShockWave extends SpecialMove {
    public ShockWave()
    {
        super(Type.ELECTRIC, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().attack(1.0).turns(0);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет ShockWave";
    }
}