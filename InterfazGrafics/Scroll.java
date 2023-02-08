import javax.swing.*;

public class Scroll extends JFrame{
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    public Scroll(){
        setLayout(null);
        // texto
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);
        // area
        textArea1 = new JTextArea();
        // cunado el texto supere el cuadro se pone el scroll y se diseña el ecroll
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10,50,400,300);
        add(scrollPane1);
    }
    public static void main(String[] args){
        Scroll formulario1 = new Scroll();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}