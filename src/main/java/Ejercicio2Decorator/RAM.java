package Ejercicio2Decorator;

public class RAM extends Fun {
    private int capacidad;
    private String marca;
    private int costo;

    public RAM(IPhone celularBase, int capacidad, String marca, int costo) {
        super(celularBase);
        this.capacidad = capacidad;
        this.marca = marca;
        this.costo = costo;
    }
    @Override
    public void agregarFuncionalidad(){
        super.agregarFuncionalidad();
        System.out.println(">>>>>> Agregando RAM al Celular <<<<<<");
        setPrecio(getPrecio()+costo);
        setMemoriaRam(getMemoriaRam()+capacidad);
        System.out.println("Caracteristicas de la RAM: ");
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Precio actualizado de la compra: "+getPrecio()+" Bs.");
        System.out.println("RAM actualizada: "+getMemoriaRam());
    }
}
