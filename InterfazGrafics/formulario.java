import javax.swing.*;

public class formulario extends JFrame{
    // crear el construtor
    public formulario(){
        // como poner la app en cualquie lado de pantalla 
        setLayout(null);
    }
// donde arranca la app 
    public static void main(String args[]){
        // llamamos la clase heredad de JFrame
        formulario formulario1 = new formulario();
        // las codernadas y dimencione que va atener 
        formulario1.setBounds(350,100,400,550);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        // que el usuari no cambie las dimenciones
        formulario1.setResizable(false);

    }

}   