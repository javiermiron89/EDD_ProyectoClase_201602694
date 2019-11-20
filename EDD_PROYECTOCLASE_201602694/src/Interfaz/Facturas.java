/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Diseno.RoundedCornerButtonUI;
import Diseno.RoundedPanel;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class Facturas extends javax.swing.JFrame {

          static Principal FramePrincipal = new Principal();
          Color RojoCerrar = new Color(245, 73, 73);
          Color AzulAtras = new Color(25, 35, 84);
          String titulos[] = {"ID PRODUCTO", "NOMBRE", "PRECIO UNI", "CANTIDAD","IMPORTE"};
          DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
                    @Override
                    public boolean isCellEditable(int fila, int columna) {
                              if (columna == 5) {
                                        return true;
                              } else {
                                        return false;
                              }
                    }
          };
          /**
           * Creates new form Facturas
           */
          public Facturas() {
                    initComponents();
                    Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 35, 35);
                    AWTUtilities.setWindowShape(this, forma);
                    this.setLocationRelativeTo(null);
                    initComponents2();
          }

          /**
           * This method is called from within the constructor to initialize the
           * form. WARNING: Do NOT modify this code. The content of this method
           * is always regenerated by the Form Editor.
           */
          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    jPanel1 = new javax.swing.JPanel();
                    Btt_Cerrar = new javax.swing.JButton();
                    Btt_Atras = new javax.swing.JButton();
                    Lbl_total = new javax.swing.JLabel();
                    Panel_Interno = new RoundedPanel(50);
                    Lbl_No_Factura = new javax.swing.JLabel();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    Txt_nombre = new javax.swing.JTextField();
                    jSeparator2 = new javax.swing.JSeparator();
                    jScrollPane1 = new javax.swing.JScrollPane();
                    jTable1 = new javax.swing.JTable();
                    Btt_CargarTabla = new javax.swing.JButton();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel5 = new javax.swing.JLabel();
                    Cbx_Nit = new javax.swing.JComboBox<>();
                    jLabel8 = new javax.swing.JLabel();
                    Lbl_Subtotal = new javax.swing.JLabel();
                    Lbl_iva = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setUndecorated(true);
                    setResizable(false);

                    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                    jPanel1.setLayout(null);

                    Btt_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
                    Btt_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-shutdown-48.png"))); // NOI18N
                    Btt_Cerrar.setBorder(null);
                    Btt_Cerrar.setOpaque(false);
                    Btt_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        Btt_CerrarMouseEntered(evt);
                              }
                              public void mouseExited(java.awt.event.MouseEvent evt) {
                                        Btt_CerrarMouseExited(evt);
                              }
                    });
                    Btt_Cerrar.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        Btt_CerrarActionPerformed(evt);
                              }
                    });
                    jPanel1.add(Btt_Cerrar);
                    Btt_Cerrar.setBounds(10, 10, 50, 50);

                    Btt_Atras.setBackground(new java.awt.Color(255, 255, 255));
                    Btt_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-48.png"))); // NOI18N
                    Btt_Atras.setBorder(null);
                    Btt_Atras.setOpaque(false);
                    Btt_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        Btt_AtrasMouseEntered(evt);
                              }
                              public void mouseExited(java.awt.event.MouseEvent evt) {
                                        Btt_AtrasMouseExited(evt);
                              }
                    });
                    Btt_Atras.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        Btt_AtrasActionPerformed(evt);
                              }
                    });
                    jPanel1.add(Btt_Atras);
                    Btt_Atras.setBounds(70, 10, 50, 50);

                    Lbl_total.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    Lbl_total.setForeground(new java.awt.Color(239, 87, 86));
                    Lbl_total.setText("Q");
                    jPanel1.add(Lbl_total);
                    Lbl_total.setBounds(1110, 820, 270, 30);

                    Panel_Interno.setBackground(new java.awt.Color(74, 129, 212));
                    Panel_Interno.setForeground(new java.awt.Color(0, 0, 0));
                    Panel_Interno.setLayout(null);

                    Lbl_No_Factura.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
                    Lbl_No_Factura.setForeground(new java.awt.Color(239, 87, 86));
                    Lbl_No_Factura.setText("FACTURA");
                    Panel_Interno.add(Lbl_No_Factura);
                    Lbl_No_Factura.setBounds(0, 0, 420, 80);

                    jPanel1.add(Panel_Interno);
                    Panel_Interno.setBounds(960, 20, 420, 80);

                    jLabel1.setBackground(new java.awt.Color(24, 64, 128));
                    jLabel1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel1.setText("NIT");
                    jLabel1.setOpaque(true);
                    jPanel1.add(jLabel1);
                    jLabel1.setBounds(30, 140, 130, 30);

                    jLabel2.setBackground(new java.awt.Color(24, 64, 128));
                    jLabel2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel2.setText("CLIENTE");
                    jLabel2.setOpaque(true);
                    jPanel1.add(jLabel2);
                    jLabel2.setBounds(30, 230, 130, 30);

                    Txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
                    Txt_nombre.setFont(new java.awt.Font("Lato Light", 1, 24)); // NOI18N
                    Txt_nombre.setForeground(new java.awt.Color(24, 64, 128));
                    Txt_nombre.setBorder(null);
                    Txt_nombre.setEnabled(false);
                    jPanel1.add(Txt_nombre);
                    Txt_nombre.setBounds(170, 230, 400, 50);
                    jPanel1.add(jSeparator2);
                    jSeparator2.setBounds(170, 280, 400, 2);

                    jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                    jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

                    jTable1.setBackground(new java.awt.Color(255, 255, 255));
                    jTable1.setFont(new java.awt.Font("Lato Light", 0, 14)); // NOI18N
                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                              new Object [][] {
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null}
                              },
                              new String [] {
                                        "ID PRODUCTO", "NOMBRE", "PRECIO UNI", "CANTIDAD", "IMPORTE"
                              }
                    ) {
                              boolean[] canEdit = new boolean [] {
                                        false, false, false, false, false
                              };

                              public boolean isCellEditable(int rowIndex, int columnIndex) {
                                        return canEdit [columnIndex];
                              }
                    });
                    jTable1.setFocusable(false);
                    jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
                    jTable1.setRowHeight(25);
                    jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
                    jTable1.setShowVerticalLines(false);
                    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        jTable1MouseClicked(evt);
                              }
                    });
                    jScrollPane1.setViewportView(jTable1);

                    jPanel1.add(jScrollPane1);
                    jScrollPane1.setBounds(20, 370, 1360, 330);

                    Btt_CargarTabla.setBackground(new java.awt.Color(24, 4, 29));
                    Btt_CargarTabla.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
                    Btt_CargarTabla.setForeground(new java.awt.Color(255, 255, 255));
                    Btt_CargarTabla.setText("CARGAR NITS");
                    Btt_CargarTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                    Btt_CargarTabla.setBorderPainted(false);
                    Btt_CargarTabla.setFocusPainted(false);
                    Btt_CargarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseEntered(java.awt.event.MouseEvent evt) {
                                        Btt_CargarTablaMouseEntered(evt);
                              }
                              public void mouseExited(java.awt.event.MouseEvent evt) {
                                        Btt_CargarTablaMouseExited(evt);
                              }
                    });
                    Btt_CargarTabla.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        Btt_CargarTablaActionPerformed(evt);
                              }
                    });
                    jPanel1.add(Btt_CargarTabla);
                    Btt_CargarTabla.setBounds(610, 140, 300, 50);

                    jLabel3.setBackground(new java.awt.Color(24, 64, 128));
                    jLabel3.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel3.setText("SUBTOTAL");
                    jLabel3.setOpaque(true);
                    jPanel1.add(jLabel3);
                    jLabel3.setBounds(970, 720, 130, 30);

                    jLabel4.setBackground(new java.awt.Color(24, 64, 128));
                    jLabel4.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel4.setText("IVA");
                    jLabel4.setOpaque(true);
                    jPanel1.add(jLabel4);
                    jLabel4.setBounds(970, 770, 130, 30);

                    jLabel5.setBackground(new java.awt.Color(24, 64, 128));
                    jLabel5.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel5.setText("TOTAL");
                    jLabel5.setOpaque(true);
                    jPanel1.add(jLabel5);
                    jLabel5.setBounds(970, 820, 130, 30);

                    Cbx_Nit.setBackground(new java.awt.Color(255, 255, 255));
                    Cbx_Nit.setFont(new java.awt.Font("Lato Light", 1, 18)); // NOI18N
                    Cbx_Nit.setForeground(new java.awt.Color(24, 64, 128));
                    Cbx_Nit.addItemListener(new java.awt.event.ItemListener() {
                              public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                        Cbx_NitItemStateChanged(evt);
                              }
                    });
                    jPanel1.add(Cbx_Nit);
                    Cbx_Nit.setBounds(170, 140, 400, 50);

                    jLabel8.setFont(new java.awt.Font("Lato", 1, 36)); // NOI18N
                    jLabel8.setForeground(new java.awt.Color(239, 87, 86));
                    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoChino.png"))); // NOI18N
                    jLabel8.setText("FACTURACION");
                    jPanel1.add(jLabel8);
                    jLabel8.setBounds(190, 40, 360, 70);

                    Lbl_Subtotal.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    Lbl_Subtotal.setForeground(new java.awt.Color(239, 87, 86));
                    Lbl_Subtotal.setText("Q");
                    jPanel1.add(Lbl_Subtotal);
                    Lbl_Subtotal.setBounds(1110, 720, 270, 30);

                    Lbl_iva.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
                    Lbl_iva.setForeground(new java.awt.Color(239, 87, 86));
                    Lbl_iva.setText("Q");
                    jPanel1.add(Lbl_iva);
                    Lbl_iva.setBounds(1110, 770, 270, 30);

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                    );

                    pack();
          }// </editor-fold>//GEN-END:initComponents

          private void Btt_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_CerrarMouseEntered
                    Btt_Cerrar.setBackground(RojoCerrar);
          }//GEN-LAST:event_Btt_CerrarMouseEntered

          private void Btt_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_CerrarMouseExited
                    Btt_Cerrar.setBackground(Color.WHITE);
          }//GEN-LAST:event_Btt_CerrarMouseExited

          private void Btt_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CerrarActionPerformed
                    System.exit(0);
                    /*
                    FramePrincipal.md.agregar(0, 0, 1, "mamarre00");
                    FramePrincipal.md.agregar(1, 0, 2, "mamarre10");
                    FramePrincipal.md.agregar(2, 0, 3, "mamarre20");
                    FramePrincipal.md.agregar(1, 1, 4, "mamarre11");
                    FramePrincipal.md.agregar(2, 2, 5, "mamarre22");
                    FramePrincipal.md.agregar(0, 3, 6, "mamarre03");
                    FramePrincipal.md.agregar(1, 4, 7, "mamarre14");
                    FramePrincipal.md.agregar(2, 5, 8, "mamarre25");
                    FramePrincipal.md.agregar(0, 6, 9, "mamarre06");
                    FramePrincipal.md.agregar(0, 7, 10, "mamarre07");
                    FramePrincipal.md.agregar(3, 12, 11, "mamarre1211");*/
          }//GEN-LAST:event_Btt_CerrarActionPerformed

          private void Btt_AtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_AtrasMouseEntered
                    Btt_Atras.setBackground(AzulAtras);
          }//GEN-LAST:event_Btt_AtrasMouseEntered

          private void Btt_AtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_AtrasMouseExited
                    Btt_Atras.setBackground(Color.WHITE);
          }//GEN-LAST:event_Btt_AtrasMouseExited

          private void Btt_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_AtrasActionPerformed
                    FramePrincipal.setVisible(true);
                    this.dispose();

                    /*FramePrincipal.md.imprimirMatriz();
                    FramePrincipal.md.imprimirMatrizG();
                    FramePrincipal.md.GenerarDOTMatrizDispersa();
                    FramePrincipal.md.AbrirDOTMatrizDispersa();*/
          }//GEN-LAST:event_Btt_AtrasActionPerformed

          private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                    /*int fila = jTable1.getSelectedRow();
                    Txt_nit.setText(jTable1.getValueAt(fila, 0).toString());
                    Txt_nombre.setText(jTable1.getValueAt(fila, 1).toString());
                    Txt_marca.setText(jTable1.getValueAt(fila, 2).toString());
                    Txt_cantidad.setText(jTable1.getValueAt(fila, 3).toString());
                    Txt_cantidad.setText(jTable1.getValueAt(fila, 4).toString());
                    Txt_tipo.setText(jTable1.getValueAt(fila, 5).toString());*/
          }//GEN-LAST:event_jTable1MouseClicked

          private void Btt_CargarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_CargarTablaMouseEntered
                    Btt_CargarTabla.setSize(300, 150);
                    Btt_CargarTabla.setText("CARGAR NITS");
          }//GEN-LAST:event_Btt_CargarTablaMouseEntered

          private void Btt_CargarTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btt_CargarTablaMouseExited
                    Btt_CargarTabla.setSize(300, 50);
                    Btt_CargarTabla.setText("CARGAR NITS");
          }//GEN-LAST:event_Btt_CargarTablaMouseExited

          private void Btt_CargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CargarTablaActionPerformed
                    //CargarTabla();
                    CargarNit();
          }//GEN-LAST:event_Btt_CargarTablaActionPerformed

          private void Cbx_NitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Cbx_NitItemStateChanged
                    //System.out.println("MAMARREEEEEE" + Cbx_Nit.getSelectedItem().toString());
                    //CargarNombre(Cbx_Nit.getSelectedItem().toString());
                    Txt_nombre.setText(FramePrincipal.ldc.RetornarNombreCliente(Cbx_Nit.getSelectedItem().toString()));
                    CargarTablas(Cbx_Nit.getSelectedItem().toString());
          }//GEN-LAST:event_Cbx_NitItemStateChanged

          /**
           * @param args the command line arguments
           */
          public static void main(String args[]) {
                    /* Set the Nimbus look and feel */
                    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    try {
                              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                  break;
                                        }
                              }
                    } catch (ClassNotFoundException ex) {
                              java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                                        new Facturas().setVisible(true);
                              }
                    });
          }
          
          public void initComponents2() {
                    Btt_Cerrar.setUI(new RoundedCornerButtonUI());
                    Btt_Cerrar.setFocusable(false);
                    Btt_Cerrar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                    Btt_Atras.setUI(new RoundedCornerButtonUI());
                    Btt_Atras.setFocusable(false);
                    Btt_Atras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                    
                    Btt_CargarTabla.setUI(new RoundedCornerButtonUI());
                    Btt_CargarTabla.setFocusable(false);
                    Btt_CargarTabla.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                    Btt_CargarTabla.setHorizontalTextPosition(SwingConstants.CENTER);
                    Btt_CargarTabla.setVerticalTextPosition(SwingConstants.BOTTOM);
                    
                    Panel_Interno.setOpaque(false);
                    
                    jTable1.setBorder(null);
                    jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
                    jTable1.getTableHeader().setOpaque(true);
                    jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
                    jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
                    jTable1.setRowHeight(25);
          }
          
          //Parametros que pasaran por referencia
          public String No_Factura = "", Subtotal = "", IVA = "", Total = "";
          
          private void CargarTablas(String NIT) {
                    jTable1.setModel(modelo);
                    FramePrincipal.md.AgregarAModeloTabla(modelo, Integer.parseInt(NIT), this);
                    Lbl_No_Factura.setText("FACTURA: "  + No_Factura);
                    Lbl_Subtotal.setText("Q" + Subtotal);
                    Lbl_iva.setText("Q" + IVA);
                    Lbl_total.setText("Q" + Total);
          }
          
          private void CargarNit(){
                    FramePrincipal.ldc.RetornarClientes(this);
          }
          
          private void CargarNombre(String nit){
                    FramePrincipal.ldc.RetornarNombreCliente(nit);
          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton Btt_Atras;
          private javax.swing.JButton Btt_CargarTabla;
          private javax.swing.JButton Btt_Cerrar;
          public javax.swing.JComboBox<String> Cbx_Nit;
          private javax.swing.JLabel Lbl_No_Factura;
          private javax.swing.JLabel Lbl_Subtotal;
          private javax.swing.JLabel Lbl_iva;
          private javax.swing.JLabel Lbl_total;
          private javax.swing.JPanel Panel_Interno;
          private javax.swing.JTextField Txt_nombre;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JPanel jPanel1;
          private javax.swing.JScrollPane jScrollPane1;
          private javax.swing.JSeparator jSeparator2;
          private javax.swing.JTable jTable1;
          // End of variables declaration//GEN-END:variables
}