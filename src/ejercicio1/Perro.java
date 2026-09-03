package ejercicio1;


import java.time.LocalDate;
import java.util.UUID;

public class Perro {
    private String nombre;
    private LocalDate fechaNacimiento;
    private UUID id;

    public static int paseosDiarios = 2;

    public Perro(String nombre,  LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.id = UUID.randomUUID();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static String ladrar(){
        return "Guau-guau!";
    }

    public int calcularEdad(){
        int edad = LocalDate.now().getYear()-this.fechaNacimiento.getYear();
        return edad;
    }

    @Override
    public String toString() {
        return "El perro se llama " + this.nombre + ", (Id: " + this.id  + "), tiene " + calcularEdad()
                +  " años, dice " +  ladrar() + " y necesita como mínimo " + paseosDiarios + " paseos al día.";
    }
}
