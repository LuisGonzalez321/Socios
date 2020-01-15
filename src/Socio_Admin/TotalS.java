/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socio_Admin;
import DATABASE.ToolsDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author gabriel
 */
public class TotalS extends javax.swing.JFrame {
public DefaultTableModel model;
public String date;
private static final long serialVersionUID = 1L;


@Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }

    /**
     * 
     * Creates new form Planilla
     * @param date
     */
    public TotalS(String date){ 
        this.date=date;
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Total de Socios");
        SQL();
    }  
    public void SQL(){
          model = (DefaultTableModel) TablaS.getModel();
          String sql="select * from My_Socios where Activo = 1";
          ResultSet rs = ToolsDB.RS(sql);
          String da[]=new  String[20];
          try{
              while(rs.next()){
                    da[0]=rs.getString("Cedula");
                    da[1]=rs.getString("ID_Socio");
                    da[2]=rs.getString("Pass");
                    da[3]=rs.getString("Nombre1")+" "+rs.getString("Nombre2")+" "+rs.getString("Apellido1")+" "+rs.getString("Apellido2");
                    da[4]=rs.getString("Fecha_Nac");
                    da[5]=rs.getString("Lugar_Nac");
                    da[6]=rs.getString("Salario_Mensual");
                    da[7]=rs.getString("Ahorro_Mensual");
                    da[8]=rs.getString("Activo");
                    da[9]=rs.getString("Tasa_Rendimiento");
                    da[10]=rs.getString("Telefono");
                    da[11]=rs.getString("Fecha_Ingreso");
                    da[12]=rs.getString("Lugar_Residencia");
                    da[13]=rs.getString("Direccion");
                    da[14]=rs.getString("Grado_Titular");
                    da[15]=rs.getString("Centro_Estudios");
                    da[16]=rs.getString("Estado_Civil");
                    model.addRow(da);
              }
              TablaS.setModel(model);
          }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Lo sentimos ha ocurrido un error \n consulte el soporte tecnico");
          }         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaS = new javax.swing.JTable();
        L_Info = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/temario_excel_1.png"))); // NOI18N
        jButton2.setText("Exportar Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 200, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 80, 30));

        TablaS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        TablaS.setRowHeight(25);
        TablaS.setAutoResizeMode(TablaS.AUTO_RESIZE_OFF);
        TablaS.getTableHeader().setReorderingAllowed(false);
        JTableHeader tabla_cabecera = TablaS.getTableHeader();
        int anchura = 0;
        TableColumnModel modelo_columna = TablaS.getColumnModel();
        TablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "ID_Socio", "Pass", "Nombre Completo", "Fecha_Nac", "Lugar_Nac", "Salario_Mensual", "Ahorro_Mensual", "Activo", "Tasa_Rendimiento", "Telefono", "Fecha_Ingreso", "Lugar_Residencia", "Direccion", "Grado_Titular", "Centro_Estudios", "Estado_Civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaS.getTableHeader().setReorderingAllowed(false);
        TablaS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaS);
        jScrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        if (TablaS.getColumnModel().getColumnCount() > 0) {
            TablaS.getColumnModel().getColumn(0).setResizable(false);
            TablaS.getColumnModel().getColumn(0).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(1).setResizable(false);
            TablaS.getColumnModel().getColumn(1).setPreferredWidth(70);
            TablaS.getColumnModel().getColumn(2).setResizable(false);
            TablaS.getColumnModel().getColumn(2).setPreferredWidth(70);
            TablaS.getColumnModel().getColumn(3).setResizable(false);
            TablaS.getColumnModel().getColumn(3).setPreferredWidth(220);
            TablaS.getColumnModel().getColumn(4).setResizable(false);
            TablaS.getColumnModel().getColumn(4).setPreferredWidth(120);
            TablaS.getColumnModel().getColumn(5).setResizable(false);
            TablaS.getColumnModel().getColumn(5).setPreferredWidth(120);
            TablaS.getColumnModel().getColumn(6).setResizable(false);
            TablaS.getColumnModel().getColumn(6).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(7).setResizable(false);
            TablaS.getColumnModel().getColumn(7).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(8).setResizable(false);
            TablaS.getColumnModel().getColumn(8).setPreferredWidth(50);
            TablaS.getColumnModel().getColumn(9).setResizable(false);
            TablaS.getColumnModel().getColumn(9).setPreferredWidth(50);
            TablaS.getColumnModel().getColumn(10).setResizable(false);
            TablaS.getColumnModel().getColumn(10).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(11).setResizable(false);
            TablaS.getColumnModel().getColumn(11).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(12).setResizable(false);
            TablaS.getColumnModel().getColumn(12).setPreferredWidth(170);
            TablaS.getColumnModel().getColumn(13).setResizable(false);
            TablaS.getColumnModel().getColumn(13).setPreferredWidth(220);
            TablaS.getColumnModel().getColumn(14).setResizable(false);
            TablaS.getColumnModel().getColumn(14).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(15).setResizable(false);
            TablaS.getColumnModel().getColumn(15).setPreferredWidth(100);
            TablaS.getColumnModel().getColumn(16).setResizable(false);
            TablaS.getColumnModel().getColumn(16).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 920, 400));

        L_Info.setBackground(new java.awt.Color(0, 0, 80));
        L_Info.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        L_Info.setForeground(new java.awt.Color(255, 255, 255));
        L_Info.setText("Click en una de las celdas para mostrar inf. completa por aca");
        L_Info.setOpaque(true);
        jPanel1.add(L_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 489, 430, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Socios activos de la Cooperativa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           Class_Socio.EXCEL.excel(TablaS);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socio_users su = new socio_users();
        su.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaSMouseClicked
        int y = TablaS.getSelectedColumn();
        int x = TablaS.getSelectedRow();
        L_Info.setText((String) TablaS.getValueAt(x, y));
    }//GEN-LAST:event_TablaSMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Info;
    private javax.swing.JTable TablaS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
