import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonRgb extends JFrame implements ActionListener{
    private JLabel label1, label2, label3;
    private JComboBox combo1,combo2,combo3;
    private JButton boton1;

    public BotonRgb(){
        setLayout(null);
        label1 = new JLabel("Rojo");
        label1.setBounds(10,10,100,10);
        add(label1);

        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);
        for(int i=0; i <= 255; i++){
            combo1.addItem(String.valueOf(i));
        }
        add(combo1);

        label2 = new JLabel("Verde");
        label2.setBounds(10,60,100,10);
        add(label2);

        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        for(int i=0; i <= 255; i++){
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);

        label3 = new JLabel("Azul");
        label3.setBounds(10,100,100,10);
        add(label3);

        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for(int i=0; i <= 255; i++){
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);
        // disño de boton
        boton1 = new JButton("Fijar color");
        boton1.setBounds(30,150,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String cadena1 = combo1.getSelectedItem().toString();
            String cadena2 = combo2.getSelectedItem().toString();
            String cadena3 = combo3.getSelectedItem().toString();

            int rojo = Integer.parseInt(cadena1);
            int verde = Integer.parseInt(cadena2);
            int azul = Integer.parseInt(cadena3);
            
            // manegar colores
            Color colo1 = new Color(rojo,verde,azul);
            // que hacer con el color
            boton1.setBackground(colo1);
        }

    }
    public static void main(String[] args){
        BotonRgb formulario1 = new BotonRgb();
        formulario1.setBounds(0,0,300,250);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}