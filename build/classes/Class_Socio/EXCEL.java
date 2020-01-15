/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import java.awt.HeadlessException;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author gabriel
 */
public class EXCEL{
       
       private  File archivo;
       private List<JTable> tabla;
       private List<String> nombres;
       
       public EXCEL(File file,List<JTable> tabla,List<String> nombres){
              this.archivo = file;
              this.tabla =  tabla;
              this.nombres=nombres;
              if(nombres.size() != tabla.size())
                  try {
                      throw new Exception("Error");
              } catch (Exception ex) {
                  Logger.getLogger(EXCEL.class.getName()).log(Level.SEVERE, null, ex);
              }
       }
       
       public  boolean exportar(){
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(archivo));
            WritableWorkbook w = Workbook.createWorkbook(out);
            for(int i=0;i<tabla.size();i++) {
                JTable table = tabla.get(i);
                WritableSheet s = w.createSheet(nombres.get(i), 0);
                for(int j=0;j<table.getColumnCount();j++) {
                    String nmcol = table.getColumnName(j);
                    s.addCell(new Label(j, 0, nmcol));
                    for(int k=0;k<table.getRowCount();k++) {
                        Object object = table.getValueAt(k, j);
                        s.addCell(new Label(j,k+1, String.valueOf(object)));
                    }
                }
            }
            w.write();
            w.close();
            out.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EXCEL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(EXCEL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch(WriteException ex){
            return false;
        }
    }
       
           public static void excel(JTable T){
        if(T.getRowCount()>0){
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter =  new FileNameExtensionFilter("Archivos de Excel",".xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar Archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(T);
                nom.add("Nómina");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    EXCEL e = new EXCEL(new File(file), tb, nom);
                    if(e.exportar()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados en el directorio seleccionado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (HeadlessException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }
           
     public static void Grabar(String cad, String NombreArchivo)
        {
        File f = new File(NombreArchivo);
        FileWriter fw;
        try {
              fw = new FileWriter(f);
              fw.write(cad);
              fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EXCEL.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
     
     
       
}
