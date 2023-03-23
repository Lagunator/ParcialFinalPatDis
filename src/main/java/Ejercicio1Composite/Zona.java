package Ejercicio1Composite;

public class Zona extends Pais{
    private boolean poa;
    public Zona(String nombre, boolean poa, int habitantes) {
        super(nombre);
        setNumHabitantes(habitantes);
        this.poa = poa;
    }

    public boolean isPoa() {
        return poa;
    }

    public void setPoa(boolean poa) {
        this.poa = poa;
    }

    @Override
    public String showInfo() {
        return "\tNombre: " + getNombre() + "\n" + "\tNumero de Habitantes: " + getNumHabitantes() + "\n" + "\tRealizo el POA: " + isPoa() + "\n";
    }

    @Override
    public void add(Pais composite) {}

    @Override
    public void remove(Pais composite) {}

    @Override
    public void calcularHabitantes() {
        Singleton.getInstance().add(this.showInfo());
    }
}
