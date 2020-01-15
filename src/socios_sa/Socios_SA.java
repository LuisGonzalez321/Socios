/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socios_sa;
import java.io.*;
import Class_Socio.*;
import Socio_Admin.socio_principal;
import roundpanel.RoundPanel;



public class Socios_SA {
   
    public static void main(String[] args) throws IOException,FileNotFoundException{  
          ActiveSesion AS = new ActiveSesion();
           socio_principal mos =  new socio_principal();
           File archivo = new File("C://Users//"+System.getProperty("user.name")+"//Desktop//archivo.txt");    
           archivo.createNewFile();
           AS.Abrir(archivo);
         //  mos();
      }   
    
    public static void mos(){
        System.out.println(""+Tools.Dato("0000A","Nombre1"));
    }
    
}
    

