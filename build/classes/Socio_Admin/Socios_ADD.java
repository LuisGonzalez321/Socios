package Socio_Admin;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.print.attribute.AttributeSet;
import Class_Socio.*;
import DATABASE.ToolsDB;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class Socios_ADD extends javax.swing.JFrame{
public String date;
public socio_users us = new socio_users();
private static final long serialVersionUID = 1L;


    public Socios_ADD(String date) {
        this.date=date;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Añadir Socio"); 
        Class_Socio.Municipios.addD(combox_dep,combox_dep2);
        XD();  
        fecha.setDate(new java.util.Date());
    }
    
    
    
 private String setAddSocio() {
            return Tools.generateID(Tools.numRows("select S.ID_Socio from dbo.My_Socios as S"));
    }
 public String ted(JDateChooser date){
        Calendar da= date.getCalendar();
        return ""+da.get(Calendar.YEAR)+"-"+da.get(Calendar.MONTH+1)+"-"+da.get(Calendar.DAY_OF_MONTH);
  }
       
    public void XD(){
       txt_cedula.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1,AttributeSet arg2) throws BadLocationException {
                for(int i=0;i<arg1.length();i++){
                    if(!Character.isLetter(arg1.charAt(i)) && arg1.charAt(i) != '-' && !Character.isDigit(arg1.charAt(i))){
                       return;
                    }
                }
           super.insertString(arg0,arg1, (javax.swing.text.AttributeSet) arg2);
          }});
    }
    
    public void Validar(application.TextBox co){
        if(co.getText().length() == 0 || co.getText().equals(" ")){
            co.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.red, null));
        }   
    }
    
    @Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new roundpanel.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        combox_Pais = new javax.swing.JComboBox<>();
        combox_dep = new javax.swing.JComboBox<>();
        combox_Muni = new javax.swing.JComboBox<>();
        combox_Estado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combox_Pais2 = new javax.swing.JComboBox<>();
        combox_dep2 = new javax.swing.JComboBox<>();
        combox_Muni2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre1 = new application.TextBox();
        jLabel14 = new javax.swing.JLabel();
        txt_apellido1 = new application.TextBox();
        txt_nombre2 = new application.TextBox();
        txt_apellido2 = new application.TextBox();
        txt_cedula = new application.TextBox();
        txt_salario = new application.TextBox();
        txt_ahorro = new application.TextBox();
        txt_direccion = new application.TextBox();
        txt_celular = new application.TextBox();
        txt_gradoTitular = new application.TextBox();
        txt_centroE = new application.TextBox();
        ID_Socio = new javax.swing.JLabel();
        FechaNac = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        roundPanel1.setBackground(new java.awt.Color(0, 0, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(0, 0, 80))); // NOI18N
        roundPanel1.setForeground(new java.awt.Color(0, 0, 255));
        roundPanel1.setArch(23);
        roundPanel1.setColor2(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 80));
        jLabel5.setText("Fecha de Nacimiento:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 80));
        jLabel6.setText("Lugar de Nacimiento:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 80));
        jLabel7.setText("Cedula de Identidad:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 80));
        jLabel8.setText("Estado Civil:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 80));
        jLabel9.setText("Direccion:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 80));
        jLabel10.setText("Lugar De Residencia:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 80));
        jLabel11.setText("Celular:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 80));
        jLabel12.setText("Grado Titular:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 80));
        jLabel13.setText("Centro De Estudios:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 80));
        jLabel16.setText("Salario:");

        combox_Pais.setForeground(new java.awt.Color(0, 0, 80));
        combox_Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nicaragua" }));
        combox_Pais.setToolTipText("Pais");

        combox_dep.setForeground(new java.awt.Color(0, 0, 80));
        combox_dep.setToolTipText("Departamento");
        combox_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_depActionPerformed(evt);
            }
        });

        combox_Muni.setForeground(new java.awt.Color(0, 0, 80));
        combox_Muni.setToolTipText("Municipio");

        combox_Estado.setForeground(new java.awt.Color(0, 0, 80));
        combox_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Viudo/a", "Divorciado/a" }));

        jButton1.setBackground(new java.awt.Color(0, 0, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 80));
        jLabel2.setText("Abono Mensual");

        combox_Pais2.setForeground(new java.awt.Color(0, 0, 80));
        combox_Pais2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nicaragua" }));
        combox_Pais2.setToolTipText("Pais");

        combox_dep2.setForeground(new java.awt.Color(0, 0, 80));
        combox_dep2.setToolTipText("Departamento");
        combox_dep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_dep2ActionPerformed(evt);
            }
        });

        combox_Muni2.setForeground(new java.awt.Color(0, 0, 80));
        combox_Muni2.setToolTipText("Municipio");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 80));
        jLabel3.setText("Nombres:");

        txt_nombre1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_nombre1.setToolTipText("Primer Nombre");
        txt_nombre1.setPlaceHolder("ej: Luis");
        txt_nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombre1MousePressed(evt);
            }
        });
        txt_nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre1KeyTyped(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 80));
        jLabel14.setText("Apellidos:");

        txt_apellido1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_apellido1.setToolTipText("Primer Apellido");
        txt_apellido1.setPlaceHolder("ej: Gonzales");
        txt_apellido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido1MousePressed(evt);
            }
        });
        txt_apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido1KeyTyped(evt);
            }
        });

        txt_nombre2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_nombre2.setToolTipText("Segundo Nombre");
        txt_nombre2.setPlaceHolder("ej: Eleazar");
        txt_nombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombre2MousePressed(evt);
            }
        });
        txt_nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre2KeyTyped(evt);
            }
        });

        txt_apellido2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_apellido2.setToolTipText("Segundo Apellido");
        txt_apellido2.setPlaceHolder("ej: Darce");
        txt_apellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido2MousePressed(evt);
            }
        });

        txt_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_cedula.setToolTipText("Cedula de Identidad");
        txt_cedula.setMaxLength(16);
        txt_cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cedulaMousePressed(evt);
            }
        });
        txt_cedula.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_cedulaPropertyChange(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });

        txt_salario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_salario.setToolTipText("Salario");
        txt_salario.setMaxLength(9);
        txt_salario.setPlaceHolder("ej: 20000");
        txt_salario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_salarioMousePressed(evt);
            }
        });
        txt_salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salarioKeyTyped(evt);
            }
        });

        txt_ahorro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_ahorro.setToolTipText("Cantida de Ahorro");
        txt_ahorro.setPlaceHolder("ej: 3000");
        txt_ahorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ahorroMousePressed(evt);
            }
        });
        txt_ahorro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ahorroKeyTyped(evt);
            }
        });

        txt_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_direccion.setToolTipText("Direccion Domiciliar");
        txt_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_direccionMousePressed(evt);
            }
        });

        txt_celular.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_celular.setToolTipText("Celular");
        txt_celular.setMaxLength(10);
        txt_celular.setPlaceHolder("ej: 505-89898989");
        txt_celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_celularMousePressed(evt);
            }
        });
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });

        txt_gradoTitular.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_gradoTitular.setToolTipText("Grado Titular");
        txt_gradoTitular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_gradoTitularMousePressed(evt);
            }
        });

        txt_centroE.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
        txt_centroE.setToolTipText("Centro de Estudio");
        txt_centroE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_centroEMousePressed(evt);
            }
        });

        ID_Socio.setText("ID_Socio :"+setAddSocio());

        roundPanel1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_Pais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_dep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_Muni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_Estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_Pais2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_dep2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(combox_Muni2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_nombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_apellido1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_nombre2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_apellido2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_salario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_ahorro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_celular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_gradoTitular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(txt_centroE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(ID_Socio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(FechaNac, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel14))
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 89, Short.MAX_VALUE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(FechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combox_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combox_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_salario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_ahorro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(113, 113, 113)))
                        .addGap(86, 86, 86)
                        .addComponent(jButton1)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(combox_Muni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_apellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(txt_nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(24, 24, 24)))
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combox_Pais2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combox_dep2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(combox_Muni2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_centroE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                            .addComponent(combox_Estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_celular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_gradoTitular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ID_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 805, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(ID_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combox_Pais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combox_dep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combox_Muni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                        .addComponent(FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combox_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_Muni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gradoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_centroE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(44, 44, 44))
        );

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shield (2).png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });

        fecha.setMaxSelectableDate(new java.util.Date(5680306874000L));
        fecha.setMinSelectableDate(new java.util.Date(-1735660726000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
       us.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel15MousePressed

    private void combox_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_depActionPerformed
       int i=combox_dep.getSelectedIndex();
             Class_Socio.Municipios.COMBOX(combox_dep,combox_Muni, i);
    }//GEN-LAST:event_combox_depActionPerformed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
       socio_users use = new socio_users();
       dispose();
    }//GEN-LAST:event_jLabel19MousePressed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if( FechaNac.getDate() == null || txt_nombre1.getText().length() == 0 || txt_nombre2.getText().length() == 0 || txt_apellido1.getText().length() == 0
      || txt_apellido2.getText().length() == 0 || txt_cedula.getText().length() == 0 || txt_salario.getText().length() == 0  
      || txt_ahorro.getText().length() == 0 || txt_direccion.getText().length() == 0 
      || txt_celular.getText().length() == 0 || txt_gradoTitular.getText().length() == 0 || txt_centroE.getText().length() == 0){
          Validar(txt_nombre1);
          Validar(txt_nombre2);
          Validar(txt_apellido1);
          Validar(txt_apellido2);
          Validar(txt_celular);
          Validar(txt_cedula);
          Validar(txt_salario);
          Validar(txt_ahorro);
          Validar(txt_direccion);
          Validar(txt_celular);
          Validar(txt_gradoTitular);
          Validar(txt_centroE);
          JOptionPane.showMessageDialog(null,"Ingrese todos los campos");
      }else{

             String Nac=ted(FechaNac);
             String Lugar=combox_Pais.getSelectedItem()+"-"+combox_dep.getSelectedItem()+"-"+combox_Muni.getSelectedItem();
             String resi=combox_Pais.getSelectedItem()+"-"+combox_dep.getSelectedItem()+"-"+combox_Muni.getSelectedItem();
             String esta=""+combox_Estado.getSelectedItem();   
            String id =  setAddSocio();
             String sql ="insert into dbo.My_Socios values('"+txt_cedula.getText()+"','"+id+"','12345678','"+txt_nombre1.getText()+"','"+txt_nombre2.getText()+"','"+txt_apellido1.getText()+"','"+txt_apellido2.getText()+"','"+Nac+"','"+Lugar+"','"
                          +Float.parseFloat(txt_salario.getText())+"','"+Float.parseFloat(txt_ahorro.getText())+"','1','"+calcTasaRendimiento(Float.parseFloat(txt_ahorro.getText()))+"','"+txt_celular.getText()+"','"+Tools.getFecha(fecha.getDate())+"','"+resi+"','"
                          +txt_direccion.getText()+"','"+txt_gradoTitular.getText()+"','"+txt_centroE.getText()+"','"+esta+"')";
             int act = ToolsDB.Actualizar(sql);
             if(act == 1){
                 String sql2 = "insert into Ahorro_Apertura values ('"+Tools.generateCA_CP(Tools.numRows("select * from Ahorro_Apertura"), 'A')+"','"+Tools.getFecha(fecha.getDate())+"',"+txt_ahorro.getText()+",'"+id+"')";
                 act = ToolsDB.Actualizar(sql2);
                 if(act == 1){
                     JOptionPane.showMessageDialog(null,"Socio Agregado con exito");
                 }
                 
             }
    dispose();     
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private String calcTasaRendimiento(float abono) {
        try {
            
            ResultSet rs = DATABASE.ToolsDB.RS("select Ahorro_Mensual from My_Socios");
            float acum = 0;
            while(rs.next()){
                 acum += Double.parseDouble(rs.getString("Ahorro_Mensual"));
            }
            acum += abono;
            rs = null;
            rs = DATABASE.ToolsDB.RS("select * from My_Socios");
            while(rs.next()){
                 float abonom = Float.parseFloat(rs.getString("Ahorro_Mensual"));
                 ToolsDB.Actualizar("update My_Socios set Tasa_Rendimiento = "+abonom/acum+" where ID_Socio = '"+rs.getString("ID_Socio")+"'");
            }
            return ""+abono/acum;
        } catch (SQLException ex) {
            System.out.println("Error tasa");
        }
        return null;
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String[] opciones = {"Aceptar", "Cancelar"};
       int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea cancelar?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
       if (opcion == 0)
           dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combox_dep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_dep2ActionPerformed
         int i=combox_dep2.getSelectedIndex();
         Class_Socio.Municipios.COMBOX(combox_dep2,combox_Muni2,i);
    }//GEN-LAST:event_combox_dep2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void txt_nombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre1MousePressed
       txt_nombre1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_nombre1MousePressed

    private void txt_nombre2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre2MousePressed
       txt_nombre2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_nombre2MousePressed

    private void txt_apellido1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido1MousePressed
        txt_apellido1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_apellido1MousePressed

    private void txt_apellido2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido2MousePressed
        txt_apellido2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_apellido2MousePressed

    private void txt_cedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cedulaMousePressed
        txt_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_cedulaMousePressed

    private void txt_salarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salarioMousePressed
      txt_salario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_salarioMousePressed

    private void txt_ahorroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ahorroMousePressed
        txt_ahorro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_ahorroMousePressed

    private void txt_direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_direccionMousePressed
       txt_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_direccionMousePressed

    private void txt_celularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_celularMousePressed
       txt_celular.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_celularMousePressed

    private void txt_gradoTitularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_gradoTitularMousePressed
       txt_gradoTitular.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_gradoTitularMousePressed

    private void txt_centroEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_centroEMousePressed
       txt_centroE.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(240, 240, 240), null));
    }//GEN-LAST:event_txt_centroEMousePressed

    private void txt_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyReleased
        if(FechaNac.getDate() != null && txt_cedula.getText().length() == 3) {
            String codigo = "-"+ new SimpleDateFormat("ddMMyy").format(FechaNac.getDate()) +"-";
            txt_cedula.setText(txt_cedula.getText()+codigo);
        }
    }//GEN-LAST:event_txt_cedulaKeyReleased

    private void txt_cedulaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_cedulaPropertyChange
         if(FechaNac.getDate() != null) {
            Date min = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(FechaNac.getDate());
            int ano = c.get(Calendar.YEAR);
            ano += 16;
            c.set(Calendar.YEAR, ano);
            min = c.getTime();
            FechaNac.setMinSelectableDate(min);
        }
    }//GEN-LAST:event_txt_cedulaPropertyChange

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char c = evt.getKeyChar(); 
        int g = evt.getKeyChar();
        if(txt_cedula.getText().length() == 11){
               if(c<'0' || c>'9'){
                 evt.consume(); 
               }
        }else if(txt_cedula.getText().length() == 15){
                 if(!(g<'0' || g>'9')){
                    evt.consume();
                 }    
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre1KeyTyped
         int g = evt.getKeyChar();
         if(!(g<'0' || g>'9')){
             evt.consume();
         }
    }//GEN-LAST:event_txt_nombre1KeyTyped

    private void txt_salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salarioKeyTyped
          char g = evt.getKeyChar();
            if(g<'0' || g>'9'){
             evt.consume();
         }
    }//GEN-LAST:event_txt_salarioKeyTyped

    private void txt_ahorroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ahorroKeyTyped
            char g = evt.getKeyChar();
            if(g<'0' || g>'9'){
             evt.consume();
            }
    }//GEN-LAST:event_txt_ahorroKeyTyped

    private void txt_apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido1KeyTyped
        int g = evt.getKeyChar();
        if(!(g<'0' || g>'9')){
             evt.consume();
        }
    }//GEN-LAST:event_txt_apellido1KeyTyped

    private void txt_nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre2KeyTyped
        int g = evt.getKeyChar();
        if(!(g<'0' || g>'9')){
             evt.consume();
        }
    }//GEN-LAST:event_txt_nombre2KeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
         
    }//GEN-LAST:event_txt_celularKeyTyped
