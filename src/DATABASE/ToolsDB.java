/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ToolsDB {
       public static String Query;

    public static double getRendimiento(String idsocio) {
        double tasa = 0;  
        try {
               ResultSet rs = ToolsDB.RS("select Tasa_Rendimiento from My_Socios where ID_Socio = '"+idsocio+"'");
               while(rs.next()){
                   tasa += rs.getDouble("Tasa_Rendimiento");
               }
               rs = ToolsDB.RS("select * from Admin");
               while(rs.next()){
                   tasa += rs.getDouble("Inflacion");
               }
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex);
           }
        return tasa;
    }

    public static double getInflacion() {
        double inf = 0;   
        try {
               ResultSet rs = ToolsDB.RS("select * from Admin");
               while(rs.next()){
                   inf = rs.getDouble("Inflacion");
               }  
        } catch (SQLException ex) {
            Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inf;
    }
    public static ArrayList<String> Conexion(String ruta){
        FileReader f = null;
        ArrayList<String> lineas = new ArrayList<>(4);
        try {
            String cadena;
            f = new FileReader(ruta);
            try (BufferedReader b = new BufferedReader(f)) {
                while((cadena = b.readLine())!=null) {
                    lineas.add(cadena);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lineas;
    }  

       

       
       public static ResultSet RS(String sql){
              try{
                  ArrayList<String> conexion = ToolsDB.Conexion("Conexion.txt");
                  Class.forName(conexion.get(0));
                  Connection cn = DriverManager.getConnection(conexion.get(1),conexion.get(2),conexion.get(3));
                  Statement st = cn.createStatement();
                  ResultSet rs=st.executeQuery(sql);
                  return rs;  
              }catch(SQLException | ClassNotFoundException ex){
                  System.err.println(ex);
                  return null;
              }   
       }

       public static int Actualizar(String dato){
              try{
                  ArrayList<String> conexion = ToolsDB.Conexion("Conexion.txt");
                  Class.forName(conexion.get(0));
                  Connection cn = DriverManager.getConnection(conexion.get(1),conexion.get(2),conexion.get(3));
                  Statement st = cn.createStatement();
                  return st.executeUpdate(dato);
              }catch(SQLException | ClassNotFoundException ex){
                  System.err.println(ex);
                  return 0;
              }
       }
       public static double getInteres(){
          double i = 0,INT = 0,inf = 0; 
          try {
               
               ResultSet rs = ToolsDB.RS("select * from Admin");
               while (rs.next()){
                   inf = rs.getFloat("Inflacion");
                   INT = rs.getFloat("Interes");
               }  /**
                * la inflacion es tasa nominal, por ende,  se pasa a efectiva anual capitalizable mensualmente
                */
               inf = Math.pow(1 + inf/12, 12) - 1;
               /**
                * De efectiva anual capitalizable mensualmente, se pasa a efectiva mensual capitalizable mensualmente
                */
               inf = Math.pow(1 + inf, 1.0/12.0) - 1;
               i = inf + INT;
           } catch (SQLException ex) {
               Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
           }
          return i;
       }
       
       
   public static String datoReturn(String ID,String datR,String columna){
        try {
               String si=null;
               ResultSet rs = ToolsDB.RS("select "+datR+" from "+columna+" where ID_Socio='"+ID+"'");
               while(rs.next()){
                   si = rs.getString(datR);
               }
               return si;
           } catch (SQLException ex) {
               Logger.getLogger(ToolsDB.class.getName()).log(Level.SEVERE, null, ex);
           }
           return null;
      
    }
//    public static void main(String[] args) throws IOException {
//        String ruta = "Conexion.txt";
//        File archivo = new File(ruta);
//        BufferedWriter bw;
//        bw = new BufferedWriter(new FileWriter(archivo));
//        bw.write("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        bw.newLine();
//        bw.append("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC");
//        bw.newLine();
//        bw.append("Axel_Luis");
//        bw.newLine();
//        bw.append("ellanoteama");
//        bw.close();
//    }
       
       //Metodos que no ocupo
   /**   
       public static Statement esta(){
               try{
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  //Connection cn = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Connection cn = DriverManager.getConnection("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Statement st = cn.createStatement();
                  return st;
              }catch(SQLException | ClassNotFoundException ex){
                  return null;
              } 
       } 
       public static Statement STADD(){
              try{
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  //Connection cn = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Connection cn = DriverManager.getConnection("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Statement st = cn.createStatement();
                  st.executeUpdate(Query);
                  return st;
              }catch(SQLException | ClassNotFoundException ex){
                  return null;
              } 
       }
        public static Statement STADD(String sql){
              try{
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  //Connection cn = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Connection cn = DriverManager.getConnection("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Statement st = cn.createStatement();
                  st.executeUpdate(sql);
                  return st;
              }catch(SQLException | ClassNotFoundException ex){
                  return null;
              } 
       }

       
      public static ResultSet RS(){
      try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          //Connection cn = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
          Connection cn = DriverManager.getConnection("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC","Axel_Luis","ellanoteama");
          Statement st = cn.createStatement();
          ResultSet rs=st.executeQuery(Query);
          return rs;  
      }catch(SQLException | ClassNotFoundException ex){
          return null;
      }   
       }
       */
}
