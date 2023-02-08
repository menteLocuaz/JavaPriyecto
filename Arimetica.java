public class Arimetica{
  public static void main(String args[]){

   int numero_uno = 5,numero_dos = 3,resultado = 0;
   int parametro = 1;
   switch(parametro){
    case 1: resultado = numero_uno + numero_dos ;
      System.out.println("El resultado de la suma es : "+ resultado);         
      break;
    case 2: resultado = numero_uno - numero_dos ;
      System.out.println("El resultado de la resta es : "+ resultado); 
      break;
    case 3: resultado = numero_uno * numero_dos ;
      System.out.println("El resultado de la multioplicacion es : "+ resultado); 
      break;
    case 4: resultado = numero_uno / numero_dos ;
      System.out.println("El resultado de la divicion es : "+ resultado); 
      break;
    default: System.out.println("ERROR , la  opcion no existe");
      break;

  }
 }
}