package model;

import java.util.Objects;

public class Herbivoro extends Animal {
    private String conjPlantas;

    public Herbivoro(String especie, int edad, String nombre, String conjPlantas) {
        super(especie, edad, nombre);
        this.conjPlantas = conjPlantas;
    }

    public String getConjPlantas() {
        return conjPlantas;
    }

    public void setConjPlantas(String conjPlantas) {
        this.conjPlantas = conjPlantas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivoro herbivoro = (Herbivoro) o;
        return Objects.equals(conjPlantas, herbivoro.conjPlantas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conjPlantas);
    }

    @Override
    public String toString() {
        return "Herbivoro{" +
                "conjPlantas='" + conjPlantas + '\'' +
                '}';
    }
}
