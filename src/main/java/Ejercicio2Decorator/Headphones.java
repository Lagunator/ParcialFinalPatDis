package Ejercicio2Decorator;

public class Headphones extends Fun {
    private int costo;
    private String marca;

    public Headphones(IPhone celularBase, int costo, String marca) {
        super(celularBase);
        this.costo = costo;
        this.marca = marca;
    }
    @Override
    public void agregarFuncionalidad(){
        super.agregarFuncionalidad();
        System.out.println(">>>>>> Agregando Audifonos a su  Celular <<<<<");
        setPrecio(getPrecio()+costo);
        System.out.println("Caracteristicas de los audifonos: ");
        System.out.println("Costo: "+costo);
        System.out.println("Marca: "+marca);
        System.out.println("Nuevo Precio de su compra: "+getPrecio()+" Bs.");
    }
}
