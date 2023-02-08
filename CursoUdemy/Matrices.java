public class Matrices{
    public static void main(String args[]){
        // establecemos la matris bidirecional 1. es la fila y 2. la kcolumna
        int tabla[][]= new int[2][2];
        // agregamos los datos en la matris se gun lo pedido 

        tabla[0][0]=5;
        tabla[0][1]=2;
        tabla[1][0]=2;
        tabla[1][1]=5;
        // se muestra la matris en la pantalla

        System.out.print("["+ tabla[0][0] + "]");
        System.out.println("["+ tabla[0][1] + "]");
        System.out.print("["+ tabla[1][0] + "]");
        System.out.print("["+ tabla[1][1] + "]");

    }
}