package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch()
    {
        super(Type.DARK,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.2).stat(Stat.DEFENSE, -1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Crunch";
    }
}