public class Anidada{
 public static void main(String args[]){

   int operacion = 2;
   int numero_uno = 8;
   int numero_dos = 4;
   int resultado = 0;
  
   if(operacion ==1){
    resultado = numero_uno + numero_dos;
    System.out.println("El resultado de la suma es :" + resultado);   
  }else if(operacion ==2){
    resultado = numero_uno - numero_dos;
    System.out.println("El resultado de la resta es :" + resultado); 
   
  }else if(operacion ==3){
    resultado = numero_uno * numero_dos;
    System.out.println("El resultado de la multiplicacion es :" + resultado);
  }else if(operacion ==4){
    resultado = numero_uno / numero_dos;
    System.out.println("El resultado de la divicion es :" + resultado);
  }else{
    System.out.println("NO hay parametros. ");
  }   
 }
}