import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener,ChangeListener{
    private JLabel label1,label2;
    private JCheckBox check1;
    private JButton boton1,boton2;
    private JScrollPane scrollPanel1;
    private JTextArea textArea1;
    String nombre="";
    
    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("./images/icon.png")).getImage());
        // recupera el valor de otra clase
        Bienvenida ventanaBienvenidad = new Bienvenida();
        // recuperar una variable
        nombre = ventanaBienvenidad.texto;
        // ETIQUETA DE LOS TITULOS
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Andale Mono",0,9));
        textArea1.setText("\n \n                           TERMINOS Y CONDICIONES         ");
        scrollPanel1 = new JScrollPane(textArea1);
        scrollPanel1.setBounds(20,40,575,200);
        add(scrollPanel1); 
        
        check1 = new JCheckBox("Yo "+ nombre +" Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(20,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(160,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("./images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,545);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);

        }else if(e.getSource() == boton2){

            Bienvenida ventanaBienvenidad = new Bienvenida();
            ventanaBienvenidad.setBounds(0,0,350,450);
            ventanaBienvenidad.setVisible(true);
            ventanaBienvenidad.setResizable(false);
            ventanaBienvenidad.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        Licencia ventanaLincecia = new Licencia();
        ventanaLincecia.setBounds(0,0,650,380);
        ventanaLincecia.setVisible(true);
        ventanaLincecia.setResizable(false);
        ventanaLincecia.setLocationRelativeTo(null);
    }
}
