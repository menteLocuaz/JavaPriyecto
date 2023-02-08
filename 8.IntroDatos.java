import java.util.Scanner;

public class IntroDatos{
  public static void main(String args[]){
 
   Scanner datoEntrada = new Scanner(System.in);
   String nombre = "";
   int numero_uno = 0,numero_dos = 0,resultado = 0;

   System.out.println("¿Cual es tu nombrre : ?");
   nombre = datoEntrada.nextLine();

   System.out.println("Dame tu primer numero para sumar: ");
   numero_uno = datoEntrada.nextInt();

   System.out.println("Dame tu segundo numero para sumar: ");
   numero_dos = datoEntrada.nextInt();

   resultado = numero_uno + numero_dos;

   System.out.println("Hola " + nombre + ", La respuesta de la suma es : " +  resultado);

 }
}