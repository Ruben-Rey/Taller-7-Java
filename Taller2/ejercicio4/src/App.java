import java.io.*;
import java.util.*;

public class App {
 
    public static void main(String[] args){
        // Creacion del arrayList para guardar los atributos de Peliculas
        ArrayList<Peliculas> arrayPeliculas = new ArrayList<Peliculas>();

        File file = new File("ListaPeliculas.txt");
        
        try {
            Scanner leer = new Scanner(file);

            while ( leer.hasNextLine() ){
                String data = leer.nextLine();
                String [] separarData = data.split(",");

                Peliculas pelicula = new Peliculas();

                pelicula.setNombre(separarData[0]);
                pelicula.setGenero(separarData[1]);
                pelicula.setPais(separarData[2]);
                pelicula.setCantidad(Integer.parseInt(separarData[3]));
                
                arrayPeliculas.add(pelicula);
            }
            
            leer.close();

        } catch ( FileNotFoundException error ) {
            System.out.println( "Exepcion al abrir el archivo " + error );
        }

        Iterator<Peliculas> itrPelicula = arrayPeliculas.iterator();

        // Array de registro de usuarios
        ArrayList<Usuarios> regisUsuarios = new ArrayList<>();

        // Matriz registro de Peliculas
        String [][] regisPeliculas = new String[15][15];

        Scanner sc = new Scanner( System.in );
        int cont = 0;
        String salir = "yes";


        while ( salir.equals("yes") ){
	    System.out.println( "Bienvenido a la Video tienda" );
            System.out.println( "----------------------------------" );
            System.out.println("1. Alquilar películas");
            System.out.println("2. Consultar películas disponibles");
            System.out.println("3. Recibir películas");
            System.out.println("4. Salir de la app");
            System.out.println( " " );
            System.out.println("************Elegir una opción************");

            int opcion = sc.nextInt();
            String saltoLinea = sc.nextLine();

            itrPelicula = arrayPeliculas.iterator();
            Peliculas pelis = itrPelicula.next();
            
            switch ( opcion ){

                case 1:
                    int contIndice = 0;

                    salir = "yes";
                    while ( salir.equals("yes")){

                        while ( itrPelicula.hasNext() ){
                            
                            if ( pelis.getCantidad() > 0 ){
                                System.out.println( pelis.getNombre() );
                                pelis = itrPelicula.next();
                            }
                        }
                    
                        itrPelicula = arrayPeliculas.iterator();
                        System.out.println( " " );
                        System.out.println("************Digite la pelicula que desea alquilar :************");
                        String inputPeli = sc.nextLine();
                        inputPeli = inputPeli.toLowerCase();

                        while ( itrPelicula.hasNext() ){
                            pelis = itrPelicula.next();

                            if ( pelis.getCantidad() > 0 ){
                                System.out.println( pelis.getNombre() );
                                if ( pelis.getNombre().equals(inputPeli) ){
                                    regisPeliculas[cont][contIndice] = inputPeli;
                                    pelis.decreCantidad();
                                    contIndice++;
                                }
                            }
                        }

                        System.out.println( " " );
                        System.out.println("************Desea seguir comprando ? [YES / NO]************");
                        salir = sc.nextLine();
                        salir = salir.toLowerCase();
                    }

                    cont = cont + 1;

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
                    int inputCelular = sc.nextInt();
                    saltoLinea = sc.nextLine();
                    System.out.println( " " );

                    Usuarios u1 = new Usuarios( inputNombre, inputIdentidad, inputDireccion, inputCelular );
                    regisUsuarios.add(u1);

                    break;

                case 2:
                     //Recorre el arrayList e imprime las peliculas
                    itrPelicula = arrayPeliculas.iterator();

                    while ( itrPelicula.hasNext() ){
                        pelis = itrPelicula.next();

                        if ( pelis.getCantidad() > 0 ){

                            System.out.println( "Titulo :" + pelis.getNombre() + "\n" +
                                    "Genero :" + pelis.getGenero() + "\n" +
                                    "Pais :" + pelis.getPais() + "\n" +
                                    "Cantidad :" + pelis.getCantidad() + "\n" + 
                                    "-------------------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println( " " );
                    System.out.println( "************Ingrese su identificaciòn************");
                    inputIdentidad = sc.nextLine();

                    Boolean bandera = false;

                    for ( int i = 0; i < regisUsuarios.size(); i++ ){
                        if ( inputIdentidad.equals( regisUsuarios.get(i).getIdentidad() ) ){
                            for ( int j = 0; j < regisPeliculas[i].length; j++ ){
                                if ( regisPeliculas[i][j] == null ){
                                    break;
                                }else{
                                    retornaPeli( arrayPeliculas, regisPeliculas[i][j] );
                                    regisPeliculas[i][j] = "";
                                }
                            }
                            regisUsuarios.remove(i);
                            cont--;
                        } 
                            bandera = true;
                    }
                    

                    if ( bandera ){
                        System.out.println( "************La pelicula esta en buen estado?************" );
                        String inputEstado = sc.nextLine();
                        inputEstado = inputEstado.toLowerCase();
                        if ( inputEstado.equals("yes") ){
                            System.out.println( "Recepcion correcta " );
                        }
                        else {
                            System.out.println( "************Ingrese detalles del mal estado************" );
                            String inputDaños = sc.nextLine();
                        }


                    }else{
                        System.out.println( "Identificaciòn no encontrada" );
                        
                    }

            }

            System.out.println( " " );
            System.out.println("************Desea regresar al menu ? [YES / NO]************");
            salir = sc.nextLine();
            salir = salir.toLowerCase();
        }
        sc.close();
    }

    public static void retornaPeli( ArrayList<Peliculas> arrayPeliculas, String pelicula ){

        for ( int i = 0; i < arrayPeliculas.size(); i++ ){
            if ( arrayPeliculas.get(i).getNombre().equals( pelicula )) {
                arrayPeliculas.get(i).increCantidad();
                System.out.println( "Pelicula :\"" + pelicula + "\" Revisar el estado del producto" );
            }
        }
    }
}



