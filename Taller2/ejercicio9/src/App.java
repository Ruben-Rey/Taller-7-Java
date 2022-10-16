import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );


        String salir = "yes";

        while ( salir.equals( "yes" ) ){
            System.out.println("Aplicación que cálcula el área");
            System.out.println( "---------------------------" );
            System.out.println( "1. Área de un rectángulo \n" +
                            "2. Área de un triángulo \n" +
                            "3. Área de un trapecio \n" +
                            "4. Salir" );
            
            System.out.println( " " );
            System.out.println( "************Escoja una de las siguientes opciones a calcular************" );
            int opcion = sc.nextInt();
            String saltarLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    System.out.println( "Área de un rectángulo" );
                    System.out.println( "---------------------------" );
                    System.out.println( " " );

                    System.out.println( "Ingresar la base del rectángulo" );
                    int base = sc.nextInt();
                    System.out.println( " " );

                    System.out.println( "Ingresar la altura del rectángulo" );
                    int altura = sc.nextInt();
                    saltarLinea = sc.nextLine();
                    System.out.println( " " );

                    int area = (base * altura);
                    System.out.println( "El àrea del rectangulo es : " + area + " m2" );

                    break;

                case 2:

                    System.out.println( "Área de un triángulo" );
                    System.out.println( "---------------------------" );
                    System.out.println( " " );

                    System.out.println( "Ingresar la base del rectángulo" );
                    base = sc.nextInt();
                    System.out.println( " " );

                    System.out.println( "Ingresar la altura del rectángulo" );
                    altura = sc.nextInt();
                    saltarLinea = sc.nextLine();
                    System.out.println( " " );

                    area = (base * altura)/2;
                    System.out.println( "El àrea del triángulo es : " + area + " m2");

                    break;

                case 3:

                    System.out.println( "Área de un trapecio" );
                    System.out.println( "---------------------------" );
                    System.out.println( " " );

                    System.out.println( "Ingresar la base menor del trapecio" );
                    int baseMenor = sc.nextInt();
                    System.out.println( " " );

                    System.out.println( "Ingresar la base mayor del trapecio" );
                    int baseMayor = sc.nextInt();
                    System.out.println( " " );

                    System.out.println( "Ingresar la altura del trapecio" );
                    altura = sc.nextInt();
                    saltarLinea = sc.nextLine();
                    System.out.println( " " );
                    
                    area = ((baseMenor + baseMayor)/2)*altura;
                    System.out.println( "El àrea del trapecio es : " + area + " m2");

                    break;

                case 4:
                    salir = "no";
                    return;
                    
            }
            System.out.println( " " );
            System.out.println( "************¿Desea continuar en la app [YES / NO]?************" );
            salir = sc.nextLine();
            salir = salir.toLowerCase();
        }
        sc.close();
    }
}




