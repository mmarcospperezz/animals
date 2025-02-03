package model;

import java.util.Objects;

public class Zoo {
    private String nombre;
    private Cercado<Carnivoro> cercadoCarn;
    private Cercado<Herbivoro> cercadoHerb;
    private Cercado<Animal> cercadoTodos;

    public Zoo(String nombre, Cercado<Carnivoro> cercadoCarn, Cercado<Herbivoro> cercadoHerb, Cercado<Animal> cercadoTodos) {
        this.nombre = nombre;
        this.cercadoCarn = cercadoCarn;
        this.cercadoHerb = cercadoHerb;
        this.cercadoTodos = cercadoTodos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cercado<Carnivoro> getCercadoCarn() {
        return cercadoCarn;
    }

    public void setCercadoCarn(Cercado<Carnivoro> cercadoCarn) {
        this.cercadoCarn = cercadoCarn;
    }

    public Cercado<Herbivoro> getCercadoHerb() {
        return cercadoHerb;
    }

    public void setCercadoHerb(Cercado<Herbivoro> cercadoHerb) {
        this.cercadoHerb = cercadoHerb;
    }

    public Cercado<Animal> getCercadoTodos() {
        return cercadoTodos;
    }

    public void setCercadoTodos(Cercado<Animal> cercadoTodos) {
        this.cercadoTodos = cercadoTodos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(nombre, zoo.nombre) && Objects.equals(cercadoCarn, zoo.cercadoCarn) && Objects.equals(cercadoHerb, zoo.cercadoHerb) && Objects.equals(cercadoTodos, zoo.cercadoTodos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cercadoCarn, cercadoHerb, cercadoTodos);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nombre='" + nombre + '\'' +
                ", cercadoCarn=" + cercadoCarn +
                ", cercadoHerb=" + cercadoHerb +
                ", cercadoTodos=" + cercadoTodos +
                '}';
    }
}
