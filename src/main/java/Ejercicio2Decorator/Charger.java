package Ejercicio2Decorator;

public class Charger extends Fun {
    private int costo;
    private String marca;
    private int tamano;

    public Charger(IPhone celularBase, int costo, String marca, int tamano) {
        super(celularBase);
        this.costo = costo;
        this.marca = marca;
        this.tamano = tamano;
    }
    @Override
    public void agregarFuncionalidad(){
        super.agregarFuncionalidad();
        System.out.println(">>>>> Agregando Cargador a su Celular <<<<<<");
        setPrecio(getPrecio()+costo);
        System.out.println("Caracteristicas del cargador: ");
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Nuevo precio de su compra: "+getPrecio()+" Bs.");
    }
}
