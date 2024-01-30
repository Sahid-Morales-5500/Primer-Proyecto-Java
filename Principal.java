import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
  private JMenuBar Menubar;
  private JMenu Opciones, Calcular, AcercaDe, ColorFondo;
  private JMenuItem Calculo,Rojo,Negro,Morado,Creador,Nuevo,Salir;
  private JLabel Logo, Bienvenido, Titulo, Nombre, AP, AM, Departamento, Antiguedad, Resultado, Footer;
  private JTextField nombre, ap, am;
  private JComboBox Dep, Ant;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String NombreAdministrador = "";


  public Principal () {
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla Principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventana = new Bienvenida();
   NombreAdministrador = ventana.texto;

   Menubar = new JMenuBar();
   Menubar.setBackground(new Color(255,0,0));
   setJMenuBar(Menubar);

   Opciones = new JMenu("Opciones");
   Opciones.setBackground(new Color(255,0,0));
   Opciones.setFont(new Font("Roboto", 1, 14));
   Opciones.setForeground(new Color(255,255,255));
   Menubar.add(Opciones);

   Calcular = new JMenu("Calcular");
   Calcular.setBackground(new Color(255,0,0));
   Calcular.setFont(new Font("Roboto", 1, 14));
   Calcular.setForeground(new Color(255,255,255));
   Menubar.add(Calcular);

   AcercaDe = new JMenu("Acerca de");
   AcercaDe.setBackground(new Color(255,0,0));
   AcercaDe.setFont(new Font("Roboto", 1, 14));
   AcercaDe.setForeground(new Color(255,255,255));
   Menubar.add(AcercaDe);

   ColorFondo = new JMenu("Color de Fondo");
   ColorFondo.setFont(new Font("Roboto", 1, 14));
   ColorFondo.setForeground(new Color(255,0,0));
   Opciones.add(ColorFondo);

   Calculo = new JMenuItem("Vacaciones");
   Calculo.setFont(new Font("Roboto", 1, 14));
   Calculo.setForeground(new Color(255,0,0));
   Calcular.add(Calculo);
   Calculo.addActionListener(this);

   Rojo = new JMenuItem("Rojo");
   Rojo.setFont(new Font("Roboto", 1, 14));
   Rojo.setForeground(new Color(255,0,0));
   ColorFondo.add(Rojo);
   Rojo.addActionListener(this);
   
   Negro = new JMenuItem("Negro");
   Negro.setFont(new Font("Roboto", 1, 14));
   Negro.setForeground(new Color(255,0,0));
   ColorFondo.add(Negro);
   Negro.addActionListener(this);


   Morado = new JMenuItem("Morado");
   Morado.setFont(new Font("Roboto", 1, 14));
   Morado.setForeground(new Color(255,0,0));
   ColorFondo.add(Morado);
   Morado.addActionListener(this);

   Nuevo = new JMenuItem("Nuevo");
   Nuevo.setFont(new Font("Roboto", 1 ,14));
   Nuevo.setForeground(new Color(255,0, 0));
   Opciones.add(Nuevo);
   Nuevo.addActionListener(this);

   Creador = new JMenuItem("El Creador");
   Creador.setFont(new Font("Roboto", 1, 14));
   Creador.setForeground(new Color(255,0, 0));
   AcercaDe.add(Creador);
   Creador.addActionListener(this);

   Salir = new JMenuItem("Salir");
   Salir.setFont(new Font("Roboto", 1, 14));
   Salir.setForeground(new Color(255,0, 0));
   Opciones.add(Salir);
   Salir.addActionListener(this);

   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   Logo = new JLabel(imagen);
   Logo.setBounds(5,5,250,100);
   add(Logo);

   Bienvenido = new JLabel("Bievenido " + NombreAdministrador);
   Bienvenido.setBounds(280,30,300,50);
   Bienvenido.setFont(new Font("Roboto", 1, 32));
   Bienvenido.setForeground(new Color(255,255,255));
   add(Bienvenido);

   Titulo = new JLabel("Datos del trabajador para el Calculo de vacaciones");
   Titulo.setBounds(45,140,900,25);
   Titulo.setFont(new Font("Roboto", 0, 24));
   Titulo.setForeground(new Color(255,255,255));
   add(Titulo);

   Nombre = new JLabel("Nombre Completo");
   Nombre.setBounds(25,188,180,25);
   Nombre.setFont(new Font("Roboto",1, 12));
   Nombre.setForeground(new Color(255,255,255));
   add(Nombre);
   
   nombre = new JTextField();
   nombre.setBounds(25,213,150,25);
   nombre.setBackground(new java.awt.Color(224,224,224));
   nombre.setFont(new java.awt.Font("Roboto", 1, 14));
   nombre.setForeground(new java.awt.Color(255,0,0));
   add(nombre);

   AP = new JLabel("Apellido Paterno");
   AP.setBounds(25,248,180,25);
   AP.setFont(new Font("Roboto", 1, 12));
   AP.setForeground(new Color(255,255,255));
   add(AP);
   
   ap = new JTextField();
   ap.setBounds(25,273,150,25);
   ap.setBackground(new java.awt.Color(224,224,224));
   ap.setFont(new java.awt.Font("Roboto", 1, 14));
   ap.setForeground(new java.awt.Color(255,0,0));
   add(ap);

   AM = new JLabel("Apellido Materno");
   AM.setBounds(25,308,180,25);
   AM.setFont(new Font("Roboto", 1, 12));
   AM.setForeground(new Color(255,255,255));
   add(AM);

   am = new JTextField();
   am.setBounds(25,334,150,25);
   am.setBackground(new java.awt.Color(224,224,224));
   am.setFont(new java.awt.Font("Roboto", 1, 14));
   am.setForeground(new java.awt.Color(255,0,0));
   add(am);

   Departamento = new JLabel("Selecciona el Deparatamento");
   Departamento.setBounds(220,188,180,25);
   Departamento.setFont(new Font("Roboto",1, 12));
   Departamento.setForeground(new Color(255,255,255));
   add(Departamento);

   Dep = new JComboBox();
   Dep.setBounds(220,213,220,25);
   Dep.setBackground(new java.awt.Color(224,224,224));
   Dep.setFont(new java.awt.Font("Roboto", 1, 14));
   Dep.setForeground(new java.awt.Color(255,0,0));
   add(Dep);
   Dep.addItem("");
   Dep.addItem("Atencion al Cliente");
   Dep.addItem("Departamento de Logistica");
   Dep.addItem("Departamento de Gerencia");

   Antiguedad = new JLabel("Selecciona la Antiguedad");
   Antiguedad.setBounds(220,248,180,25);
   Antiguedad.setFont(new Font("Roboto", 1, 12));
   Antiguedad.setForeground(new Color(255,255,255));
   add(Antiguedad);

   Ant = new JComboBox();
   Ant.setBounds(220,273,220,25);
   Ant.setBackground(new java.awt.Color(224,224,224));
   Ant.setFont(new java.awt.Font("Roboto", 1, 14));
   Ant.setForeground(new java.awt.Color(255,0,0));
   add(Ant);
   Ant.addItem("");
   Ant.addItem("1 año de servicio");
   Ant.addItem("2 a 6 años de servicio");
   Ant.addItem("7 años o mas de servicio"); 

   Resultado = new JLabel("Resultado del Calculo");
   Resultado.setBounds(220,307,180,25);
   Resultado.setFont(new Font("Roboto", 1, 12));
   Resultado.setForeground(new Color(255,255,255));
   add(Resultado);
   
   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setBackground(new Color(224,224,224));
   textarea1.setFont(new Font("Roboto", 1, 11));
   textarea1.setForeground(new Color(255,0,0));
   textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
   scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(220,333,385,90);
   add(scrollpane1);

   Footer = new JLabel("©2024 The Coca-Cola Company | Todos los derechos reservados");
   Footer.setBounds(135,445,500,30);
   Footer.setFont(new java.awt.Font("Roboto", 1, 12));
   Footer.setForeground(new java.awt.Color(255, 255, 255));
   add(Footer);
   
 }

 public void actionPerformed(ActionEvent e) {
   if (e.getSource() == Calculo) {
    String NombreTrabajador = nombre.getText();
    String ApellidoP = ap.getText();
    String ApellidoM = am.getText();
    String Departamento = Dep.getSelectedItem().toString();
    String Antiguedad = Ant.getSelectedItem().toString();

    if(NombreTrabajador.equals("") || ApellidoP.equals("") || ApellidoM.equals("") || 
     Departamento.equals("") || Antiguedad.equals("")) {
     JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
   } else {
     if(Departamento.equals("Atencion al Cliente")) {
      if(Antiguedad.equals("1 año de servicio")) {
       textarea1.setText("\n El trabajador " + NombreTrabajador + " " + AP + " " + AM +
                         "\n quien labora en " + Departamento + " con " + Antiguedad +
                         "\n  recibe 6 dias de vacaciones.");
     }
     if(Antiguedad.equals("2 a 6 años de servicio")) {
       textarea1.setText("\n El trabajador " + NombreTrabajador + " " + AP + " " + AM +
                         "\n quien labora en " + Departamento + " con " + Antiguedad +
                         "\n  recibe 14 dias de vacaciones.");

    }
    if(Antiguedad.equals("7 años o mas de servicio")) {
       textarea1.setText("\n El trabajador " + NombreTrabajador + " " + AP + " " + AM +
                         "\n quien labora en " + Departamento + " con " + Antiguedad +
                         "\n  recibe 20 dias de vacaciones.");

   }
   

  }
  if(Departamento.equals("Departamento de Logistica")) {
   if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 7 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 15 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 22 días de vacaciones.");
				}
}
if(Departamento.equals("Departamento de Gerencia")) {
  if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 10 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + NombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 30 días de vacaciones.");
				}
	    		}
            }
	
			
   }


   if (e.getSource() == Rojo) {
    getContentPane().setBackground(new Color(255,0,0));

   }
   if (e.getSource() == Negro) {
    getContentPane().setBackground(new Color(0,0,0));
   }
   if (e.getSource() == Morado) {
     getContentPane().setBackground(new Color(51,0,51));
   }
   if (e.getSource() == Nuevo) {
    nombre.setText("");
    ap.setText("");
    am.setText("");
    Dep.setSelectedIndex(0);
    Ant.setSelectedIndex(0);
    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");

   }
   if (e.getSource() == Salir) {
    Bienvenida bienvenida = new Bienvenida();
    bienvenida.setBounds(0,0,350,450);
    bienvenida.setVisible(true);
    bienvenida.setResizable(false);
    bienvenida.setLocationRelativeTo(null);
    this.setVisible(false);

   }
   if (e.getSource() == Creador) {
      JOptionPane.showMessageDialog(null,"Desarrollado por Sahid Morales");
                                               
   }
 }

    public static void main(String args[]) {
    Principal ventana = new Principal();
    ventana.setBounds(0,0,640,535);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
  }
}