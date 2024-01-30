import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
 private JLabel Logo, Titulo, Nombre, Copyright;
 private JTextField Espacio_Nombre;
 private JButton Boton_Ingreso;
 public static String texto = ""; 

 public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   Logo = new JLabel(imagen);
   Logo.setBounds(25,15,300,150);
   add(Logo);
  
   // JLabel//
   Titulo = new JLabel("Sistema de Control Vacacional");
   Titulo.setBounds(35,135,300,30);
   Titulo.setFont(new Font("Roboto", 1, 18));
   Titulo.setForeground(new Color(255,255,255));
   add(Titulo);

   Nombre = new JLabel("Ingrese su nombre");
   Nombre.setBounds(45,212,200,30);
   Nombre.setFont(new Font("Roboto", 1, 12));
   Nombre.setForeground(new Color(255,255,255));
   add(Nombre);

   Copyright = new JLabel("©2024 The Coca-Cola Company");
   Copyright.setBounds(85,375,300,30);
   Copyright.setFont(new Font("Roboto", 1, 12));
   Copyright.setForeground(new Color(255,255,255));
   add(Copyright);

   // TextField //
   Espacio_Nombre = new JTextField ();
   Espacio_Nombre.setBounds(45,240,255,25);
   Espacio_Nombre.setBackground(new Color(224,224,224));
   Espacio_Nombre.setFont(new Font("Roboto", 1, 14));
   Espacio_Nombre.setForeground(new Color(255,0,0));
   add(Espacio_Nombre);
   
   // Boton //
   Boton_Ingreso = new JButton("Ingresar");
   Boton_Ingreso.setBounds(125,280,100,30);
   Boton_Ingreso.setBackground(new Color(255,255,255));
   Boton_Ingreso.setFont(new Font("Roboto", 1, 14));
   Boton_Ingreso.setForeground(new Color(255,0,0));
   Boton_Ingreso.addActionListener(this);
   add(Boton_Ingreso);
 }

 
 public void actionPerformed(ActionEvent e) {
  if(e.getSource() == Boton_Ingreso){
     texto = Espacio_Nombre.getText().trim();
     if(texto.equals("")) {
       JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
   } else {
     Condiciones ventana = new Condiciones();
     ventana.setBounds(0,0,600,360);
     ventana.setVisible(true);
     ventana.setResizable(false);
     ventana.setLocationRelativeTo(null);
     this.setVisible(false);
   }
  }
 }

 public static void main(String args[]) {
   Bienvenida bienvenida = new Bienvenida();
   bienvenida.setBounds(0,0,350,450);
   bienvenida.setVisible(true);
   bienvenida.setResizable(false);
   bienvenida.setLocationRelativeTo(null);
 }
}
