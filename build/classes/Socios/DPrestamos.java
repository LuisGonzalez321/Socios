/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socios;

import Class_Socio.Tools;
import DATABASE.ToolsDB;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author gabriel
 */
public class DPrestamos extends javax.swing.JFrame {
public String ID;
public  Date date;
private static final long serialVersionUID = 1L;
    private final Comparable MesRest;

    public DPrestamos(String ID,Date date) {
        this.date=date;
        this.ID=ID;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        MesRest = 11 - c.get(Calendar.MONTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Prestamos");
        initComponents();
        setTabla(L_codp.getText());
        jDateChooser1.setDate(new java.util.Date());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Solicitud = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_pagos = new javax.swing.JTable();
        L_id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        L_codp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L_interes = new javax.swing.JLabel();
        TF_monto = new javax.swing.JTextField();
        S_plazo = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        B_sol = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Solicitud.setUndecorated(true);
        Solicitud.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        Solicitud.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 210));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 150, -1));

        T_pagos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        T_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuota", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_pagos.getTableHeader().setReorderingAllowed(false);
        T_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_pagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T_pagos);
        if (T_pagos.getColumnModel().getColumnCount() > 0) {
            T_pagos.getColumnModel().getColumn(0).setResizable(false);
            T_pagos.getColumnModel().getColumn(1).setResizable(false);
            T_pagos.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 350, 360));

        L_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_id.setForeground(new java.awt.Color(255, 255, 255));
        L_id.setText("ID del Prestamo Realizado: ");
        jPanel1.add(L_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        L_codp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_codp.setForeground(new java.awt.Color(255, 255, 255));
        L_codp.setText(getCodigo());
        jPanel1.add(L_codp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 160, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Monto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, -1));

        L_interes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_interes.setForeground(new java.awt.Color(255, 255, 255));
        L_interes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_interes.setText(getInteres());
        jPanel1.add(L_interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, -1));

        TF_monto.setBackground(new java.awt.Color(204, 255, 204));
        TF_monto.setForeground(new java.awt.Color(153, 255, 255));
        TF_monto.setOpaque(false);
        jPanel1.add(TF_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 120, -1));

        S_plazo.setModel(new javax.swing.SpinnerNumberModel(0, 0, MesRest
            , 1));
    jPanel1.add(S_plazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(153, 255, 255));
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("Solicitar Prestamo: ");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, -1));

    B_sol.setBackground(new java.awt.Color(0, 0, 0));
    B_sol.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    B_sol.setForeground(new java.awt.Color(255, 255, 255));
    B_sol.setText("Solicitar");
    B_sol.setOpaque(false);
    B_sol.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            B_solActionPerformed(evt);
        }
    });
    jPanel1.add(B_sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, 30));

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Plazo: ");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, -1));

    jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("Los pagos se haran por mes");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 300, -1));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Socio so = new Socio(ID);
            so.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void T_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_pagosMouseClicked
       
    }//GEN-LAST:event_T_pagosMouseClicked

    private void B_solActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_solActionPerformed
    try{
        if(!existPrestamo()){
            if(Double.parseDouble(TF_monto.getText())>10000 || Double.parseDouble(TF_monto.getText())<500){
                    JOptionPane.showMessageDialog(null, "El monto debe de ser entre 500 y 10000","Monto fuera de rango",JOptionPane.ERROR_MESSAGE);

                }else{
                    ToolsDB.Actualizar("insert into Prestamo values('"+Tools.generateCA_CP(Tools.numRows("select * from Prestamo"), 'P')+"','"+Tools.getFecha(date)+"',"+TF_monto.getText()+","+S_plazo.getValue()+",'"+ID+"',0)");
                    JOptionPane.showMessageDialog(null, "Prestamo Solicitado, dentro de poco la Administracion se comunicara con usted");
                    TF_monto.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Un prestamo ya fue hecho o esta en proceso de aceptacion");
        }       
    }catch(NumberFormatException|HeadlessException ex){
        System.err.println(ex);
    }    
        
    }//GEN-LAST:event_B_solActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_sol;
    private javax.swing.JLabel L_codp;
    private javax.swing.JLabel L_id;
    private javax.swing.JLabel L_interes;
    private javax.swing.JSpinner S_plazo;
    private javax.swing.JDialog Solicitud;
    private javax.swing.JTextField TF_monto;
    private javax.swing.JTable T_pagos;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private String getCodigo() {
    String codigo = null;
    try {
        ResultSet rs = ToolsDB.RS("select * from Prestamo where ID_Socio = '"+ID+"'");
        while(rs.next()){
            codigo = rs.getString("Cod_P");
        }
    } catch (SQLException ex) {
        Logger.getLogger(DPrestamos.class.getName()).log(Level.SEVERE, null, ex);
    }
        return codigo;
    }

private void setTabla(String cod_p) {
        try {
            double i,P = 0,A;
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
                DefaultTableModel e = (DefaultTableModel) T_pagos.getModel();
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


    private String getInteres() {
        try {
            ResultSet rs = ToolsDB.RS("select * from Admin");
            double inf = 0,INT = 0;
            while (rs.next()){
                inf = rs.getFloat("Inflacion");
                INT = rs.getFloat("Interes");
            }
            /**
             * la inflacion es tasa nominal, por ende,  se pasa a efectiva anual capitalizable mensualmente
             */
            inf = Math.pow(1 + inf/12, 12) - 1;
            /**
             * De efectiva anual capitalizable mensualmente, se pasa a efectiva mensual capitalizable mensualmente
             */
            inf = Math.pow(1 + inf, 1.0/12.0) - 1;
            return "El interes que usa la Coop. es de : "+String.format("%.2f ",(INT+inf)*100)+"%";
        } catch (SQLException ex) {
            
            Logger.getLogger(DPrestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }

    private boolean existPrestamo() {
        boolean y = false;
            try {
                ResultSet rs = ToolsDB.RS("select * from Prestamo where ID_Socio = '"+ID+"'");
                while(rs.next()){
                    y = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DPrestamos.class.getName()).log(Level.SEVERE, null, ex);
            }
        return y;
    }

}
