import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubMenu extends JFrame implements ActionListener{
    private JMenuBar menuBar1;
    private JMenu menu1,menu2,menu3;
    private JMenuItem menuItem1,menuItem2,menuItem3,menuItem4;

    public SubMenu(){
        setLayout(null);
        menuBar1 = new JMenuBar();
        setJMenuBar(menuBar1);
        // desplegar opciones
        menu1 =  new JMenu("Opciones");
        menuBar1.add(menu1);
        // las dos opciones o desplegable
        menu2 = new JMenu("Tamaño De La Ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Color De Fondo");
        menu1.add(menu3);
        // las opciones
        menuItem1 = new JMenuItem("300*200");
        menu2.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("640*480");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this);

        // el segundo sub menu
        menuItem3 = new JMenuItem("Color Rojo");
        menu3.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Color Verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menuItem1){
            setSize(300,200);
        }else if(e.getSource() == menuItem2){
            setSize(640,480);
        }else if(e.getSource() == menuItem3){
            //  recupra las caratristica y la guardes
            getContentPane().setBackground(new Color(255,0,0));
        }else if(e.getSource() == menuItem4){
            getContentPane().setBackground(new Color(0,255,0));
        }
    }
    public static void main(String[] args){
        SubMenu formulario1 = new SubMenu();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}