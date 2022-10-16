import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese su nombre");
    String nombre = input.nextLine();

    System.out.println("Ingrese su apellido");
    String apellido = input.nextLine();

    System.out.println("Ingrese su edad");
    Integer edad = input.nextInt();

    System.out.println("Ingrese su estatura");
    Float estatura = input.nextFloat();

    input.close();

    System.out.println("Nombre :" + nombre);
    System.out.println("Apellido :" + apellido);
    System.out.println("Edad :" + edad);
    System.out.println("Estatura :" + estatura + "m");
    }
}
