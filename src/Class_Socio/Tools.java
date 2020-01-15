/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class Tools {
    
     public static String generateID(int n){
        // numero maximo 170587 socios
        int x = 0,n1 = 0,n2 = 0,n3 = 0,n4 = 0;char c = 0;
        boolean y = true;
        while(y){
            for (char i = 'A'; i <= 'Z'; i++) {
                x++;
                if(x == n){
                    c = i;
                    y = false;
                }
            }
            if(y){
                n4++;
            }
            if(n4==9){
                n4 = 0; 
                n3++;
                if(n3 == 9){
                    n3 = 0; 
                    n2++;
                    if(n2 == 9){
                        n2 = 0;
                        n1++; 
                        if(n1 == 9){
                            System.err.println("NUM. MAX. SOCIOS");
                            break;
                        }
                    }
                }
            }
        }
        if(y){
            return null;
        }else{
            return n1+""+n2+""+n3+""+n4+""+c;
        }
        
    }
     
        public static int numRows(String sql){
        int n = 0;
        try {
           // Connection consulta;
            ResultSet rs;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection consulta = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC:1433;databaseName=CAC","Axel_Luis","ellanoteama");
           // Connection consulta = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
            Statement st = consulta.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                n++;
            }
            n++;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ERROR "+ex.toString());
        }
        return n;
    }
    
        private static boolean Validar(ArrayList<String> Words, String Cadena, char Clave) {
        int c = 0;
        for (int i = 0; i < Cadena.length(); i++) {
             if(Cadena.charAt(i)== Clave){
                c++;
             }
        }
        return c == Words.size();
    }
     
    public static String setString(String Cadena,ArrayList<String> Words,char Clave){
        String res = "";
        char [] x = Cadena.toCharArray();
        if(Validar(Words,Cadena,Clave)){
            int first = 0;
            int cont = 0;
            String temp = "";
            for (int i = first; i < x.length; i++) {
                 if(x[i]!= Clave){
                    temp = temp+x[i];
                 }else{
                    res  = res + temp + Words.get(cont);
                    cont ++;
                    temp = "";
                    first = i + 1;
                }
                
                
            }
            res = res + temp;
        }else{
            System.err.println("Numero de Words, superior a la presencias de "+Clave+".");
        }
        return res;
    }
    
    
    public static int plazo(Date date){
           Calendar c = Calendar.getInstance();
           c.setTime(date);
           return 12-c.get(Calendar.MONTH);
    }   
    
    public static String getFecha(Date date,int i) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            return c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+i+2)+"-"+c.get(Calendar.DAY_OF_MONTH);   
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Corrijala y vuelva a intentarlo", "Error de Fecha", WARNING_MESSAGE);
            return null;
        }
    }
    
    public static String getFecha(Date date) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            return c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH);   
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Corrijala y vuelva a intentarlo", "Error de Fecha", WARNING_MESSAGE);
            return null;
        }
    }
     
    public static String generateCA_CP(int n, char c){
        int n1 = 0,n2 = 0,n3 = 0,n4 = 0;
        if(n!=0){
            for (int i = 0; i < n; i++) {
                n4++;
                if(n4 == 9){
                    n3++; n4 = 0;
                    if(n3 == 9){
                        n2++; n3 = 0;
                        if(n2 == 9){
                            n1++; n2 = 0;
                            if(n1 == 9){
                                System.err.println("NUM MAX");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return c+""+n1+""+n2+""+n3+""+n4;
    }
    
     public static void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
      
  
   public static String Dato(String ID,String dato){
          try{
              String da=null;
              String sql = "select "+dato+" from My_Socios where ID_Socio='"+ID+"'";
              ResultSet rs=DATABASE.ToolsDB.RS(sql);
              while(rs.next()){
                    da = rs.getString(dato);
              }
              return da;
          }catch(SQLException  ex){
          return null;
          }
   }
     
   public static float valor(String ID,String dato){
           try{
              String da=null;
              float valor=0;
              String sql = "select "+dato+" from My_Socios";
              ResultSet rs=DATABASE.ToolsDB.RS(ID);
              while(rs.next()){
                    da = rs.getString("dato");
              }
              valor = Float.parseFloat(da);
              return valor;
          }catch(SQLException  ex){
          return 0;
          }
   } 
   /**
     * 
     * @param ini
     * @param fin
     * @return
     */
    public static int calcularMes(java.util.Date ini, java.util.Date fin){
     
        Calendar cini,cfin; cini = Calendar.getInstance();
        cfin = Calendar.getInstance();
        cini.setTime(ini); cfin.setTime(fin);
        int anos = cfin.get(Calendar.YEAR) - cini.get(Calendar.YEAR);
        int meses = cfin.get(Calendar.MONTH) - cini.get(Calendar.MONTH);
        int dias = cfin.get(Calendar.DATE) - cini.get(Calendar.DATE);
        return anos *12 +meses + dias/30;
    }

    /**
     * 
     * @param monto Monto de la anualidad
     * @param interes Interes pues que mas xd
     * @param monthF Mes en el que estoy
     * @param yearF Year en el que estoy xd
     * @param datei Fecha en la que se empezo a efectuarse las anualidades
     * @return Te mueve el dinero en el tiempo dado anualidad en n periodos 
     */
    public static double FutDAn(double monto, double interes, int monthF, int yearF, java.sql.Date datei) {
        java.util.Date datef = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, monthF);
        c.set(Calendar.YEAR, yearF);
        Calendar c1 = Calendar.getInstance(); c1.setTime(datei);
        java.util.Date dateiN = new Date();dateiN = c1.getTime();
        c.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH));
        datef = c.getTime();
        int mesesdif = Tools.calcularMes(dateiN, datef);
        return monto * ((Math.pow(1+interes, mesesdif)-1)/interes);
    }

    public static double FutDPres(double monto, double interes, int monthF, int yearF, java.sql.Date datei) {
        java.util.Date datef = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, monthF);
        c.set(Calendar.YEAR, yearF);
        Calendar c1 = Calendar.getInstance(); c1.setTime(datei);
        java.util.Date dateiN = new Date();dateiN = c1.getTime();
        c.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH));
        datef = c.getTime();
        int mesesdif = Tools.calcularMes(dateiN, datef);
        double res = monto * Math.pow(1 + interes, mesesdif);
        return res;
    }
    
    public static double PresDFut(double monto, double interes, int monthF, int yearF, java.sql.Date datei) {
        java.util.Date datef = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, monthF);
        c.set(Calendar.YEAR, yearF);
        Calendar c1 = Calendar.getInstance(); c1.setTime(datei);
        java.util.Date dateiN = new Date();dateiN = c1.getTime();
        c.set(Calendar.DAY_OF_MONTH, c1.get(Calendar.DAY_OF_MONTH));
        datef = c.getTime();
        int mesesdif = Tools.calcularMes(dateiN, datef);
        return monto * Math.pow(1 + interes, -mesesdif);
    }   
    /**
     * Se valida un JTextField de tal manera que:
     * No se admitan espacios consecutivos
     * Solo se admitan letras
     * Solo se digiten 'x' caracteres
     * @param j
     * @param x 
     */
    public static void Nombres(JTextField j,int x){
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke){
                int n = j.getText().length();
                if(n!=0){
                    if(j.getText().charAt(n - 1)==' '){
                        if(ke.getKeyChar() == ' '){
                            ke.consume();
                        }
                    }
                }else{
                    if(ke.getKeyChar() == ' '){
                        ke.consume();
                    }
                }
                if(j.getText().length()>x){
                    ke.consume();
                }
                
            }
        });
    }
     public static void Numeros(JTextField j){
        j.addKeyListener(new  KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
                if(ke.getKeyChar()>'9'||ke.getKeyChar()<'.'){
                        ke.consume();
                        
                }
                if(ke.getKeyChar()=='/') {
                    ke.consume();
                }
                if(j.getText().length()>10){
                    ke.consume();
                }
                if(ExistPuntos(j)){
                    if(ke.getKeyChar()=='.')
                        ke.consume();
                }
                
            }


        });
    }
    private static boolean ExistPuntos(JTextField j) {
        for (int i = 0; i < j.getText().length(); i++) {
            if(j.getText().charAt(i)=='.')
                return true;
        }
        return false;
    }
    public static double Redondear(int decimales,double Numero){
        String s = "%."+decimales+"f";
        return Double.parseDouble(String.format(s, Numero));
    }
    public static String cleanString(String cadena) {
        String normalized = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\P{ASCII}+");
        return pattern.matcher(normalized).replaceAll("");
    }
    
   public static boolean startsWith(String cadena, String prefijo) {
        String c = cleanString(cadena).toLowerCase();
        String p = cleanString(prefijo).toLowerCase();
         return c.startsWith(p);
    }
}
