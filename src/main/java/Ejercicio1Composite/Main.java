package Ejercicio1Composite;

public class Main {
    public static void main(String[] args) {
        Zona zona1 = new Zona("Sur", true, 400);
        Zona zona2 = new Zona("Centro", false, 600);
        Zona zona3 = new Zona("Norte", true, 60);
        Zona zona4 = new Zona("Este", false, 30);


        Composite urbanizacionAAA = new Composite("urbanizacionAAA");
        Composite urbanizacionBBB = new Composite("urbanizacionBBB");

        urbanizacionAAA.add(zona1);
        urbanizacionBBB.add(zona3);
        urbanizacionAAA.add(zona2);
        urbanizacionBBB.add(zona4);
        Composite departamento1 = new Composite("Sucre");

        departamento1.add(urbanizacionAAA);
        departamento1.add(urbanizacionBBB);

        departamento1.setUltimo(true);
        departamento1.calcularHabitantes();
        System.out.println("Total de habitantes es: " + Singleton.getInstance().getNumHabitantesGlobal());

    }
}
