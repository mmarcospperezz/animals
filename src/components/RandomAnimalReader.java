package components;

import model.Animal;

import java.util.Random;

public class RandomAnimalReader implements Reader<Animal> {
    private final static String[] ESPECIES = {
            "Gato", "Perro", "Lobo", "leon", "Pantera", "Elefante"
    };

    private final static String[] NOMBRES = {
            "Pinky", "Toby", "Alfredo", "Chasee", "Skie", "Ápolonia"
    };

    private final Random random;

    public RandomAnimalReader(Random random) {
        this.random = random;
    }

    @Override
    public Animal read() {
        return null;
    }
}

