/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author gabriel
 */
public class Reloj extends Thread{
   
    
    private JLabel reloj;
    
    public Reloj(JLabel label) {
        this.reloj = label;
    }
    
    public void run() {
        while(true) {
            Date hora = new Date();    
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            reloj.setText(sdf.format(hora));      
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
