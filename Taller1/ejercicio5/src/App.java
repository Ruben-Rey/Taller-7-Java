import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Cúal es el nombre de su mascota");
        String nombreMascota = input.nextLine();

        System.out.println("¿Cúal es la edad de la mascota?");
        Integer edadMascota = input.nextInt();
        String saltoDeLinea = input.nextLine();
        System.out.println("¿Qué tipo es su mascota?");
        String tipoMascota = input.nextLine();

        System.out.println("Introduzca su nombre completo");
        String nombreCompleto = input.nextLine();

        input.close();
        
        System.out.println( nombreMascota + ", es un(a) " + tipoMascota + " el cual, tiene " + edadMascota + " años de edad y " + nombreCompleto + " es actualmente su dueño(a).");
    }
}
