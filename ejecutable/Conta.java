import java.util.Scanner;

public class Conta{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String cadena ="",sub_cadena="";
   int num_carater=0, inicio=0, hasta=0;
 
   System.out.print("Introduce cualquier palabra : ");
   cadena = entrada.nextLine();

   num_carater = cadena.length();

   System.out.println("La cantidad de caracter  es de : " +num_carater);
 
   System.out.print("¿Deme el inicio de la palabra para cortar: ?");
   inicio = entrada.nextInt();
   System.out.print("¿Deme el final de la palabra para cortar: ?");
   hasta = entrada.nextInt();

   sub_cadena = cadena.substring(inicio,hasta);
   System.out.println("El resultado de la accion es : " +sub_cadena);  

 }
}