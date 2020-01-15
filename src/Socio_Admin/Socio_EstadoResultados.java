/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socio_Admin;

import Class_Socio.Tools;
import DATABASE.ToolsDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriel
 */
public class Socio_EstadoResultados extends javax.swing.JFrame {
public String date;
private static final long serialVersionUID = 1L;

    /**
     * Creates new form Socio_EstadoResultados
     * @return 
     */

    @Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }
    public Socio_EstadoResultados(String date) {
        this.date=date;
        initComponents();
        setUtil();
        this.setLocationRelativeTo(null);
        this.setTitle("Estado de Resultados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_ER = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ano = new com.toedter.calendar.JYearChooser();
        mes = new com.toedter.calendar.JMonthChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_ER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total de Ingresos", null, null},
                {"Gastos de Administracion", null, null},
                {"Gastos Financieros", null, null},
                {"Total de Gastos", null, null},
                {"Utilidad", null, null}
            },
            new String [] {
                "Cuenta", "", ""
            }
        ));
        jScrollPane2.setViewportView(T_ER);
        if (T_ER.getColumnModel().getColumnCount() > 0) {
            T_ER.getColumnModel().getColumn(0).setResizable(false);
            T_ER.getColumnModel().getColumn(0).setPreferredWidth(175);
            T_ER.getColumnModel().getColumn(1).setResizable(false);
            T_ER.getColumnModel().getColumn(1).setPreferredWidth(80);
            T_ER.getColumnModel().getColumn(2).setResizable(false);
            T_ER.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 410, 120));

        jButton1.setBackground(new java.awt.Color(0, 0, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, -1));
        jPanel1.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado de Resultados de la Cooperativa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 219, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 492, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socio_users su = new socio_users();
        su.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setUtil();
        
    }//GEN-LAST:event_jButton3ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T_ER;
    private com.toedter.calendar.JYearChooser ano;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JMonthChooser mes;
    // End of variables declaration//GEN-END:variables

    private void setUtil() {
    try {
        double Prest = 0,PrestInt = 0;
        ResultSet rs = ToolsDB.RS("select P.Cod_P,P.Monto as Todo,PC.Monto as Cuota,PC.Fecha,P.Plazo from Prestamo as P, Prestamo_Cuotas as PC where P.Cod_P = PC.Cod_P and P.Aprobado = 1");
        while(rs.next()){
            Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, ano.getYear());
            Calendar cin = Calendar.getInstance(); cin.setTime(rs.getDate("Fecha"));
            if(Tools.calcularMes(cin.getTime(), cfin.getTime()) > 0 && Tools.calcularMes(cin.getTime(), cfin.getTime())<= rs.getInt("Plazo")){
                //A=(P*i)/(1-Math.pow(1+i, -n));
                double An = (rs.getDouble("Todo")*ToolsDB.getInflacion())/(1-Math.pow(1+ToolsDB.getInflacion(), -rs.getInt("Plazo")));
                Prest += Tools.Redondear(2, An);
                PrestInt+= Tools.Redondear(2, Tools.FutDAn(rs.getDouble("Cuota"), ToolsDB.getInteres(), mes.getMonth(), ano.getYear(), rs.getDate("Fecha")));  
            }        
        }
        T_ER.setValueAt(PrestInt-Prest, 0, 2);
        rs = ToolsDB.RS("select * from Catalogo where Cuenta = 'Gts de Administracion'");
        while(rs.next()){
            T_ER.setValueAt(rs.getDouble("Monto"), 1, 1);
        }
        rs = ToolsDB.RS("select * from Catalogo where Cuenta = 'Gts Financieros'");
        while(rs.next()){
            T_ER.setValueAt(rs.getDouble("Monto"), 2, 1);
        }
        T_ER.setValueAt( (Double)T_ER.getValueAt(1, 1) + (Double) T_ER.getValueAt(2, 1), 3, 2);
        T_ER.setValueAt((Double) T_ER.getValueAt(0, 2) - (Double) T_ER.getValueAt(3, 2), 4, 2);
    } catch (SQLException ex) {
        Logger.getLogger(Socio_EstadoResultados.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
}
