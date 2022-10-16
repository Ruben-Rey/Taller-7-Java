import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );
        String salir = "yes";

        while ( salir.equals("yes") ){
            System.out.println( "Menu de usuario" );
            System.out.println( "--------------------" );
            System.out.println( "1. Capturar nombre \n" + 
                            "2. Saludar persona \n" +
                            "3. Salir del sistema");

            int opcion = sc.nextInt();

            switch ( opcion ){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    salir = "no";
                    return;
            }
        }

    }
}
