public class App {
    public static void main(String[] args) throws Exception {
        
        for ( int j = 10; j > 0; j-- ){
            for ( int i = 0; i < j; i++ ){
                System.out.print( " " );
            }
            for ( int i = 11; i > j; i--){
                System.out.print( "*" );
            }
            System.out.println( "" );
        }
    }
}
