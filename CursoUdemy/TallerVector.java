import java.util.Scanner;

public class TallerVector{
    public static void main(String args[]){
        // declaramos la variable y iniciamo la entrada de datos
        Scanner leer = new Scanner(System.in);
        int longitud = 0;

        System.out.print("¿Cuantos numeros deseas ingresar :?");
        longitud = leer.nextInt();
        // el siguiente paso poneso la cantida de array del usuario
        int numeroUser[] = new int[longitud];
        // incrementamos el valor de i de cada vuelta que da y se muestra en la pantalla sin afectar i 
        for(int i=0;i < numeroUser.length; i++){
            System.out.println("Por favor dame el valor de # "+(i+1));
            numeroUser[i] = leer.nextInt();
        }
        // mostrando por pantalla los datos guardados cada vuelta con el aumento de i
        for(int i=0;i<numeroUser.length;i++){
            System.out.print("["+ numeroUser[i] + "]");    
        }

    }

}