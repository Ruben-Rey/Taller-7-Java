import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );

        System.out.println( "**********Ingrese un numero**********" );
        int inputNumero = sc.nextInt();
        String saltoLinea = sc.nextLine();

        for ( int i = 1; i <= 10; i++ ){
            System.out.println( i + " X " + inputNumero + " = "+ (i*inputNumero) );
        }
        sc.close();
    }
    
}
