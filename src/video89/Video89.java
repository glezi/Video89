/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video89;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author gleez
 */
public class Video89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoPassword mimarco = new MarcoPassword(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }
    
}

class MarcoPassword extends JFrame{
    public MarcoPassword(){
        
        setBounds(400,300,550,400); 
        LaminaPassword milamina = new LaminaPassword(); 
        add(milamina); 
        setVisible(true); 
        
    }
    
    
}

class LaminaPassword extends JPanel{
    public LaminaPassword(){
        
        setLayout(new BorderLayout()); 
        JPanel lamina_superior = new JPanel(); 
        
        lamina_superior.setLayout(new GridLayout(2,2)); 
        add(lamina_superior, BorderLayout.NORTH); 
        JLabel etiqueta1 = new JLabel("Usuario"); 
        JLabel etiqueta2 = new JLabel("Contraseña"); 
        
        comprueba_pass mievento = new comprueba_pass(); 
        
        JTextField c_usuario = new JTextField(15); 
        c_contra = new JPasswordField(15);
        c_contra.getDocument().addDocumentListener(mievento);
        
        lamina_superior.add(etiqueta1); 
        lamina_superior.add(c_usuario); 
        lamina_superior.add(etiqueta2); 
        lamina_superior.add(c_contra);
        
        JButton enviar = new JButton("Enviar ");
        add(enviar, BorderLayout.SOUTH); 
    }
    
private class comprueba_pass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            //To change body of generated methods, choose Tools | Templates.
            
            char [] contraseña; 
            contraseña =c_contra.getPassword(); 
            if(contraseña.length<8 || contraseña.length>12){
                c_contra.setBackground(Color.red); 
            }else{
                c_contra.setBackground(Color.WHITE); 
            }
            
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            //To change body of generated methods, choose Tools | Templates.
        }
    
}
    JPasswordField c_contra;
}