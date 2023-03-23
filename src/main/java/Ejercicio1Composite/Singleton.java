package Ejercicio1Composite;

import java.util.Stack;

public class Singleton {
    private Stack<String> imprimir = new Stack<>();
    private int numHabitantesGlobal = 0;


    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void add(String info) {
        imprimir.push(info);
    }

    public int getStackSize() {
        return imprimir.size();
    }
    public void showInfo() {
        while(!imprimir.isEmpty()) {
            System.out.print(imprimir.pop());
        }
    }
    public int getNumHabitantesGlobal() {
        return numHabitantesGlobal;
    }
    public void setNumHabitantesGlobal(int numHabitantesGlobal) {
        this.numHabitantesGlobal = numHabitantesGlobal;
    }
}
