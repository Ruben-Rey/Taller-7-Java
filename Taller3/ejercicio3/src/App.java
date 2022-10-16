public class App {
    public static void main(String[] args) throws Exception {
        // tronco del arbol
        for ( int fila = 0; fila < 10; fila++){
            for ( int espacio = 10; espacio > fila; espacio-- ){
                System.out.print( " " );
            }
            
            for ( int left = 0; left < fila; left++ ){
                System.out.print( "*" );
            }
            System.out.print( "*" );
            for ( int rigth = 0; rigth < fila; rigth++ ){
                System.out.print( "*" );
            }

            System.out.println( " " );
        }
        
        // base del arbol
        Boolean bandera = true;

        for ( int fila = 0; fila < 3; fila++){
            for ( int espacio = 9; espacio > fila; espacio-- ){
                System.out.print( " " );
            }

            for ( int left = -3; left < fila; left++ ){
                System.out.print( "*" );
            }
            
            if ( bandera ){
                System.out.println( " " );
                for ( int espacio = 9; espacio > fila; espacio-- ){
                    System.out.print( " " );
                }
                
                for ( int left = -3; left < fila; left++ ){
                    System.out.print( "*" );
                }
    
            }

            bandera = false;

            for ( int rigth = 0; rigth < fila; rigth++ ){
                System.out.print( "*" );
            }

            System.out.println( " " );
        }
    }
}
