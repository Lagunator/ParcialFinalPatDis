package Ejercicio1Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Pais {
    List<Pais> compositeList = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public String showInfo() {
        return "Nombre: " + getNombre() + "\n" + "Numero de Habitantes: " + getNumHabitantes() + "\n";
    }
    @Override
    public void add(Pais component) {
        compositeList.add(component);
    }

    @Override
    public void remove(Pais component) {
        compositeList.remove(component);
    }

    @Override
    public void calcularHabitantes() {
        for (Pais pais:compositeList) {
            pais.calcularHabitantes();
            this.setNumHabitantes(this.getNumHabitantes() + pais.getNumHabitantes());
        }
        Singleton.getInstance().add(this.showInfo());
        if (isUltimo()){
            Singleton.getInstance().showInfo();
            Singleton.getInstance().setNumHabitantesGlobal(Singleton.getInstance().getNumHabitantesGlobal()+this.getNumHabitantes());
        }
    }
}
