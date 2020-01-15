package Socio_Admin;

import Class_Socio.*;
import javax.swing.JOptionPane;
import Class_Socio.Reloj;
import javax.swing.table.DefaultTableModel;
import com.toedter.plaf.JCalendarTheme;
import Class_Socio.Calendario;
import DATABASE.ToolsDB;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
public class socio_users extends javax.swing.JFrame {
    
   JCalendarTheme jCalendarTheme1;
   private static final long serialVersionUID = 1L;
   public DefaultTableModel model;
   public String date;
 
    public socio_users(){
        initComponents();
        jDateChooser1.setDate(new java.util.Date());
        this.setLocationRelativeTo(null);
        this.setTitle("Admin:"+System.getProperty("user.name"));
        addTableElements();
    }

   @Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }
     
    private void addTableElements(){
       model = (DefaultTableModel) TablaS.getModel();
       try {
           ResultSet rs = ToolsDB.RS("select Nombre1,Apellido1,ID_Socio from My_Socios where Activo = 1");
           String ID[] = new String[2];
           while(rs.next()){
                 ID[0] = rs.getString("Nombre1")+" "+rs.getString("Apellido1");
                 ID[1] = rs.getString("ID_Socio");
                 model.addRow(ID);
           }
           TablaS.setModel(model);
       } catch (SQLException ex) {
                System.err.println("Error "+ex);
       }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tasas = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        TF_inflacion = new javax.swing.JTextField();
        Save_int = new javax.swing.JButton();
        Save_inf = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TF_interes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Conexion = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TF_linea3 = new javax.swing.JTextField();
        TF_linea2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TF_linea1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TF_linea4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaS = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundPanel1 = new roundpanel.RoundPanel();
        ano = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        diaSem = new javax.swing.JLabel();
        diaMes = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();

        Tasas.setTitle("Ajustes de Tasas");
        Tasas.setBackground(new java.awt.Color(0, 0, 102));
        Tasas.setUndecorated(true);
        Tasas.setResizable(false);
        Tasas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tasa de Inflacion(Anual):");
        Tasas.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 194, 25));

        TF_inflacion.setForeground(new java.awt.Color(204, 255, 255));
        TF_inflacion.setOpaque(false);
        TF_inflacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_inflacionKeyTyped(evt);
            }
        });
        Tasas.getContentPane().add(TF_inflacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 90, -1));

        Save_int.setBackground(new java.awt.Color(0, 0, 88));
        Save_int.setForeground(new java.awt.Color(0, 153, 255));
        Save_int.setText("Guardar Cambios");
        Save_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_intActionPerformed(evt);
            }
        });
        Tasas.getContentPane().add(Save_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 302, -1));

        Save_inf.setBackground(new java.awt.Color(0, 0, 88));
        Save_inf.setForeground(new java.awt.Color(0, 153, 255));
        Save_inf.setText("Guardar Cambios");
        Save_inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_infActionPerformed(evt);
            }
        });
        Tasas.getContentPane().add(Save_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 302, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tasa de Interes de la Coop.(xMes)");
        Tasas.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 194, 25));

        TF_interes.setForeground(new java.awt.Color(204, 255, 255));
        TF_interes.setOpaque(false);
        TF_interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_interesKeyTyped(evt);
            }
        });
        Tasas.getContentPane().add(TF_interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 90, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("No modificar sin la autorizacion debida");
        Tasas.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 302, 26));

        jButton1.setBackground(new java.awt.Color(0, 0, 88));
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Tasas.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 88));
        jLabel11.setForeground(new java.awt.Color(0, 0, 88));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(340, 240));
        jLabel11.setMinimumSize(new java.awt.Dimension(340, 240));
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(340, 240));
        Tasas.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 240));

        Conexion.setUndecorated(true);
        Conexion.setResizable(false);
        Conexion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Usuario:");
        Conexion.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Conexion a la Base de Datos");
        Conexion.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 50));

        TF_linea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea3.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea3.setOpaque(false);
        Conexion.getContentPane().add(TF_linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, 30));

        TF_linea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea2.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea2.setOpaque(false);
        Conexion.getContentPane().add(TF_linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 180, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Conexion a la BD:");
        Conexion.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        TF_linea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea1.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea1.setOpaque(false);
        Conexion.getContentPane().add(TF_linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Controlador:");
        Conexion.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 30));

        TF_linea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea4.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea4.setOpaque(false);
        Conexion.getContentPane().add(TF_linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, 30));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contraseña: ");
        Conexion.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Conexion.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar Datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Conexion.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setPreferredSize(new java.awt.Dimension(430, 335));
        Conexion.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        TablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "ID-Socio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaS.setGridColor(new java.awt.Color(153, 153, 255));
        TablaS.setSelectionBackground(new java.awt.Color(82, 135, 230));
        TablaS.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaS);
        if (TablaS.getColumnModel().getColumnCount() > 0) {
            TablaS.getColumnModel().getColumn(0).setResizable(false);
            TablaS.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setText(System.getProperty("user.name"));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 90));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shield (3).png"))); // NOI18N
        jLabel4.setText("CERRAR SESIÓN");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 75));
        jLabel7.setText("      SOCIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 730, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(0, 0, 100));
        jLabel5.setText("____________________________________________________________________________________________________________");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 26, 670, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 100));
        jLabel6.setText("                         CORPORATIVA SOCIOS_SA");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 16, 640, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 740, 100));

        roundPanel1.setColor2(new java.awt.Color(255, 255, 255));
        roundPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel1MouseExited(evt);
            }
        });

        ano.setFont(new java.awt.Font("Segoe UI Semibold", 1, 40)); // NOI18N
        ano.setForeground(new java.awt.Color(0, 0, 80));
        ano.setText("2018");

        mes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        mes.setForeground(new java.awt.Color(0, 0, 80));
        mes.setText("JUNIO");

        diaSem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        diaSem.setForeground(new java.awt.Color(0, 0, 80));
        Calendario calendario = new Calendario(ano, mes, diaMes, diaSem);
        calendario.start();
        diaSem.setText("Lunes");

        diaMes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        diaMes.setForeground(new java.awt.Color(0, 0, 80));
        diaMes.setText("01");

        Hora.setText(null);
        Reloj reloj = new Reloj(Hora);
        reloj.start();

        roundPanel1.setLayer(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaSem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(Hora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(diaMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaSem)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ano)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes)
                .addGap(14, 14, 14)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaMes)
                    .addComponent(diaSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        jMenuBar1.setBackground(new java.awt.Color(45, 71, 104));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Principal");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-1.png"))); // NOI18N
        jMenuItem2.setText("Añadir Socio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Total_de_Socios.png"))); // NOI18N
        jMenuItem7.setText("Total Socios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Prestamos.png"))); // NOI18N
        jMenuItem5.setText("Prestamos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Estados Financieros");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Balance.png"))); // NOI18N
        jMenuItem1.setText("Balance General");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/layers (2).png"))); // NOI18N
        jMenuItem3.setText("Estado de Resultados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Ajustes");

        jMenuItem8.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tasas.png"))); // NOI18N
        jMenuItem8.setText("Ver y Modificar Tasas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(69, 130, 192));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/conexion.png"))); // NOI18N
        jMenuItem9.setText("Conexion a la Base de Datos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jCheckBoxMenuItem1.setBackground(new java.awt.Color(69, 130, 192));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Cerrar sesion al salir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Socios_ADD ad = new Socios_ADD(Tools.getFecha(jDateChooser1.getDate()));
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
       String[] opciones = {"Aceptar", "Cancelar"};
       int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea Salir?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
       if (opcion == 0){
           ActiveSesion as = new ActiveSesion();
           try {
               as.SCerrar(true);
           } catch (IOException ex) {
               System.err.println("ERROR "+ex);
               Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.exit(0);
       }
           
    }//GEN-LAST:event_jMenu4MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Socio_BalanceGeneral BG = new Socio_BalanceGeneral(date);
        BG.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       Socio_EstadoResultados ER = new Socio_EstadoResultados(date);
       ER.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
       boolean ac=true;
       String[] opciones = {"Aceptar", "Cancelar"};
       int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea Cerrar Sesion?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
       if (opcion == 0){
           try {
               ActiveSesion as = new ActiveSesion();  
               as.Cerrar(false);   
           } catch (IOException ex) {
               System.out.println("ERROR "+ex);
           }
            System.exit(0);
       }
          
    }//GEN-LAST:event_jLabel4MousePressed

    private void roundPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseEntered
      ano.setForeground(Color.white);
      mes.setForeground(Color.white);
      diaMes.setForeground(Color.white);
      diaSem.setForeground(Color.white);
      Hora.setForeground(Color.white);
      roundPanel1.setColor1(new Color(0,0,90));
      roundPanel1.setColor2(new Color(20,20,20));
      roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseEntered

    private void roundPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseExited
      ano.setForeground(new Color(0,0,90));
      mes.setForeground(new Color(0,0,90));
      diaMes.setForeground(new Color(0,0,90));
      diaSem.setForeground(new Color(0,0,90));
      Hora.setForeground(new Color(0,0,90));
      roundPanel1.setColor1(new Color(255,255,255));
      roundPanel1.setColor2(new Color(250,250,250));
      roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
      jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            TotalS pl = new TotalS(date);
            pl.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         Prestamos sp = new Prestamos(date);
         sp.setVisible(true);
         dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       try {
           ResultSet rs = ToolsDB.RS("select * from Admin");
           double inf = 0,INT = 0;
           while (rs.next()){
               inf = rs.getFloat("Inflacion");
               INT = rs.getFloat("Interes");
           }
           TF_inflacion.setText(String.format("%.2f", inf));
           TF_interes.setText(String.format("%.2f", INT));
           Tasas.setVisible(true);
           Tasas.setSize(340, 240);
           Tasas.setLocationRelativeTo(null);
       } catch (SQLException ex) {
           Logger.getLogger(socio_users.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tasas.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TF_interesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_interesKeyTyped
        if(evt.getKeyChar()>'9'||evt.getKeyChar()<'.'){
                        evt.consume();
                        
                }
                if(evt.getKeyChar()=='/') {
                    evt.consume();
                }
                if(TF_interes.getText().length()>10){
                    evt.consume();
                }
                if(ExistPuntos(TF_interes)){
                    if(evt.getKeyChar()=='.')
                        evt.consume();
                }
    }//GEN-LAST:event_TF_interesKeyTyped

    private void TF_inflacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_inflacionKeyTyped
        if(evt.getKeyChar()>'9'||evt.getKeyChar()<'.'){
                        evt.consume();
                        
                }
                if(evt.getKeyChar()=='/') {
                    evt.consume();
                }
                if(TF_inflacion.getText().length()>10){
                    evt.consume();
                }
                if(ExistPuntos(TF_inflacion)){
                    if(evt.getKeyChar()=='.')
                        evt.consume();
        }
    }//GEN-LAST:event_TF_inflacionKeyTyped

    private void Save_infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_infActionPerformed
        try{
            float inf = Float.parseFloat(TF_inflacion.getText());
            if(inf >= 0 && inf <=1){
                ToolsDB.Actualizar("update Admin set Inflacion = "+inf);
                JOptionPane.showMessageDialog(null, "Tasa modificada!!");

            }else{
                JOptionPane.showMessageDialog(null, "Lo que digito no es una tasa");
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Error al modificar la tasa");
        }
        
    }//GEN-LAST:event_Save_infActionPerformed

    private void Save_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_intActionPerformed
        try{
            float inf = Float.parseFloat(TF_interes.getText());
            if(inf >= 0 && inf <=1){
                ToolsDB.Actualizar("update Admin set Interes = "+inf);
                JOptionPane.showMessageDialog(null, "Tasa modificada!!");
            }else
                JOptionPane.showMessageDialog(null, "Lo que digito no es una tasa");
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Error al modificar la tasa");
        }
    }//GEN-LAST:event_Save_intActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Conexion.setSize(430, 370);
        Conexion.setLocationRelativeTo(null);
        Conexion.setVisible(true);
        ArrayList<String>lineas = ToolsDB.Conexion("Conexion.txt");
        TF_linea1.setText(lineas.get(0));
        TF_linea2.setText(lineas.get(1));
        TF_linea3.setText(lineas.get(2));
        TF_linea4.setText(lineas.get(3));
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conexion.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Estas seguro??\nSi lo friegas el programa se crashea");
       if(showConfirmDialog == 0){
           try {
               String ruta = "Conexion.txt";
               File archivo = new File(ruta);
               BufferedWriter bw;
               bw = new BufferedWriter(new FileWriter(archivo));
               bw.write(TF_linea1.getText());
               bw.newLine();
               bw.write(TF_linea2.getText());
               bw.newLine();
               bw.write(TF_linea3.getText());
               bw.newLine();
               bw.write(TF_linea4.getText());
               bw.close();
           } catch (IOException ex) {
               Logger.getLogger(socio_users.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_jButton3ActionPerformed
    private static boolean ExistPuntos(JTextField j) {
        for (int i = 0; i < j.getText().length(); i++) {
            if(j.getText().charAt(i)=='.')
                return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Conexion;
    private javax.swing.JLabel Hora;
    private javax.swing.JButton Save_inf;
    private javax.swing.JButton Save_int;
    private javax.swing.JTextField TF_inflacion;
    private javax.swing.JTextField TF_interes;
    private javax.swing.JTextField TF_linea1;
    private javax.swing.JTextField TF_linea2;
    private javax.swing.JTextField TF_linea3;
    private javax.swing.JTextField TF_linea4;
    private javax.swing.JTable TablaS;
    private javax.swing.JDialog Tasas;
    private javax.swing.JLabel ano;
    private javax.swing.JLabel diaMes;
    private javax.swing.JLabel diaSem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mes;
    private roundpanel.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
