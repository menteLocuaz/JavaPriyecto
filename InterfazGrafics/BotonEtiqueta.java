import javax.swing.*;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3;
    private JLabel label1;
    // diseño de costrutor o componente
    public BotonEtiqueta(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        // la espera de evento
        boton1.addActionListener(this);
        // seguiente boton
        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        // el 3 boton
        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        // diselo de la etiqueta
        label1 = new JLabel("En espera ......");
        label1.setBounds(10,10,300,30);
        add(label1);

    } 
    public void actionPerformed(ActionEvent eve){
        if(eve.getSource() == boton1){
            label1.setText("Has precionado el booton 1");
        }else if(eve.getSource() == boton2){
            label1.setText("Has precionado el boton 2");
        }else if(eve.getSource() == boton3){
            label1.setText("Has precionado el boton 3");
        }else{
            label1.setText("no hay opciones");
        }

    }

    public static void main(String args[]){
        BotonEtiqueta formulario1 = new BotonEtiqueta();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
    
}