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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class Prestamos extends javax.swing.JFrame {
public String date;
private static final long serialVersionUID = 1L;


    public Prestamos(String date) {
        this.date=date;
        initComponents();
        L_capital.setText(getDineroLiquido());
        this.setLocationRelativeTo(null);
        this.setTitle("Prestamos");
        
    }
   @Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_anual = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        L_idsocio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L_abonom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        L_sal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        L_tasardmto = new javax.swing.JLabel();
        L_monto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        B_nel = new javax.swing.JButton();
        B_acept = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListPrestamosPdts = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPrestamos = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        L_capital = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mes = new com.toedter.calendar.JMonthChooser();
        years = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 80));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Anualidades:");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 23));

        T_anual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        T_anual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuota", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(T_anual);
        if (T_anual.getColumnModel().getColumnCount() > 0) {
            T_anual.getColumnModel().getColumn(0).setResizable(false);
            T_anual.getColumnModel().getColumn(1).setResizable(false);
            T_anual.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 387, 193));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 80));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prestamos");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 440, 23));

        L_idsocio.setBackground(new java.awt.Color(255, 255, 255));
        L_idsocio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_idsocio.setForeground(new java.awt.Color(0, 0, 80));
        L_idsocio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_idsocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 23));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 80));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Abono Mensual:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 138, 23));

        L_abonom.setBackground(new java.awt.Color(255, 255, 255));
        L_abonom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_abonom.setForeground(new java.awt.Color(0, 0, 80));
        L_abonom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_abonom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, 23));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Salario Mensual: ");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 23));

        L_sal.setBackground(new java.awt.Color(255, 255, 255));
        L_sal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_sal.setForeground(new java.awt.Color(0, 0, 80));
        L_sal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, 23));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 80));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Tasa de Rendimiento: ");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 23));

        L_tasardmto.setBackground(new java.awt.Color(255, 255, 255));
        L_tasardmto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_tasardmto.setForeground(new java.awt.Color(0, 0, 80));
        L_tasardmto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_tasardmto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, 23));

        L_monto.setBackground(new java.awt.Color(255, 255, 255));
        L_monto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_monto.setForeground(new java.awt.Color(0, 0, 80));
        L_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 23));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 80));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Prestamo Solicitado: ");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 23));

        B_nel.setBackground(new java.awt.Color(0, 0, 102));
        B_nel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_nel.setForeground(new java.awt.Color(255, 255, 255));
        B_nel.setText("Denegar");
        B_nel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_nelActionPerformed(evt);
            }
        });
        jPanel1.add(B_nel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        B_acept.setBackground(new java.awt.Color(0, 0, 102));
        B_acept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B_acept.setForeground(new java.awt.Color(255, 255, 255));
        B_acept.setText("Aceptar");
        B_acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_aceptActionPerformed(evt);
            }
        });
        jPanel1.add(B_acept, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 80));
        jLabel11.setText("Prestamos pedidos:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 23));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 80));
        jLabel12.setText("Prestamos hechos:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 133, 23));

        ListPrestamosPdts.setModel(setPrestPdts());
        ListPrestamosPdts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        ListPrestamosPdts.setToolTipText("");
        ListPrestamosPdts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListPrestamosPdtsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ListPrestamosPdts);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, -1));

        ListPrestamos.setModel(setPrestamos());
        ListPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListPrestamos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 130));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 80));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("El Capital Actual es de: ");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 170, 23));

        L_capital.setBackground(new java.awt.Color(255, 255, 255));
        L_capital.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        L_capital.setForeground(new java.awt.Color(0, 0, 80));
        L_capital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(L_capital, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 110, 23));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID del Socio: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 138, 23));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));
        jPanel1.add(years, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoclaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 710, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socio_users sp =new socio_users();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_nelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_nelActionPerformed
       String cod_p = ListPrestamosPdts.getSelectedValue();
       if(cod_p != null){
            int f = ToolsDB.Actualizar("update Prestamo set Monto = 0.0 where Cod_P = '"+cod_p+"'");
            if(f !=0){
            JOptionPane.showMessageDialog(null, "Prestamo Denegado");
            ListPrestamosPdts.setModel(setPrestPdts());
            }else{
            JOptionPane.showMessageDialog(null, "Error, se recomienda llorar hasta que se repare");
            }   
       }
           
    }//GEN-LAST:event_B_nelActionPerformed

    private void B_aceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_aceptActionPerformed
        String cod_p = ListPrestamosPdts.getSelectedValue();
    if(cod_p !=null){
           int f = ToolsDB.Actualizar("update Prestamo set Aprobado = 1 where Cod_P = '"+cod_p+"'");
            if(f !=0){
            java.util.Date Actual;
            Calendar c = Calendar.getInstance();
            c.set(Calendar.MONTH, mes.getMonth());
             c.set(Calendar.YEAR, years.getYear());
            Actual = c.getTime();
            JOptionPane.showMessageDialog(null, "Prestamo Aceptado");
            ToolsDB.Actualizar("insert into Prestamo_Cuotas values ('"+cod_p+"','"+Tools.getFecha(Actual)+"',"+A+","+Tools.numRows("select * from Prestamo_Cuotas")+")");
            ListPrestamosPdts.setModel(setPrestPdts());
            ListPrestamos.setModel(setPrestamos());
        }else{
            JOptionPane.showMessageDialog(null, "Error, se recomienda llorar hasta que se repare");
        } 
    }
        
    }//GEN-LAST:event_B_aceptActionPerformed

    private void ListPrestamosPdtsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListPrestamosPdtsMouseClicked
    try {
        String cod_p = ListPrestamosPdts.getSelectedValue();
        System.out.println(cod_p);
        ResultSet rs = ToolsDB.RS("select P.ID_Socio,S.Ahorro_Mensual,S.Salario_Mensual,P.Monto,P.Cod_P,S.Tasa_Rendimiento from My_Socios as S,Prestamo as P where P.ID_Socio = S.ID_Socio and P.Cod_P = '"+cod_p+"' ");
        while(rs.next()){
            L_idsocio.setText(rs.getString("ID_Socio"));
            L_abonom.setText(rs.getString("Ahorro_Mensual"));
            L_sal.setText(rs.getString("Salario_Mensual"));
            L_tasardmto.setText(String.format("%.2f", Float.parseFloat(rs.getString("Tasa_Rendimiento"))*100)+"%");
            L_monto.setText(rs.getString("Monto"));
            Tools.limpiarTabla(T_anual);
            setTabla(cod_p);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ListPrestamosPdtsMouseClicked

    private void ListPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListPrestamosMouseClicked
    try {
        String cod_p = ListPrestamos.getSelectedValue();
        System.out.println(cod_p);
        ResultSet rs = ToolsDB.RS("select P.ID_Socio,S.Ahorro_Mensual,S.Salario_Mensual,P.Monto,P.Cod_P,S.Tasa_Rendimiento from My_Socios as S,Prestamo as P where P.ID_Socio = S.ID_Socio and P.Cod_P = '"+cod_p+"' ");
        while(rs.next()){
            L_idsocio.setText(rs.getString("ID_Socio"));
            L_abonom.setText(rs.getString("Ahorro_Mensual"));
            L_sal.setText(rs.getString("Salario_Mensual"));
            L_tasardmto.setText(String.format("%.2f", Float.parseFloat(rs.getString("Tasa_Rendimiento"))*100)+"%");
            L_monto.setText(rs.getString("Monto"));
            Tools.limpiarTabla(T_anual);
            setTabla(cod_p);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_ListPrestamosMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_acept;
    private javax.swing.JButton B_nel;
    private javax.swing.JLabel L_abonom;
    private javax.swing.JLabel L_capital;
    private javax.swing.JLabel L_idsocio;
    private javax.swing.JLabel L_monto;
    private javax.swing.JLabel L_sal;
    private javax.swing.JLabel L_tasardmto;
    private javax.swing.JList<String> ListPrestamos;
    private javax.swing.JList<String> ListPrestamosPdts;
    private javax.swing.JTable T_anual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JMonthChooser mes;
    private com.toedter.calendar.JYearChooser years;
    // End of variables declaration//GEN-END:variables

    private ListModel<String> setPrestPdts() {
     DefaultListModel modelo = new DefaultListModel();
        try {
            ResultSet rs = ToolsDB.RS("select * from Prestamo where Aprobado = 0 and Monto != 0");
        while(rs.next()){
            modelo.addElement(rs.getString("Cod_P"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    private ListModel<String> setPrestamos() {
     DefaultListModel modelo = new DefaultListModel();
        try {
            ResultSet rs = ToolsDB.RS("select * from Prestamo where Aprobado = 1");
        while(rs.next()){
            modelo.addElement(rs.getString("Cod_P"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;        
    }
    double A;//anualidad
    private void setTabla(String cod_p) {
        try {
            double i,P = 0;
            int n =0;
            java.util.Date fecha = null; 
            ResultSet rs;
            i = ToolsDB.getInteres();
            rs = ToolsDB.RS("select * from Prestamo where Cod_P = '"+cod_p+"'");
            while(rs.next()){
                P = rs.getDouble("Monto");
                n = rs.getInt("Plazo");
                fecha = rs.getDate("Fecha");
            }
            // Anualidades
            A=(P*i)/(1-Math.pow(1+i, -n));
            for (int j = 0; j < n; j++) {
                DefaultTableModel e = (DefaultTableModel) T_anual.getModel();
                Object [] row = new Object[3];
                row[0] = j+1;
                row[1] = String.format("%.2f", A);
                Calendar c = Calendar.getInstance();
                row[2] = Tools.getFecha(fecha);
                c.setTime(fecha);
                c.add(Calendar.MONTH, 1);
                fecha = c.getTime();
                e.addRow(row);
                
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    private String getDineroLiquido() {
    double money = 0;
        try {
        
        double interes = ToolsDB.getInteres();
        java.util.Date Socio = null,Actual;
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, mes.getMonth());
        c.set(Calendar.YEAR, years.getYear());
        Actual = c.getTime();
        double abonos = 0,monto,prestamos = 0;
        int meses;
        ResultSet rs = ToolsDB.RS("select * from Ahorro_Apertura");
        while(rs.next()){
            Socio = rs.getDate("Fecha");
            monto = rs.getDouble("Monto");
            meses = Tools.calcularMes(Socio, Actual);
            if(meses >0)
            // calculando el futuro dada anualidad y tiempo
            abonos += monto * ((Math.pow(1+interes, meses)-1)/interes);
            else if(meses == 0){
                abonos += monto;
            }
        }
        rs = ToolsDB.RS("select PC.Monto , PC.Fecha,P.Plazo from Prestamo as P,Prestamo_Cuotas as PC where P.Aprobado = 1");
        while(rs.next()){
            Socio = rs.getDate("Fecha");
            meses = Tools.calcularMes(Socio, Actual);
            monto = rs.getDouble("Monto");
            if(meses >0 && meses <= rs.getInt("Plazo")){
                prestamos += monto * ((Math.pow(1+interes, meses)-1)/interes);
            }else if(meses == 0){
                prestamos += monto;
            }
        }
        money = abonos - prestamos;
        return ""+money;
    } catch (SQLException ex) {
        Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
    }
    return money+"";
    }
}
