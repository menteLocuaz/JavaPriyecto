import javax.swing.*;
// esta inportado toda la libreria no recomendable
// el JFrame es el contenedor 
public class LibreriSwin extends JFrame{
    // una etiqueta de entrada datos
    private JLabel label1;
    // crear un costrutor
    public LibreriSwin(){
        // como colocar los elementos en la interfax o app
        setLayout(null);
        // mensaje en pantalla de la app
        label1 = new JLabel("Mensange en pantalla en java");
        // las dimenciones de la ventala o app
        label1.setBounds(100,50,200,300);
        //  todo lo creaod lo agregamos
        add(label1);    

    }

    public static void main(String args[]){
        LibreriSwin formulario = new LibreriSwin();
        formulario.setBounds(0,0,400,300);
        // para que el metedo se vea o la interfaz
        formulario.setVisible(true);
        // que la interfaz aparesca en el centro de la pantalla
        formulario.setLocationRelativeTo(null);
    }
}