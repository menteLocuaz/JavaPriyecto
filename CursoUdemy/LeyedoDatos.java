import java.util.Scanner; // importamos el modulo

public class LeyedoDatos{
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in); // este metodo lee los datos entrados por el ususario 
        int edad =0;
        System.out.println("¿Cual es tu edad ? :");
        edad = leer.nextInt();

        System.out.println("Yo tambien tengo "+ edad +" años");

    }
}