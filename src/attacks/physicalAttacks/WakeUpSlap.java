package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap()
    {
        super(Type.FIGHTING,70,100);
    }

    @Override
    protected String describe() {
        return "применяет WakeUpSlap";
    }
}