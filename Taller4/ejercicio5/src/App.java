import java.util.Scanner;

import javax.swing.text.MutableAttributeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in );
        int [][] multiplicacion = new int[10][10];

        for ( int colum = 0; colum < 10; colum++  ){
            for ( int fila = 0; fila < 10; fila++ ){
                if ( colum == 9 ){
                    System.out.print( (colum + 1) + " X " + (fila + 1) + "  " );     
                }else{
                    System.out.print( (colum + 1) + " X " + (fila + 1) + "   " );            
                }
                int resultado = (colum + 1) * (fila + 1);
                multiplicacion[fila][colum] = resultado;
            }
            System.out.println( " " );
        }

        
        String salir = "yes";

        while ( salir.equals("yes") ){

            System.out.println( " " );
            System.out.println( "1. Obtener el resultado de la tabla de multiplicar" );
            System.out.println( "2. Salir" );
            System.out.println( " " );

            System.out.println( "Escoja una opciòn" );
    
            int opcion = sc.nextInt();
            String saltarLinea = sc.nextLine();
            
                switch (opcion) {
                    case 1:
                        System.out.println( "Ingrese la fila" );
                        int fila = sc.nextInt();
                        System.out.println( "Ingrese la columna" );
                        int colum = sc.nextInt();
                        saltarLinea = sc.nextLine();
                        System.out.println( "**********" );
                        System.out.println( fila + " X "+ colum + " = " + multiplicacion[fila][colum] );
                        System.out.println( "**********" );
                        break;

                    case 2:
                        salir = "no";
                        return;    
                }

        }
    }
}
