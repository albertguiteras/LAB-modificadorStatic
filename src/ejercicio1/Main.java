package ejercicio1;

/*Ejercicio: la perrera
Tienes una clase Perro.
Cada perro tiene:
        - Un nombre.
        - Una fechaNacimiento de tipo LocalDate.
- Un méto-do ladrar() que devuelve "Guau guau!" //static
        - Un méto-do calcularEdad() que calcula su edad a partir de su fecha de nacimiento (LocalDate)
        - Además, todos los perros de la residencia tienen una cantidad mínima de paseos diarios: 2.
Esta cantidad debe ser static, porque es una regla común a todos los perros.
Crear un toString() que muestre algo como:
El perro se llama Toby, (* id extra), tiene 4 años, dice 'Guau guau!' y necesita como mínimo 2 paseos al día.
        En main, instancia varios perros diferentes y muestra su información.
        (*) EXTRA: - Un id del tipo UUID random (investigar qué es esto)*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Perro p1 = new Perro("Pepito", LocalDate.of(2022, 6, 14));
        Perro p2 = new Perro("Luna", LocalDate.of(2020, 3, 10));
        Perro p3 = new Perro("Rocky", LocalDate.of(2021, 11, 25));
        Perro p4 = new Perro("Bella", LocalDate.of(2023, 1, 5));
        Perro p5 = new Perro("Thor", LocalDate.of(2019, 8, 18));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
