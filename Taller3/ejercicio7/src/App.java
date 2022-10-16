import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );

        ArrayList<Auto> registroClientes = new ArrayList<>();

        String salir = "yes";

        while ( salir.equals("yes") ){
            System.out.println( " ---------------------------------------" );
            System.out.println( "| Bienvenido al parqueadero EL GUARDIÀN |" );
            System.out.println( " ---------------------------------------" );
            System.out.println( "1. Ingreso al parqueadero \n" + 
                            "2. Retiro del parqueadero \n" +
                            "3. Consulta de vehìculo \n" +
                            "4. Salir");

            int opcion = sc.nextInt();
            String saltoLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    if ( registroClientes.size() < 5 ){
                        System.out.println( " " );
                        System.out.println( "*******Ingrese los datos*******" );

                        System.out.println( " " );
                        System.out.println( "Nombre completo" );
                        String inputNombre = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "Identidad" );
                        String inputIdentidad = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "Celular" );
                        String inputCelular = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "Marca" );
                        String inputMarca = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "Placa" );
                        String inputPlaca = sc.nextLine();

                        Auto newCliente = new Auto();
                        newCliente.setNombreCompleto(inputNombre);
                        newCliente.setIdentidad(inputIdentidad);
                        newCliente.setCelular(inputCelular);
                        newCliente.setMarca(inputMarca);
                        newCliente.setPlaca(inputPlaca);

                        registroClientes.add(newCliente);                  

                    }else{
                        System.out.println( "Màximo 5 autos en el parqueadero" );
                    }    
                    break;   

                case 2:

                    System.out.println( " " );
                    System.out.println( "*******Ingrese la placa*******" );
                    String inputPlaca = sc.nextLine();

                    int indice = buscarAuto( registroClientes, inputPlaca );
                    System.out.println( registroClientes.get(indice).getNombreCompleto() + " Auto retirado" );
                    registroClientes.remove(indice);

                    break;

                case 3:

                    System.out.println( " " );
                    System.out.println( "*******Ingrese la placa*******" );
                     inputPlaca = sc.nextLine();

                    indice = buscarAuto( registroClientes, inputPlaca );

                    if ( indice > -1 ){
                        System.out.println( "Nombre Completo : " + registroClientes.get(indice).getNombreCompleto() );
                        System.out.println( "Identidad : " + registroClientes.get(indice).getIdentidad() );
                        System.out.println( "Identidad : " + registroClientes.get(indice).getMarca() );


                    }else{
                        System.out.println( "Placa no encontrada" );
                    }

                    break;

                case 4:
                    salir = "no";
                    return;
            }
            
            System.out.println( " " );
            System.out.println( "************Desea seguir en la aplicaciòn [YES / NO]************" );
            salir = sc.nextLine();
            salir = salir.toLowerCase();
        }
    }

    public static int buscarAuto( ArrayList<Auto> registroClientes, String inputPlaca ){
        int indice = -1;
        for ( int i = 0; i < registroClientes.size(); i++ ){
            if ( inputPlaca.equals( registroClientes.get(i).getPlaca() ) ){
                indice = i;
            }
        }

        return indice;
    }
}
