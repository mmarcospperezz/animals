package components.random;

import components.Reader;
import model.Herbivoro;

import java.util.Random;

public class RandomHerbivoroReader implements Reader<Herbivoro> {
    private final static String[] ESPECIES = {
            "Gato", "Perro", "Lobo", "leon", "Pantera", "Elefante"
    };

    private final static String[] NOMBRES = {
            "Pinky", "Toby", "Alfredo", "Chasee", "Skie", "Ápolonia"
    };

    private final static String[] CONJPLANTAS = {
            "Flores", "Hierba", "Pasto", "Verduras"
    };
    private final Random random;

    public RandomHerbivoroReader(Random random) {
        this.random = random;
    }

    @Override
    public Herbivoro read() {
        return new Herbivoro(
                ESPECIES[random.nextInt(ESPECIES.length)],
                random.nextInt(20),
                NOMBRES[random.nextInt(NOMBRES.length)],
                CONJPLANTAS[random.nextInt(CONJPLANTAS.length)]
        );
    }
}
