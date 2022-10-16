import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Medicamentos> ArrayMedicamentos = new ArrayList<Medicamentos>();

        File file = new File("ListaMedicamentos.txt");
        try {
            Scanner leer = new Scanner(file);

            while ( leer.hasNextLine() ){
                String data = leer.nextLine();
                String [] separarData = data.split("::");

                Medicamentos medicamento = new Medicamentos();

                medicamento.setNombre(separarData[0]);
                medicamento.setDescripcion(separarData[1]);
                medicamento.setFormula(separarData[2]);
                medicamento.setMasaMolar(separarData[3]);
                medicamento.setVidaMedia(separarData[4]);
                medicamento.setMetabolismo(separarData[5]);
                medicamento.setCantidad(Integer.parseInt(separarData[6]));
                medicamento.setPrecio( Double.parseDouble(separarData[7]));
                //Medicamento // Descripciòn // Fòrmula // Masa molar // Vida media // Metabolismo // Cantidad

                ArrayMedicamentos.add( medicamento );
            }
        } catch( FileNotFoundException error ){
            System.out.println( "Exepcion al abrir el archivo " + error );
        }

        Scanner sc = new Scanner( System.in );

        String salir = "yes";

        /*[usuario] [usuario]  = 0
                    [producto] = 1
                    [cantidad] = 2
                    [subtotal] = 3
        */

        ArrayList<String> [][] regisCompras = new ArrayList[15][4];
        int contUsuario = 0;

        
        while ( salir.equals( "yes" ) ){

            System.out.println( "Bienvenido a la drogeria mi salud" );
            System.out.println( "----------------------------------" );
            System.out.println("1. Compra de productos");
            System.out.println("2. Consulta de producto");
            System.out.println("3. Devoluciones");
            System.out.println("4. Salir de la app");

            System.out.println( " " );
            System.out.println("************Elegir una opción************");
            
            int opcion  = sc.nextInt();
            String saltoLinea = sc.nextLine();

            switch ( opcion ){

                case 1:

                    salir = "yes";
                    Boolean flagCompro = true; 

                    //Inicializando la posicion PRODUCTO de la matriz
                    regisCompras[contUsuario][1] = new ArrayList<String>();
                    //Inicializando la posicion CANTIDAD de la matriz
                    regisCompras[contUsuario][2] = new ArrayList<String>();
                    //Inicializando la posicion PRECIO de la matriz
                    regisCompras[contUsuario][3] = new ArrayList<String>();

                    while ( salir.equals("yes") ){

                        System.out.println( " " );
                        System.out.println( "************Ingrese el producto************" );
                        String inputProducto = sc.nextLine();
                        inputProducto = inputProducto.toLowerCase();

                        for ( int i = 0; i < ArrayMedicamentos.size(); i++ ){

                            if ( ArrayMedicamentos.get(i).getNombre().equals(inputProducto) ){

                                System.out.println( "************Ingrese la cantidad************" );
                                int inputCantidad = sc.nextInt();
                                saltoLinea = sc.nextLine();
                            
                                if ( ArrayMedicamentos.get(i).getCantidad() >= inputCantidad ){
                                    
                                    regisCompras[contUsuario][1].add( inputProducto );
                                    regisCompras[contUsuario][2].add( String.valueOf( inputCantidad));
                                    Double subTotal = ( inputCantidad * ArrayMedicamentos.get(i).getPrecio() );

                                    regisCompras[contUsuario][3].add( Double.toString( subTotal ));
                                    ArrayMedicamentos.get(i).decreCantidad( inputCantidad );
                                    
                                }else{
                                    System.out.println( "No hay stock" );
                                    flagCompro = false;
                                }
                            }else{
                                
                                flagCompro = false;
                            }
                        }

                        if ( !flagCompro ){
                            System.out.println( "Producto no encontrado" );
                        }

                        System.out.println( " " );
                        System.out.println( "************Desea seguir comprando [YES / NO]************" );
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();

                    }

                    if ( flagCompro ){

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

                        regisCompras[contUsuario][0] = new ArrayList<String>();

                        regisCompras[contUsuario][0].add(inputNombre);
                        regisCompras[contUsuario][0].add(inputIdentidad);
                        regisCompras[contUsuario][0].add(inputDireccion);
                        regisCompras[contUsuario][0].add(inputCelular);

                        contUsuario++;

                        System.out.println( "************Factura************" );

                    }

                    break;


                case 2:
                    
                    for ( int i = 0; i < ArrayMedicamentos.size(); i++ ){
                        System.out.println( "Nombre : " + ArrayMedicamentos.get(i).getNombre() + "; Precio : " + ArrayMedicamentos.get(i).getPrecio() + "; Cantidad : " + ArrayMedicamentos.get(i).getCantidad() );
                    }
                    break;
                         
                case 3:

                    System.out.println( "************Digitar la identificaciòn************");
                    String inputIdentidad = sc.nextLine();

                    Boolean flagUsuario = true;

                    for ( int i = 0; i < contUsuario; i++ ){
                        if ( inputIdentidad.equals( regisCompras[i][0].get(1) )){
                            System.out.println( regisCompras[i][1] );
                            flagUsuario = false;
                        }
                    }

                    if ( flagUsuario ){
                        System.out.println( "Usuario no encontrado" );
                    }

                    break;
                    
                case 4:
            }

            System.out.println( "Desea continuar en la pàgina? [YES / NO]" );
            salir = sc.nextLine();
            salir = salir.toLowerCase();
        }
    }
}
