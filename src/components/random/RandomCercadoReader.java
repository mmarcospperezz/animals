package components.random;

import components.Reader;
import model.Animal;
import model.Cercado;

import java.util.Random;

public class RandomCercadoReader <T extends Animal> implements Reader<Cercado<T>> {
    private final Random random;
    private final Reader<T> animalReader;

    public RandomCercadoReader(Random random, Reader<T> animalReader) {
        this.random = random;
        this.animalReader = animalReader;
    }

    public Cercado<T> read(){
        int number = random.nextInt(100);
        T[] animals =  (T[]) new Animal[random.nextInt(1, 50)];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalReader.read();
        }

        return new Cercado<>(
                number,
                animals
        );
        }
}
