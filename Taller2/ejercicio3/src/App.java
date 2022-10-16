import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = input.nextLine();

        System.out.println("Ingrese su edad");
        Integer edad = input.nextInt();

        input.close();

        if ( edad >= 18 ){
            System.out.println(nombreCompleto + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }else{
            System.out.println(nombreCompleto + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}