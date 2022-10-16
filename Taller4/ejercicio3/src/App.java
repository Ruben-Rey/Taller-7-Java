public class App {
    public static void main(String[] args) throws Exception {
        
        // i = 2
        for ( int i = 2; i <= 1000; i++ ){
            //numero =1
            
            int numero = 1;
            int contador = 0;

            while ( numero <= i ){
                
                if ( i % numero == 0 ){
                    contador++;
                }

                numero++;
            }

            if ( contador == 2 ){
                System.out.println( "Es primo = " + i );
            }

        }
    }
}
