package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Status.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap()
    {
        super(Type.FIGHTING,70,100);
    }

    @Override
    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        boolean b = var2.getCondition() == SLEEP;
        if (b) {
            Effect effect = new Effect().condition(NORMAL);
            var2.setCondition(effect);
            return (0.4 * (double)var1.getLevel() + 2.0) * this.power / 150.0 * 2;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "применяет WakeUpSlap";
    }
}