import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JTextField textField1;
    private JLabel label1,label2,label3,label4;
    private JButton boton1;
    // cualquir pude usarla 
    public static String texto="";

    public Bienvenida(){
        setLayout(null);
        // PARA CERRAR DEFITIVA MENTE
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(245,0,0));
        //obtine la imagen
        setIconImage(new ImageIcon(getClass().getResource("./images/icon.png")).getImage());
        //guaradando el archivo
        ImageIcon image = new ImageIcon("./images/coca-cola.png");
        label1 = new JLabel(image);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema De Control Vacacional");
        label2.setBounds(35,135,300,30);
        // la tipo grafia
        label2.setFont(new Font("Andale Mono",3,18));
        // color de texto
        label2.setForeground(new Color(255,255,255));
        add(label2);
 
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,300,30);
        label3.setFont(new Font("Andale Mono",1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("2023 The Coca-Cola company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textField1 = new JTextField();
        textField1.setBounds(45,240,255,25);
        textField1.setBackground(new Color(224,224,224));
        label4.setFont(new Font("Andale Mono",1,14)); // label4 cambia textfield
        label4.setForeground(new Color(255,0,0));
        add(textField1);

        boton1 = new JButton("ingresar");
        boton1.setBounds(110,280,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono",1,14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            // guardando el texto sin expacion cona la variable trim
            texto = textField1.getText().trim();
            // equals para comparar el contenido de dos objetos en términos de igualdad.
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre. ");
            }else{
                Licencia ventanaLincecia = new Licencia();
                ventanaLincecia.setBounds(0,0,650,380);
                ventanaLincecia.setVisible(true);
                ventanaLincecia.setResizable(false);
                ventanaLincecia.setLocationRelativeTo(null);
                // this se refiere a esta pantalla,El keyword this en Java se utiliza para hacer referencia a la instancia actual de un objeto. Es decir, se utiliza para acceder a los miembros (atributos y métodos) de la misma clase desde dentro de una clase.
                this.setVisible(false);
            }
        }
    }
    public static void main(String[] args){
        Bienvenida ventanaBienvenidad = new Bienvenida();
        ventanaBienvenidad.setBounds(0,0,350,450);
        ventanaBienvenidad.setVisible(true);
        ventanaBienvenidad.setResizable(false);
        ventanaBienvenidad.setLocationRelativeTo(null);
    }
}