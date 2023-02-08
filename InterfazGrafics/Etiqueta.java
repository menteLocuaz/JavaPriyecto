import javax.swing.*;

public class Etiqueta extends JFrame{
    // iniciamos la etiqeta
    private JLabel label1;
    private JLabel label2;
    // darle diseño y se inicia contructor
    public Etiqueta(){
        setLayout(null);
        label1 = new JLabel("Interfaz grafica ^__^");
        label1.setBounds(50,20,300,30);
        add(label1);
        label2 = new JLabel("Version 0.1");
        label2.setBounds(30,100,100,30);
        add(label2);
    }
    // iniciamos el programa
    public static void main(String args[]){
        Etiqueta formulario1 = new Etiqueta();
        // diseño de interfas
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);

    }
}