package Ejercicio3Bridge;

public class SistemaEscuela implements ISistemaControl{
    private String nombre;
    private int capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;

    private IRedSocial redSocial;

    public SistemaEscuela(String nombre, int capacidad, Estudiante[] estudiantes, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
    }

    @Override
    public void integrarRedSocial() {

        System.out.println("Integrando a ESCUELA: " + getNombre());
        redSocial.integracion(this);


    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public IRedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(IRedSocial redSocial) {
        this.redSocial = redSocial;
    }
}
