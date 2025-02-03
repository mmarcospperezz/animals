package model;

import java.util.Objects;

public abstract class Animal {
    protected   String especie;
    protected   int edad;
    protected String nombre;

    public Animal(String especie, int edad, String nombre) {
        this.especie = especie;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && Objects.equals(especie, animal.especie) && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, edad, nombre);
    }
}
