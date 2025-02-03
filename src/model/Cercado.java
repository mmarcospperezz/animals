package model;

import java.util.Arrays;
import java.util.Objects;

public class Cercado<T extends Animal> {
    private int numCercado;
    private T[] animales;

    public Cercado(int numCercado, T[] animales) {
        this.numCercado = numCercado;
        this.animales = animales;
    }

    public int getNumCercado() {
        return numCercado;
    }

    public void setNumCercado(int numCercado) {
        this.numCercado = numCercado;
    }

    public T[] getAnimales() {
        return animales;
    }

    public void setAnimales(T[] animales) {
        this.animales = animales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cercado cercado = (Cercado) o;
        return numCercado == cercado.numCercado && Objects.deepEquals(animales, cercado.animales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCercado, Arrays.hashCode(animales));
    }

    @Override
    public String toString() {
        return "Cercado{" +
                "numCercado=" + numCercado +
                ", animales=" + Arrays.toString(animales) +
                '}';
    }
}
