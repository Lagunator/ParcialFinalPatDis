package Ejercicio3Bridge;

public class WhatsApp implements IRedSocial{
    @Override
    public void integracion(ISistemaControl sistemaControl) {

        System.out.println(">>>>>> Integracion con WhatsApp <<<<<<");
        System.out.println("Datos del sistema de control-> ");
        System.out.println("Nombre: " + sistemaControl.getNombre());
        System.out.println("Capacidad: " + sistemaControl.getCapacidad());
        System.out.print("Estudiantes: ");
        for (Estudiante estudiante : sistemaControl.getEstudiantes()) {

            System.out.print(estudiante.getNombre() + ", ");

        }

        System.out.println();
        System.out.println("Los Requisitos son: " + sistemaControl.getRequisitos());
        System.out.println();

    }
}
