import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
// se implementa dos complementos
public class TerminosYCondiciones extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1;
    private JCheckBox check1;
    // el boton de cerrar la interfas grafica
    private JButton boton1;
    // construtor
    public TerminosYCondiciones(){
        setLayout(null);
        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10,10,400,30);
        add(label1);

        check1 = new JCheckBox("Acepto");
        check1.setBounds(10,50,100,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
        // desabiliotar boton ,se habilita con la condicion
        boton1.setEnabled(false);
    } 
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
        }else{
            boton1.setEnabled(false);
        }
    }
    // evento de el boton
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        TerminosYCondiciones formulario1 = new TerminosYCondiciones();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}