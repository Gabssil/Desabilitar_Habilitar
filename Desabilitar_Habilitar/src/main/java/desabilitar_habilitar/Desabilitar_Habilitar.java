/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desabilitar_habilitar;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Desabilitar_Habilitar extends JFrame {
    JLabel rotulo1, rotulo2;
    JButton desabilitar, habilitar;
    
    public Desabilitar_Habilitar(){
    super("Exemplo de dasabilitar e habilitar componentes");
    Container tela = getContentPane();
    setLayout(null);
    
    rotulo1 = new JLabel ("Rotulo 1");
    rotulo2 = new JLabel ("Rotulo 2");
    desabilitar = new JButton ("desabilitar");
    habilitar = new JButton ("habilitar");
    
     rotulo1.setBounds(50, 20, 80, 20);
     rotulo2.setBounds(50, 60, 80, 20);
     
     desabilitar.setBounds(80, 100, 100, 20);
     habilitar.setBounds(250, 100, 100, 20);
     
     desabilitar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
            rotulo1.setEnabled(false);
             rotulo2.setEnabled(false);
    }
}
   );
 habilitar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
            rotulo1.setEnabled(true);
             rotulo2.setEnabled(true);
    }
}
   );
 tela.add(rotulo1);
 tela.add(rotulo2);
 tela.add(desabilitar);
 tela.add(habilitar);
 
setSize(400, 500);
setVisible(true);
    }
    
  public static void main(String args[]){
        //criando obj a partir do metodo
        Desabilitar_Habilitar app = new Desabilitar_Habilitar();
        //mostrar as ferramentas 
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
}