package Class_Socio;

import Socio_Admin.socio_principal;
import Socio_Admin.socio_users;
import java.io.*;

public class ActiveSesion implements Serializable{

    private static final long serialVersionUID = 1L;
      boolean actived=false;
      String ID;
       
     public ActiveSesion(boolean a,String ID){
              this.actived=a;
              this.ID = ID;
      }

    public ActiveSesion(){}

    public void SCerrar(boolean ce) throws IOException{
          File archivo = new File("C://Users//"+System.getProperty("user.name")+"//Desktop//archivo.txt");
          try (FileWriter FW = new FileWriter(archivo)) {
              if(archivo.exists()){
                  FW.write("true");
                  FW.close();
              }else{
                  archivo.createNewFile();
                  FW.write("true");
                  FW.close();
              }
                  
          }
    }
    
    public void Cerrar(boolean ce) throws IOException{
          File archivo = new File("C://Users//"+System.getProperty("user.name")+"//Desktop//archivo.txt");
          try (FileWriter FW = new FileWriter(archivo)) {
              if(archivo.exists()){
                  FW.write("false");
                  FW.close();
              }else
                  archivo.createNewFile();
                 FW.write("false");
          }
    }
    
    public void Abrir(File archivo) throws FileNotFoundException,IOException{
           Socio_Admin.socio_principal sp =new socio_principal();
           Socio_Admin.socio_users su =  new socio_users();
          // File archivo = new File("C://Users//"+System.getProperty("user.name")+"//Desktop//archivo.txt");
           FileReader FR = new FileReader(archivo);
           BufferedReader br = new BufferedReader(FR);
           if(!archivo.exists()){
                archivo.createNewFile();
             //   sp.setVisible(true);
           }else
              if("true".equals(br.readLine())){
                 su.setVisible(true);
              }else 
              // if("false".equals(br.readLine())){
                 sp.setVisible(true);    
    }
       
   
    
}
