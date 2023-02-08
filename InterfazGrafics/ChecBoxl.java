import javax.swing.*;
import javax.swing.event.*;

public class ChecBoxl extends JFrame implements ChangeListener {
    private JCheckBox check1,check2,check3;

    public ChecBoxl(){
        setLayout(null);
        check1 = new JCheckBox("Ingles");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("Frances");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Aleman");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
    }
    public void stateChanged(ChangeEvent e){
        String cadena="";
        // crear la estrutura condicional
        if(check1.isSelected() == true ){
            cadena = cadena + " Ingles-";   
        }
        if(check2.isSelected() == true){
            cadena = cadena + " Frances-";
        }
        if(check3.isSelected() == true){
            cadena = cadena + " Aleman-";
        }
        setTitle(cadena);
    }
    public static void main(String[] args){
        ChecBoxl formulario1 = new ChecBoxl();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}