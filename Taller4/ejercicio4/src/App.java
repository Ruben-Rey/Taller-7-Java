public class App {
    public static void main(String[] args) throws Exception {
      String [][] numeros = new String[2][10]; 

        //Generar la matriz bidimensional de numeros del 1 al 20
        int cont = 1;

        for ( int fila = 0; fila < numeros.length; fila++ ){
            for ( int colum = 0; colum < numeros[0].length; colum++ ){
                
                if ( fila == 0 & colum < 9 ){
                    numeros[fila][colum] = "0" + cont;
                    cont++;
                }else{
                    numeros[fila][colum] = String.valueOf(cont);
                    cont++;
                }
            }
        }

        for ( int fila = 0; fila < numeros.length; fila++ ){
            for ( int colum = 0; colum < 5; colum++ ){
                System.out.print( " " + numeros[fila][colum] );
            }

            System.out.println( "" );

            for ( int colum = 9; colum > 4; colum-- ){
                System.out.print( " " +  numeros[fila][colum] );
            }

            System.out.println( "" );
        }
    }
}
