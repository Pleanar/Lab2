package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge()
    {
        super(Type.ROCK,100,80);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().turns(0).stat(Stat.SPEED, 1);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Crunch";
    }
}