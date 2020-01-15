/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author gabriel
 */
public class Calendario extends Thread{
    private JLabel ano;
    private JLabel mes;
    private JLabel diaMes;
    private JLabel diaSem;
    
    public Calendario(JLabel ano, JLabel mes, JLabel diaMes, JLabel diaSem) {
        this.ano = ano;
        this.mes = mes;
        this.diaMes = diaMes;
        this.diaSem = diaSem;
    }
    
    public void run() {
        while(true) {
            Date fecha = new Date();
            SimpleDateFormat anoSDF = new SimpleDateFormat("yyyy");
            ano.setText(anoSDF.format(fecha));
            
            SimpleDateFormat mesSDF = new SimpleDateFormat("MMMM");
            mes.setText(mesSDF.format(fecha));
           
            SimpleDateFormat diaMesSDF = new SimpleDateFormat("dd");
            diaMes.setText(diaMesSDF.format(fecha));
            
            SimpleDateFormat diaSemSDF = new SimpleDateFormat("EEEE");
            diaSem.setText(diaSemSDF.format(fecha));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
