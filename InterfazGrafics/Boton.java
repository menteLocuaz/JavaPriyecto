import javax.swing.*;
import java.awt.event.*; // import la funcionalidad 
 // el imple y actionlo que este atento del evento o accion
public class Boton extends JFrame implements ActionListener{

    JButton boton1;
    public Boton(){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(250,250,100,30);
        add(boton1);
        // agregar el evento
        boton1.addActionListener(this);
    }
    // hacer el evento del boton para qu lo escuche o capture
    public void actionPerformed(ActionEvent evento){
        // captura el evento y lo conpara si es el correcto el boton,que boton preciono
        if(evento.getSource() == boton1){
            // funcion de cerrar
            System.exit(0);
        }
    }
    public static void main(String args[]){
        Boton formulario1 = new Boton();
        formulario1.setBounds(0,0,400,350);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}


