import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        Integer edad = input.nextInt();

        input.close();

        if ( edad < 18 ){
            System.out.println("Usted aún es un niño(a).");
        }
    }
}