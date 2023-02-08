import java.util.Scanner;

public class Loguin{
  public static void main(String args[]){

   String usuario="",password="";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingrese el usuario: ");
   usuario = entrada.nextLine();
   System.out.println();

   System.out.print("Ingrese el password: ");
   password = entrada.nextLine();

   if(usuario.equals("Andres") && password.equals("123456")  ){
    System.out.println("Bienvenido usuario");
  
  }else{
    System.out.println("Usuario no coincide");  
  }
  
 }
}