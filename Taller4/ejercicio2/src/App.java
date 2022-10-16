import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in );
        int [] vector = new int [20];
        Boolean quitarComa = true;

        //Genera los numeros aleatorios de 1 a 100 y los guarda en vector[20]
        for ( int i = 0; i < vector.length; i++ ){
                    
            vector[i] = (int)(Math.random()*100+1);
        }

        //Imprime los numeros pares
        System.out.print( "Números pares : ");

        for ( int i = 0; i < vector.length; i++ ){
            
            if ( vector[i] % 2 ==0 ){
                if ( quitarComa ){
                System.out.print( vector[i] );
                quitarComa = false;

                }else{
                    System.out.print( "," + vector[i] );
                }
            }
        }

        //Imprime los numeros impares
        System.out.println( " ");
        System.out.print( "Números impares : ");
        quitarComa = true;

        for ( int i = 0; i < vector.length; i++ ){
            if ( vector[i] % 2 !=0 ){
                if ( quitarComa ){
                    System.out.print( vector[i] );
                    quitarComa = false;
                    
                }else{
                    System.out.print( "," + vector[i] );
                }
            }
        }
        System.out.println( " ");
    sc.close();
    }
}