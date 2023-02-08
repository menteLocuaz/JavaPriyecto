import java.util.Scanner;

public class MatrisDinamica{
    public static void main(String args[]){
        // iniciamos el metodo de entrada de datos
        Scanner leer = new Scanner(System.in);
        int fila =0;
        int columnas =0;
        int contador =1;

        // pedimos los datos al usuario
        System.out.print("Cuantas filas deseas? : ");
        fila = leer.nextInt();
        System.out.print("Cuantas columnas desea ? : ");
        columnas = leer.nextInt();
        // iniciamos la katris bidiricional con los datos pedido
        int tabla[][] = new int[fila][columnas];
        // ponemos los datos segun la matris dada
        for(int j=0; j<fila; j++){
            for(int i=0; i<columnas; i++){
                tabla[j][i]=contador;
                contador++;
                System.out.println("["+tabla[j][i]+"]");
            }
            // salto final 
            System.out.println("");
        } 
    }
}