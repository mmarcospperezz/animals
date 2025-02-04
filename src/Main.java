import components.random.*;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomCarnivoroReader randomCarnivoroReader = new RandomCarnivoroReader(random);
        RandomHerbivoroReader randomHerbivoroReader = new RandomHerbivoroReader(random);
        RandomAnimalReader randomAnimalReader = new RandomAnimalReader(randomCarnivoroReader,randomHerbivoroReader,random);

        var animalCercadoReader = new RandomCercadoReader<>(
                random,
                randomAnimalReader
        );

        var herbivoroCercadoReader = new RandomCercadoReader<>(
                random,
                randomHerbivoroReader
        );

        var carnivoroCercadoReader = new RandomCercadoReader<>(
                random,
                randomCarnivoroReader
        );

        var zooReader = new RandomZooReader(
              random,
                carnivoroCercadoReader,
                herbivoroCercadoReader,
                animalCercadoReader
        );

        var zoo = zooReader.read();
        zoo.showInfo();

    }
    }
