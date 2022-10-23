package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class ShockWave extends SpecialMove {
    public ShockWave()
    {
        super(Type.ELECTRIC, 60, 100);
    }

    @Override
    protected String describe() {
        return "применяет ShockWave";
    }
}