/** 
    public static void main(String[] args) {
             try{
                  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                  //Connection cn = DriverManager.getConnection("jdbc:sqlserver://gabriel-PC\\GABRIEL-PC\\SQLEXPRESS:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Connection cn = DriverManager.getConnection("jdbc:sqlserver://AXEL11\\MSSQLSERVER:1433;databaseName=CAC","Axel_Luis","ellanoteama");
                  Statement st = cn.createStatement();
                 ResultSet rs = st.executeQuery("Select Ahorro_Mensual,ID_Socio from My_Socios");
                 while(rs.next()){
                     
                     String sql = "insert into Ahorro_Apertura values ('"+Tools.generateCA_CP(Tools.numRows("select * from Ahorro_Apertura"), 'A')+"',GETDATE(),"+rs.getString("Ahorro_Mensual")+",'"+rs.getString("ID_Socio")+"')";
                     System.out.println(sql);
                     Statement st1 = cn.createStatement();
                     st1.executeUpdate(sql);
                    
                 }
                  System.out.println("LISTO");
              }catch(SQLException | ClassNotFoundException ex){
                 System.err.println("AAAHHHH\n "+ex);
              } 
    }
**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaNac;
    private javax.swing.JLabel ID_Socio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combox_Estado;
    private javax.swing.JComboBox<String> combox_Muni;
    private javax.swing.JComboBox<String> combox_Muni2;
    private javax.swing.JComboBox<String> combox_Pais;
    private javax.swing.JComboBox<String> combox_Pais2;
    private javax.swing.JComboBox<String> combox_dep;
    private javax.swing.JComboBox<String> combox_dep2;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private roundpanel.RoundPanel roundPanel1;
    private application.TextBox txt_ahorro;
    private application.TextBox txt_apellido1;
    private application.TextBox txt_apellido2;
    private application.TextBox txt_cedula;
    private application.TextBox txt_celular;
    private application.TextBox txt_centroE;
    private application.TextBox txt_direccion;
    private application.TextBox txt_gradoTitular;
    private application.TextBox txt_nombre1;
    private application.TextBox txt_nombre2;
    private application.TextBox txt_salario;
    // End of variables declaration//GEN-END:variables
 }
