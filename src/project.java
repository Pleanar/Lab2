import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class project {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Thundurus("Птица Феникс",100);
        Pokemon p2 = new Makuhita("Абелева полугруппа", 100);
        Pokemon p3 = new Hariyama("Злой второкурсник", 100);
        Pokemon p4 = new Cleffa("Евангелион", 100);
        Pokemon p5 = new Clefairy("Ктостер лимонойд", 100);
        Pokemon p6 = new Clefable("Паймон", 100);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}
