package Ejercicio3Bridge;

public class Main {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Marcelo", "9119772");
        Estudiante est2 = new Estudiante("Horacio", "2578399");
        Estudiante est3 = new Estudiante("Ramon", "7269438");
        Estudiante est4 = new Estudiante("Eynar", "891356");
        Estudiante est5 = new Estudiante("Julian", "8922743");
        Estudiante est6 = new Estudiante("Alejandra", "827349");
        Estudiante est7 = new Estudiante("Gabriel", "216355");
        Estudiante est8 = new Estudiante("Mauricio", "9635440");

        SistemaEscuela sistemaEscuela = new SistemaEscuela("Domingo Savio", 400,
                new Estudiante[]{est1,est2,est3}, "Sacar 50 de promedio para avanzar de curso");

        SistemaColegio sistemaColegio = new SistemaColegio("Amor de Dios", 300,
                new Estudiante[]{est4,est5,est6}, "Sacar 66 de promedio para la beca");

        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad("UMSA", 1100,
                new Estudiante[]{est7, est8}, "Sacar 98 para tener exelencia academica");


        sistemaEscuela.setRedSocial(new Twitter());
        sistemaColegio.setRedSocial(new Facebook());
        sistemaUniversidad.setRedSocial(new WhatsApp());

        sistemaEscuela.integrarRedSocial();
        sistemaColegio.integrarRedSocial();
        sistemaUniversidad.integrarRedSocial();
    }
}
