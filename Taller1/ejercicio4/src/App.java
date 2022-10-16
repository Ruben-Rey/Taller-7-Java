import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su pais");
        String pais = input.nextLine();

        System.out.println("Ingrese la capital");
        String capital = input.nextLine();

        input.close();

        System.out.println("La ciudad " + capital + " es la capital del país " + pais);
    }
}
