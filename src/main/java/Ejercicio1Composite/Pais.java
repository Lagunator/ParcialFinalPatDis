package Ejercicio1Composite;

public abstract class Pais {
    private String nombre;
    private int numHabitantes;
    private boolean ultimo;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }

    public abstract String showInfo();
    public abstract void calcularHabitantes();
    public abstract void remove(Pais component);
    public abstract void add(Pais component);
}
