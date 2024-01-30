import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Condiciones extends JFrame implements ActionListener, ChangeListener {
 private JLabel Titulo, Imagen;
 private JCheckBox Verificado;
 private JButton Aceptar, Declinar;
 private JScrollPane Scroll;
 private JTextArea Area;
 String nombre = "";

 public Condiciones() {
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto;
  
   Titulo = new JLabel("TERMINOS Y CONDICIONES");
   Titulo.setBounds(215,5,200,30);
   Titulo.setFont(new Font("Roboto", 1, 14));
   Titulo.setForeground(new Color(0,0,0));
   add(Titulo);

   Area = new JTextArea();
   Area.setEditable(false);
   Area.setFont(new Font("Roboto", 0 , 9));
   Area.setText("Terminos y Condiciones");
   Scroll = new JScrollPane(Area);
   Scroll.setBounds(10,40,575,200);
   add(Scroll);

   Verificado = new JCheckBox("Yo " + nombre + " Acepto");
   Verificado.setBounds(10,250,300,30);
   Verificado.addActionListener(this);
   add(Verificado);

   Aceptar = new JButton("Continuar");
   Aceptar.setBounds(10,290,100,30);
   Aceptar.addActionListener(this);
   Aceptar.setEnabled(true);
   add(Aceptar);

   Declinar = new JButton("No Acepto");
   Declinar.setBounds(120,290,100,30);
   Declinar.addActionListener(this);
   Declinar.setEnabled(true);
   add(Declinar);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   Imagen = new JLabel(imagen);
   Imagen.setBounds(315,135,300,300);
   add(Imagen);
 }

  public void stateChanged(ChangeEvent e) {
        if (Verificado.isSelected() == true) {
            Aceptar.setEnabled(true);
            Declinar.setEnabled(false);
        } else {
            Aceptar.setEnabled(false);
            Declinar.setEnabled(true);
        }
    }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == Aceptar) {
     Principal ventana = new Principal();
     ventana.setBounds(0,0,640,535);
     ventana.setVisible(true);
     ventana.setResizable(false);
     ventana.setLocationRelativeTo(null);
     this.setVisible(false);

  } else if(e.getSource() == Declinar) {
     Bienvenida bienvenida = new Bienvenida();
   bienvenida.setBounds(0,0,350,450);
   bienvenida.setVisible(true);
   bienvenida.setResizable(false);
   bienvenida.setLocationRelativeTo(null);
   this.setVisible(false);
  }
 }

 public static void main(String args[]) {
  Condiciones ventana = new Condiciones();
  ventana.setBounds(0,0,600,360);
  ventana.setVisible(true);
  ventana.setResizable(false);
  ventana.setLocationRelativeTo(null);
 }
}