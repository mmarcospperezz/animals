package components.random;

import components.Reader;
import model.Animal;
import model.Carnivoro;
import model.Herbivoro;

import java.util.Random;

public class RandomAnimalReader implements Reader<Animal> {
    private final Reader<Carnivoro> carnivoroReader;
    private final Reader<Herbivoro> herbivoroReader;
    private final Random random;

    public RandomAnimalReader(Reader<Carnivoro> carnivoroReader, Reader<Herbivoro> herbivoroReader, Random random) {
        this.carnivoroReader = carnivoroReader;
        this.herbivoroReader = herbivoroReader;
        this.random = random;
    }

    @Override
    public Animal read() {
        int animalType = random.nextInt(2);
        if(animalType == 0){
             return carnivoroReader.read();
        } else{
            return herbivoroReader.read();
        }
    }
}

