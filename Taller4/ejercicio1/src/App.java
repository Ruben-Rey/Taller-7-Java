import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in );
        int [] vector = new int [5];

        for ( int i = 0; i < vector.length; i++ ){
            
            System.out.println( "Ingrese un nùmero" );
            int inputNumero = sc.nextInt();
            String saltoLinea = sc.nextLine();

            vector[i] = inputNumero;
        }

        for ( int i = 0; i < vector.length; i++ ){
            
            System.out.println( "[" + i + "] = " + vector[i] );
            
        }
        



    }
}
