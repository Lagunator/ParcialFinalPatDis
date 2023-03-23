package Ejercicio3Bridge;

public interface ISistemaControl {
    void integrarRedSocial();
    String getNombre();
    int getCapacidad();
    Estudiante[] getEstudiantes();
    String getRequisitos();
}
