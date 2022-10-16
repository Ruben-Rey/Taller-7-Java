import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = input.nextLine();

        System.out.println("Ingrese el nombre de su madre");
        String nombreMama = input.nextLine();

        System.out.println("Ingrese el apellido de su madre");
        String apellidoMama = input.nextLine();

        System.out.println("Ingrese el nombre de su padre");
        String nombrePapa = input.nextLine();

        System.out.println("Ingrese el apellido de su padre");
        String apellidoPapa = input.nextLine();

        input.close();

        System.out.println("Yo " + nombreCompleto + ", soy hijo de " + nombreMama + " y " + nombrePapa);
    }
}
