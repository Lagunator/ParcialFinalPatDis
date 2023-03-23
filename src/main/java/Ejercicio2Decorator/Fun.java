package Ejercicio2Decorator;

public abstract class Fun implements IPhone {
    private IPhone celularBase;

    public Fun(IPhone celularBase) {
        this.celularBase = celularBase;
    }

    @Override
    public int getPrecio() {
        return celularBase.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        celularBase.setPrecio(precio);
    }

    @Override
    public int getMemoriaRam() {
        return celularBase.getMemoriaRam();
    }

    @Override
    public void setMemoriaRam(int memoriaRam) {
        celularBase.setMemoriaRam(memoriaRam);
    }

    @Override
    public void agregarFuncionalidad() {
        celularBase.agregarFuncionalidad();
    }
}