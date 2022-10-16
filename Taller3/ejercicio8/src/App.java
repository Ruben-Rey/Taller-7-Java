import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner( System.in );
        ArrayList<Estudiante> registroEstudiantes = new ArrayList<>();

        String salir = "yes";

        while ( salir.equals("yes") ){
            System.out.println( " ---------------------------------------" );
            System.out.println( "| La escuela automovilística El Maestro |" );
            System.out.println( " ---------------------------------------" );
            System.out.println( "1. Ingreso al curso \n" + 
                            "2. Consultar usuarios que llevaron el curso  \n" +
                            "3. Ingreso de notas  \n" +
                            "4. Salir");

            int opcion = sc.nextInt();
            String saltoLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    if ( registroEstudiantes.size() < 8 ){
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

                        Estudiante newEstudiante = new Estudiante();
                        newEstudiante.setNombreCompleto(inputNombre);
                        newEstudiante.setIdentidad(inputIdentidad);
                        newEstudiante.setCelular(inputCelular);

                        registroEstudiantes.add(newEstudiante);                  

                    }else{
                        System.out.println( "Màximo 8 autos en el parqueadero" );
                    }    
                    break;   


                case 2:

                    System.out.println( " " );
                    System.out.println( "*******Ingrese la identidad*******" );
                    String inputIdentidad = sc.nextLine();

                    int indice = buscarAuto( registroEstudiantes, inputIdentidad );

                    if ( indice > -1 ){
                        System.out.println( "Nombre Completo : " + registroEstudiantes.get(indice).getNombreCompleto() );
                        System.out.println( "Identidad : " + registroEstudiantes.get(indice).getIdentidad() );
                        System.out.println( "Nota : " + registroEstudiantes.get(indice).getNota() );
                    
                        System.out.println( 
                            ( registroEstudiantes.get(indice).getNota() > 79 ) ? "Felicidades aprobaste el curso":
                            ( registroEstudiantes.get(indice).getNota() > 0) ? "Intente de nuevo, no llego a la nota minima":
                                                                            "Aùn no se ingresa la nota");


                    }else{
                        System.out.println( "Estudiante no encontrado" );
                    }

                    break;
                
                case 3:
                    
                    System.out.println( " " );
                    System.out.println( "*******Ingrese la identidad*******" );
                    inputIdentidad = sc.nextLine();

                    indice = buscarAuto( registroEstudiantes, inputIdentidad );

                    if ( indice > -1 ){
                        
                        System.out.println( " " );
                        System.out.println( "*******Ingrese la nota*******" );
                        int inputNota = sc.nextInt();
                        saltoLinea = sc.nextLine();

                        if ( inputNota > 0 & inputNota < 100 ){
                            registroEstudiantes.get(indice).setNota(inputNota);

                            System.out.println( "Nombre Completo : " + registroEstudiantes.get(indice).getNombreCompleto() );
                            System.out.println( "Nota ingresada : " + registroEstudiantes.get(indice).getNota() );

                        }
                        

                    }else{
                        System.out.println( "Estudiante no encontrado" );
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

        sc.close();
    }

    public static int buscarAuto( ArrayList<Estudiante> registroEstudiantes, String inputIdentidad ){
        int indice = -1;
        for ( int i = 0; i < registroEstudiantes.size(); i++ ){
            if ( inputIdentidad.equals( registroEstudiantes.get(i).getIdentidad() ) ){
                indice = i;
            }
        }

        return indice;
    }
}