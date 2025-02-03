package model;

import java.util.Objects;

public class Carnivoro extends Animal {
    private String tipoCarne;

    public Carnivoro(String especie, int edad, String nombre, String tipoCarne) {
        super(especie, edad, nombre);
        this.tipoCarne = tipoCarne;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivoro carnivoro = (Carnivoro) o;
        return Objects.equals(tipoCarne, carnivoro.tipoCarne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCarne);
    }

    @Override
    public String toString() {
        return "Carnivoro{" +
                "tipoCarne='" + tipoCarne + '\'' +
                '}';
    }
}
