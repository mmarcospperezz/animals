package components.random;
import components.Reader;
import model.*;
import java.util.Random;

public class RandomZooReader implements Reader<Zoo> {
    private final Random random;
    private final Reader<Cercado<Carnivoro>> carnivoroCercadoReader;
    private final Reader<Cercado<Herbivoro>> herbivoroCercadoReader;
    private final Reader<Cercado<Animal>> animalCercadoReader;

    public RandomZooReader(Random random, Reader<Cercado<Carnivoro>> carnivoroCercadoReader, Reader<Cercado<Herbivoro>> herbivoroCercadoReader, Reader<Cercado<Animal>> animalCercadoReader) {
        this.random = random;
        this.carnivoroCercadoReader = carnivoroCercadoReader;
        this.herbivoroCercadoReader = herbivoroCercadoReader;
        this.animalCercadoReader = animalCercadoReader;
    }

    private final static String[] NAMES = {
            "Zoo de Madrid", "Zoo de Barcelona", "Zoo de Valencia", "Zoo de Sevilla", "Zoo de Bilbao"
    };

    @Override
    public Zoo read() {
        return new Zoo(
                NAMES[random.nextInt(NAMES.length)],
                carnivoroCercadoReader.read(),
                herbivoroCercadoReader.read(),
                animalCercadoReader.read()

        );
    }
}
