import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File( "repuestos.txt" );

        ArrayList<Repuestos> repuestosArray = new ArrayList<>();

        ArrayList<String> [][] regisServicio = new ArrayList[10][10];

        try{
            Scanner leer = new Scanner(file);

            while ( leer.hasNextLine() ){
                String [] separarData = new String[3];
                
                String data = leer.nextLine();

                separarData = data.split("::");

                Repuestos repuesto = new Repuestos();

                repuesto.setRepuesto(separarData[0]);
                repuesto.setCantidad( Integer.parseInt(separarData[1]));
                repuesto.setPrecio( Double.parseDouble( separarData[2]) );

                repuestosArray.add(repuesto);
            }

        } catch ( FileNotFoundException error ){
            System.out.println( "Exepcion al archivo no encontrado " + error );
        }

        System.out.println( "Bienvenido al taller el Maquinista" );
        System.out.println( "----------------------------------" );
         
        Scanner sc = new Scanner( System.in );

        String salir = "yes";
        int contRevision = 0;
        int indiceDeMoto;
        int contRepuesto = 1;
        
        while ( salir.equals( "yes" ) ){

            System.out.println( "1. Servicio de Revisión\n"
                                + "2. Ingreso de Servicio de reparaciòn\n"
                                + "3. Recoger motocicleta\n"
                                + "4. Inventario de repuestos\n"
                                + "5. Salir de la app");
    
            System.out.println( " " );
            System.out.println( "************Escoja una de las siguientes opciones************" );

            int opcion = sc.nextInt();
            String saltarLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    Persona usuario = new Persona();
                    crearUsuario( usuario, sc );

                    // 0  nombre;
                    // 1  identidad;
                    // 2  celular;
                    // 3  direccion;
                    // 4  modelo;
                    // 5  placa;
                    // 6  problema;

                    regisServicio [contRevision][0] = new ArrayList<String>();
                    
                    regisServicio [contRevision][0].add( usuario.getNombre() );
                    regisServicio [contRevision][0].add( usuario.getIdentidad());
                    regisServicio [contRevision][0].add( usuario.getCelular());
                    regisServicio [contRevision][0].add( usuario.getDireccion());
                    regisServicio [contRevision][0].add( usuario.getModelo());
                    regisServicio [contRevision][0].add( usuario.getPlaca());
                    regisServicio [contRevision][0].add( usuario.getProblema());

                    contRevision++;
                    break;

                case 2:

                    salir = "yes";
                    System.out.println( "************Ingrese la placa************" );
                    String inputPlaca = sc.nextLine();
                    contRepuesto = 1;

                    while ( salir.equals("yes") ){

                        indiceDeMoto = buscarMoto( inputPlaca, regisServicio, contRevision );
                        
                        if ( indiceDeMoto > -1 ){
                            System.out.println( "************Ingrese el repuesto************" );
                            String inputRepuesto = sc.nextLine();
                            inputRepuesto = inputRepuesto.toLowerCase();

                            ingresoRepuestos( repuestosArray, regisServicio, inputRepuesto, sc, indiceDeMoto, contRepuesto );
                            contRepuesto++;
 
                        }else{
                            System.out.println( "Placa no encontrada" );
                            break;
                        }

                        System.out.println( " " );
                        System.out.println( "************Desea agregar mas repuestos [YES / NO]************" );
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                    }

                    break;
                
                case 3:
                    
                    System.out.println( "************Ingrese la placa************" );

                    inputPlaca = sc.nextLine();
                    indiceDeMoto = buscarMoto( inputPlaca, regisServicio, contRevision );
                    
                    if ( indiceDeMoto > -1 ){

                        System.out.println( regisServicio[indiceDeMoto][0].get(0) );
                        
                        int i=1;
                        
                        while ( regisServicio[indiceDeMoto][i] != null ){
                            System.out.println( regisServicio[indiceDeMoto][i] );
                            i++;
                        }               
                    }else{
                        System.out.println( "Placa no encontrada" );
                    }
                    break; 

                case 4:
                    
                    for ( int i = 0; i < repuestosArray.size(); i++ ){
                        System.out.println( "Repuesto :" + repuestosArray.get(i).repuesto + " , Cantidad :" + repuestosArray.get(i).getCantidad() );
                    }
                }

            System.out.println( " " );
            System.out.println( "************Desea seguir en la aplicaciòn [YES / NO]************" );
            salir = sc.nextLine();
            salir = salir.toLowerCase();
        }
    }

    public static void crearUsuario( Persona createUsuario, Scanner sc ){
        
        System.out.println( " " );
        System.out.println( "************Ingrese sus datos************\n" +
                            "--------------------------" );
        System.out.println(" ");
        System.out.println("Nombre completo");
        String inputNombre = sc.nextLine();

        System.out.println(" ");
        System.out.println("Identidad");
        String inputIdentidad = sc.nextLine();

        System.out.println(" ");
        System.out.println("Celular");
        String inputCelular = sc.nextLine();

        System.out.println(" ");
        System.out.println("Direcciòn");
        String inputDireccion = sc.nextLine();

        System.out.println(" ");
        System.out.println("Modelo");
        String inputModelo = sc.nextLine();

        System.out.println(" ");
        System.out.println("Placa");
        String inputPlaca = sc.nextLine();

        System.out.println("");
        System.out.println("************Ingrese el detalle del problema************");
        String inputProblema = sc.nextLine();

        createUsuario.setNombre(inputNombre);
        createUsuario.setIdentidad(inputIdentidad);
        createUsuario.setCelular(inputCelular);
        createUsuario.setDireccion(inputDireccion);
        createUsuario.setModelo(inputModelo);
        createUsuario.setPlaca(inputPlaca);
        createUsuario.setProblema(inputProblema); 
    }

    public static int buscarMoto( String inputPlaca, ArrayList<String> [][] regisServicio, int contRevision ){
        
        int valor = -1;
        for ( int i = 0; i < contRevision; i++ ){
            if ( inputPlaca.equals( regisServicio[i][0].get(5) ) ){
                return i;
            }
        }
        return valor;
    }

    public static void ingresoRepuestos( ArrayList<Repuestos> repuestosArray, ArrayList<String> [][] regisServicio ,String inputRepuesto, Scanner sc, int indiceDeMoto, int contRepuesto ){
        
        for ( int i = 0; i < repuestosArray.size(); i++ ){
            if ( inputRepuesto.equals( repuestosArray.get(i).getRepuesto() ) ){

                System.out.println( "************Ingrese la cantidad************" );
                int inputCantidad = sc.nextInt();
                String saltoLinea = sc.nextLine();

                if ( repuestosArray.get(i).getCantidad() >= inputCantidad ){
                                   
                    regisServicio[indiceDeMoto][contRepuesto] = new ArrayList<String>();
                    regisServicio[indiceDeMoto][contRepuesto].add( inputRepuesto );
                    regisServicio[indiceDeMoto][contRepuesto].add( String.valueOf( inputCantidad) ); 
                
                    Double subTotal = (repuestosArray.get(i).getPrecio() * inputCantidad);
                    regisServicio[indiceDeMoto][contRepuesto].add( Double.toString(subTotal) );
                    repuestosArray.get(i).decreCantidad( inputCantidad );
                }
            }
        }
    }
}







