import java.util.Scanner;

public class Compara{
  public static void main(String args[]){

   String nombre_uno="",nombre_dos="";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingrese el primer nombre : ");
   nombre_uno = entrada.nextLine();
   System.out.println();

   System.out.print("Ingrese el segundo nombre : ");
   nombre_dos = entrada.nextLine();

   if(nombre_uno.equals(nombre_dos) ){
    System.out.println("Los nombre son iguales");
  
  }else{
    System.out.println("Los nombre son diferentes");  
  }
  
 }
}