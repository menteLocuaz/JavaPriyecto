import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menuOpciones,menuCalculadora,menuAcercaDe,menuColorDeFondo;
    private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreado,miSalir,miNuevo;
    private JLabel labelLogo,labelBIenvenidad,labelTitle,labelNombre,labelPaterno,labelMaterno,labelDepartamento,labelAntiguedad,labelResultado,labelFooter; 
    private JTextField textNombreDeTrabajador,textApaternoTrabajador,textoMaternoTrabajador;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JScrollPane scrollPanel1;
    private JTextArea textArea1;

    public Principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("./images/icon.png")).getImage());
        // crear la barra de occione la de refenrencia
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);
        // agragar los menus
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);
        // menu de clacular
        menuCalculadora = new JMenu("Calculadora");
        menuCalculadora.setBackground(new Color(255,0,0));
        menuCalculadora.setFont(new Font("Andale Mono",1,14));
        menuCalculadora.setForeground(new Color(255,255,255));
        mb.add(menuCalculadora);
        // menu acercade
        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(225,255,255));
        mb.add(menuAcercaDe);
        // menu de cambio de color de fondo
        menuColorDeFondo = new JMenu("Color de fondo");
        menuColorDeFondo.setBackground(new Color(255,0,0));
        menuColorDeFondo.setFont(new Font("Andale Mono",1,14));
        menuColorDeFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorDeFondo);
        // item de calcular las vacaciones
        miCalculo = new JMenuItem("Calcular Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setBackground(new Color(224,224,224));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalculadora.add(miCalculo);
        miCalculo.addActionListener(this);
        // los itemm de cambio de color de fondo
        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorDeFondo.add(miRojo);
        miRojo.addActionListener(this);
        // negro
        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorDeFondo.add(miNegro);
        miNegro.addActionListener(this);
        // morad0
        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorDeFondo.add(miMorado);
        miMorado.addActionListener(this);
        // los items de el menu de opciones
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        // el item de el menu de acerca de
        miElCreado = new JMenuItem("El Creador");
        miElCreado.setFont(new Font("Andale Mono",1,14));
        miElCreado.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreado);
        miElCreado.addActionListener(this);
        // pocicionar las etiquetas 
        ImageIcon imagen = new ImageIcon("./images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(190,14,250,100);
        add(labelLogo);

        /*labelBIenvenidad = new JLabel("Bienvenido");
        labelBIenvenidad.setBounds(280,30,300,50);
        labelBIenvenidad.setFont(new Font("Andale Mono",1,32));
        labelBIenvenidad.setForeground(new Color(255,255,255));
        add(labelBIenvenidad);*/

        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);
        // la casilla don se entra los dato scomo nombre,apellido 
        labelNombre = new JLabel("Nombre completo: ");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        textNombreDeTrabajador = new JTextField();
        textNombreDeTrabajador.setBounds(25,213,150,25);
        textNombreDeTrabajador.setBackground(new java.awt.Color(224,224,224));
        textNombreDeTrabajador.setFont(new Font("Andale Mono",1,14));
        textNombreDeTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(textNombreDeTrabajador); 
        
        labelPaterno = new JLabel("Apellido paterno");
        labelPaterno.setBounds(25,250,150,25);
        labelPaterno.setFont(new Font("Andale Mono",1,12));
        labelPaterno.setForeground(new Color(255,255,255));
        add(labelPaterno);

        textApaternoTrabajador = new JTextField();
        textApaternoTrabajador.setBounds(25,273,150,25);
        textApaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        textApaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        textApaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(textApaternoTrabajador);

        labelMaterno = new JLabel("Apellido materno");
        labelMaterno.setBounds(25,308,108,25);
        labelMaterno.setFont(new Font("Andale Mono",1,12));
        labelMaterno.setForeground(new Color(255,255,255));
        add(labelMaterno);

        textoMaternoTrabajador = new JTextField();
        textoMaternoTrabajador.setBounds(25,334,150,25);
        textoMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        textoMaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        textoMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(textoMaternoTrabajador);

        labelDepartamento = new JLabel("Seleciona el departamento: ");
        labelDepartamento.setBounds(220,193,220,25);
        labelDepartamento.setBackground(new java.awt.Color(224,224,224));
        labelDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
        labelDepartamento.setForeground(new java.awt.Color(255,255,255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,220,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224,224,224));
        comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new java.awt.Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al cliente");
        comboDepartamento.addItem("Departemento de losgica");
        comboDepartamento.addItem("Departamento de gerencia");
        
        labelAntiguedad = new JLabel("Selecciona la antiguedad: ");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);   

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 año de servicio");
        // la pantalla de resultado
        labelResultado = new JLabel("Resultado del resultado");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);
        // cuador que muestra el resulytado
        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224,224,224));
        textArea1.setFont(new Font("Andale Mono",1,11));
        textArea1.setForeground(new Color(255,0,0));
        textArea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
        scrollPanel1 = new JScrollPane(textArea1);
        scrollPanel1.setBounds(220,333,385,90);
        add(scrollPanel1);

        labelFooter = new JLabel("2023 The coca-cola company | todos los derechos reservados");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelFooter.setForeground(new java.awt.Color(255,255,255));
        add(labelFooter);
    } 
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == miCalculo){
            String nomnbreTrabajador=textNombreDeTrabajador.getText();
            String AP = textApaternoTrabajador.getText();
            String AM = textoMaternoTrabajador.getText();
            String departameto1 = comboDepartamento.getSelectedItem().toString();
            String antigueda1 = comboAntiguedad.getSelectedItem().toString();

            if(nomnbreTrabajador.equals("") || AP.equals("") || AM.equals("") || departameto1.equals("") || antigueda1.equals("")){
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos");
            }else{
                if(departameto1.equals("1 año de servicio")){
                    textArea1.setText("el trabajador recibe 6 dia vacaciones");
                }
                if(departameto1.equals("2 a 6 años de servicio")){
                    textArea1.setText("el trabajador recibe 14 dia vacaciones");
                }
                if(departameto1.equals("7 año de servicio")){
                    textArea1.setText("el trabajador recibe 20 dia vacaciones");
                }
            }
        }
        if(e.getSource() == miNegro){

        }
        if(e.getSource() == miMorado){

        }
        if(e.getSource() == miNuevo){

        }
        if(e.getSource() == miSalir){
            Bienvenida ventanaBienvenidad = new Bienvenida();
            ventanaBienvenidad.setBounds(0,0,350,450);
            ventanaBienvenidad.setVisible(true);
            ventanaBienvenidad.setResizable(false);
            ventanaBienvenidad.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == miElCreado){
            JOptionPane.showMessageDialog(null,"Este sistema es un tema de desarrollo\n");
        }else{
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,545);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
        }
    }
    public static void main(String[] args){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,545);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
} 