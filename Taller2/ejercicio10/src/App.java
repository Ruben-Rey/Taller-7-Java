import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );

        ArrayList<Cuenta> cliente = new ArrayList<>();

        String salir = "yes";

        while ( salir.equals(salir) ){

            System.out.println( "Bienvenido a la app el Banco Fiel" );
            System.out.println( "---------------------------" );
            System.out.println( "1. Crear una cuenta nueva \n" +
                            "2. Ingresa a tu cuenta \n" +
                            "3. Salir" );
            
            System.out.println( " " );
            System.out.println( "************Escoja una de las siguientes opciones************" );
            int opcion = sc.nextInt();
            String saltarLinea = sc.nextLine();

            switch ( opcion ){
                case 1:
                    System.out.println( "Ingrese sus datos" );
                    System.out.println( "---------------------------" );

                    System.out.println(" ");
                    System.out.println("Nombre completo");
                    String inputNombre = sc.nextLine();

                    System.out.println(" ");
                    System.out.println("Identidad");
                    String inputIdentidad = sc.nextLine();

                    System.out.println(" ");
                    System.out.println("Direcciòn");
                    String inputDireccion = sc.nextLine();

                    System.out.println(" ");
                    System.out.println("Celular");
                    String inputCelular = sc.nextLine();

                    System.out.println(" ");
                    System.out.println("Contraseña");
                    String inputContraseña = sc.nextLine();

                    Cuenta addCliente = new Cuenta();
                    addCliente.setNombre(inputNombre);
                    addCliente.setIdentificacion(inputIdentidad);
                    addCliente.setDireccion(inputDireccion);
                    addCliente.setCelular(inputCelular);
                    addCliente.setContraseña(inputContraseña);

                    cliente.add(addCliente);

                    break;

                case 2:
                    
                    Boolean existeUsuario = false;

                    System.out.println( "*******Ingresa el numero de identidad*******" );
                    inputIdentidad = sc.nextLine();

                    int indice = buscarCuenta( cliente, sc, inputIdentidad);

                    

                    if ( indice > -1 ){

                        salir = "yes";
                        while ( salir.equals("yes") ){

                            
                            System.out.println(" ");
                            System.out.println( "1. Depositar \n" +
                                                "2. Retirar \n" +
                                                "3. Consulta de saldo \n" + 
                                                "4. Salir" );
                        
                            System.out.println( " " );
                        
                            opcion = sc.nextInt();
                            saltarLinea = sc.nextLine();

                            switch ( opcion ){
                                case 1:
                                
                                    System.out.println( "************Ingrese la cantidad a depositar************" );
                                    Double inputDinero = sc.nextDouble();

                                    if ( inputDinero > 0 ){
                                        cliente.get(indice).depositar(inputDinero);

                                    }else {
                                        System.out.println( "Ingrese numeros mayores a cero" );
                                    }

                                    break;

                                case 2:

                                    System.out.println( "************Ingrese la cantidad a retirar************" );
                                    inputDinero = sc.nextDouble();

                                    if ( inputDinero > 0 & inputDinero <= cliente.get(indice).consulta() ){

                                        cliente.get(indice).retirar(inputDinero);
                                    }else {
                                        System.out.println( "Ingrese numeros mayores a cero y menor al saldo actual" );
                                    }


                                    break;

                                case 3:

                                    System.out.println("---------------------------------------------------------");
                                    System.out.println( "El saldo actual es de : " + cliente.get(indice).consulta() + " dolares" );
                                    System.out.println("---------------------------------------------------------");
                                    break;

                                case 4:
                                    salir = "no";
                                    return;
                            }
                        }
                    }else{
                        System.out.println( "Identidad no encontrada" );
                    }
                    break;

                case 3:

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

    public static int buscarCuenta( ArrayList<Cuenta> cliente, Scanner sc, String inputIdentidad ){
        
        int indice = -1;

        for ( int i = 0; i < cliente.size(); i++ ){
            if ( inputIdentidad.equals( cliente.get(i).getIdentificacion() ) ){
                
                System.out.println( "*******Ingrese la contraseña*******" );
                String inputContraseña = sc.nextLine();

                if ( inputContraseña.equals( cliente.get(i).getContraseña() ) )
                    indice = i;
                    System.out.println( "************Escoja una de las siguientes opciones***********" );
            }

        }
        return indice;
    }
}

