import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in ); 
        String salir = "yes";

        while ( salir.equals("yes") ){

            System.out.println( "***********Ingrese su peso en kilogramos***********" );
            Double peso = sc.nextDouble();
            System.out.println( "***********Ingrese su altura en metros***********" );
            Double altura = sc.nextDouble();
            String saltoLinea = sc.nextLine();

            Double imc = peso / (altura * altura);
            imc = Math.round(imc*100.0)/100.0;
	        System.out.println( imc );

            System.out.println( ( imc >= 30 ) ? "Se encuentra en el rango de obesidad":
                                ( imc >= 25) ? "Se encuentra en el rango de sobre peso":
                                ( imc >= 18.5) ? "Se encuentra en el rango de peso normal":
                                "Se encuentra en el rango de bajo de peso");

            System.out.println( " " );
            System.out.println( "************Desea seguir en la aplicaciòn [YES / NO]************" );
            salir = sc.nextLine();
            salir = salir.toLowerCase();

        }
        sc.close();

    }
}
