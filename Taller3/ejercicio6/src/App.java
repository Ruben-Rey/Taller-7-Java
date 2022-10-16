import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );

        ArrayList<Contacto> registroContactos = new ArrayList<>();

        String salir = "yes";

        while ( salir.equals("yes") ){
            System.out.println( " -----------------" );
            System.out.println( "| Menu de usuario |" );
            System.out.println( " -----------------" );
            System.out.println( "1. Añadir contacto \n" + 
                            "2. Buscar contacto \n" +
                            "3. Eliminar contacto \n" +
                            "4. Salir");

            int opcion = sc.nextInt();
            String saltoLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    if ( registroContactos.size() < 3 ){
                        System.out.println( " " );
                        System.out.println( "*******Ingrese los datos*******" );

                        System.out.println( " " );
                        System.out.println( "Nombre completo" );
                        String inputNombre = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "telefono" );
                        String inputTelefono = sc.nextLine();

                        System.out.println( " " );
                        System.out.println( "organizaciòn" );
                        String inputOrganizacion = sc.nextLine();

                        int indice = buscarContacto( registroContactos, inputTelefono );

                        if (  indice < 0 ){

                            Contacto newContacto = new Contacto();
                            newContacto.setNombreCompleto(inputNombre);
                            newContacto.setTelefono(inputTelefono);
                            newContacto.setOrganizacion(inputOrganizacion);

                            registroContactos.add(newContacto);
                        }else{
                        System.out.println( "El numero ya esta registrado" );
                        }                   
                    }else{
                        System.out.println( "Solo se puede agregar como màximo 3 contactos" );
                    }    
                    break;

                case 2:

                    System.out.println( " " );
                    System.out.println( "*******Ingrese el numero del contacto*******" );
                    String inputTelefono = sc.nextLine();

                    int indice = buscarContacto( registroContactos, inputTelefono );

                    if ( indice > -1 ){
                        System.out.println( "Nombre Completo : " + registroContactos.get(indice).getNombre() );
                        System.out.println( "Organizaciòn : " + registroContactos.get(indice).getOrganizacion() );

                    }else{
                        System.out.println( "Usuario no encontrado" );
                    }

                    break;

                case 3:

                    System.out.println( " " );
                    System.out.println( "*******Ingrese el numero del contacto*******" );
                    inputTelefono = sc.nextLine();

                    indice = buscarContacto( registroContactos, inputTelefono );
                    System.out.println( registroContactos.get(indice).getNombre() + " Contacto eliminado" );
                    registroContactos.get(indice).contactoRemove();
                    registroContactos.remove(indice);
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

    public static int buscarContacto( ArrayList<Contacto> registroContactos, String inputTelefono ){
        int indice = -1;
        for ( int i = 0; i < registroContactos.size(); i++ ){
            if ( inputTelefono.equals( registroContactos.get(i).getTelefono() ) ){
                indice = i;
            }
        }

        return indice;
    }
}

