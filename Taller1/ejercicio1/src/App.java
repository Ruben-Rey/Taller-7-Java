import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();

        System.out.println("Ingrese su apellido");
        String apellido = input.nextLine();

        System.out.println("Nombre :" + nombre + " , apellido :" + apellido);

        input.close();
    }
}
