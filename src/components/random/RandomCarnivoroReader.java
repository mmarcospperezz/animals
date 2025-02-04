package components.random;

import components.Reader;
import model.Carnivoro;

import java.util.Random;

public class RandomCarnivoroReader implements Reader<Carnivoro> {

    private final static String[] ESPECIES = {
            "Gato", "Perro", "Lobo", "leon", "Pantera", "Elefante"
    };

    private final static String[] NOMBRES = {
            "Pinky", "Toby", "Alfredo", "Chasee", "Skie", "Ápolonia"
    };

    private final static String[] TIPODECARNE = {
            "Blanca", "De cerdo", "De vacuno", "De ave"
    };
    private final Random random;

    public RandomCarnivoroReader(Random random) {
        this.random = random;
    }

    @Override
    public Carnivoro read() {
        return new Carnivoro(
                ESPECIES[random.nextInt(ESPECIES.length)],
                random.nextInt(20),
                NOMBRES[random.nextInt(NOMBRES.length)],
                TIPODECARNE[random.nextInt(TIPODECARNE.length)]
            );

    }
}
