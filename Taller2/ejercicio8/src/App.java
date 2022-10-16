import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File( "tortas.txt" );

        ArrayList<Torta> tortas = new ArrayList<>();
        
        try{
            Scanner leer = new Scanner( file );
        
            while ( leer.hasNextLine() ){
                String [] separarData = new String[7];
                String data = leer.nextLine();
            
                separarData = data.split("::");
                Torta torta = new Torta();

                torta.setNombre(separarData[0]);
                torta.setSabor(separarData[1]);
                torta.setRelleno(separarData[2]);
                torta.setDecoracion(separarData[3]);
                torta.setPorciones(separarData[4]);
                torta.setPrecio( Double.parseDouble(separarData[5]));
                torta.setCantidad( Integer.parseInt(separarData[6]));
                
                tortas.add(torta);             
            }

            leer.close();

        }catch (FileNotFoundException error) {
            System.out.println( "Exepcion al archivo no encontrado " + error );
        }

        ArrayList<Usuarios> registroClientes = new ArrayList<>();
        ArrayList<Torta> registroVentas = new ArrayList<>();
        Double total = 0.0;

        Scanner sc = new Scanner (System.in);
        String salir = "yes";

        while ( salir.equals( "yes" ) ){

            System.out.println("1. Programar pedido\n" +
		                    "2. Tortas disponibles\n" +
		                    "3. Venta diaria\n" +
		                    "4. Salir");

            System.out.println( " " );
            System.out.println( "************Escoja una de las siguientes opciones************" );
            int opcion = sc.nextInt();
            String saltarLinea = sc.nextLine();

            switch ( opcion ){
                case 1:

                    System.out.println( " " );
                    System.out.println( "************Ingrese la torta************" );
                    String inputTorta = sc.nextLine();
                    inputTorta = inputTorta.toLowerCase();

                    Boolean existeTorta = false;
                    Boolean existeStock = false;

                    for ( int i = 0; i < tortas.size(); i++ ){
                        if ( inputTorta.equals( tortas.get(i).getNombre() ) ){

                            existeTorta = true;

                            System.out.println( "************Ingrese la cantidad************" );
                            int inputCantidad = sc.nextInt();
                            saltarLinea = sc.nextLine();
                            
                            if ( inputCantidad <= tortas.get(i).getCantidad() ){
                                
                                existeStock = true;

                                Double subTotal = tortas.get(i).getPrecio();
                                tortas.get(i).setDescontar(inputCantidad);
                                subTotal = subTotal * inputCantidad;
                                total = total + subTotal;

                                Torta tortaVenta = new Torta();
                                tortaVenta.setNombre(inputTorta);
                                tortaVenta.setCantidad(inputCantidad);
                                tortaVenta.setPrecio(subTotal); 
                                registroVentas.add(tortaVenta);
                            }
                        }
                    }
                    
                    if ( existeTorta & existeStock ){

                        System.out.println( " " );
                        System.out.println( "************Ingrese sus datos************\n" +
                                    "--------------------------" );
                        System.out.println( " " );
                        System.out.println( "Nombre completo");

                        String inputNombre = sc.nextLine();
                        System.out.println( " " );
                        System.out.println( "Identidad" );
                        String inputIdentidad = sc.nextLine();
                        System.out.println( " " );
                        System.out.println( "Direcciòn");
                        String inputDireccion = sc.nextLine();
                        System.out.println( " " );
                        System.out.println( "Celular" );
                        String inputCelular = sc.nextLine();
                        System.out.println( " " );

                        Usuarios newUsuario = new Usuarios(inputNombre, inputIdentidad, inputDireccion, inputCelular);

                        registroClientes.add(newUsuario);
                    }

                    System.out.println( "No se encontro la torta o no hay en stock" );

                    break;    


                case 2:

                    for ( int i = 0; i < tortas.size(); i++ ){
                        System.out.println( "Torta : " + tortas.get(i).getNombre() +
                        ", Sabor : " + tortas.get(i).getSabor() + ", Porciones : " + tortas.get(i).getPorciones() +
                        ", Cantidad : " + tortas.get(i).getCantidad() + ", Precio : " + tortas.get(i).getPrecio());
                    }

                    break;
                    
                case 3:
                    
                    System.out.println( "Venta del dia : " + total + " dolares" );

                    break;

                case 4:
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
}
