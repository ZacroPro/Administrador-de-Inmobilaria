
package apartamento;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.GestorRegistro;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNoidentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 195, 195));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Nombre y Apellido :");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText(" Consignar :");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("No . Identificacion :");
        jLabel3.setToolTipText("");

        txtNoidentificacion.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        box1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150000000", "180000000", "200000000" }));
        box1.setToolTipText("");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Seleccionar Apartamento - Tamaño.");
        jLabel4.setToolTipText("");

        jButton2.setText("Salir");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setToolTipText("");

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaFactura);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("Pequeño : 150.000.000");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("Mediano : 180.000.000");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("Grande : 200.000.000");
        jLabel7.setToolTipText("");

        jLabel8.setText("Venta de Apartamentos");
        jLabel8.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNoidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
       
    }//GEN-LAST:event_txtValorActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
         
    }//GEN-LAST:event_box1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    // valorPagar();
     this.crearFactura();
        SeleccionarAPTO();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtNoidentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables


    
 public void SeleccionarAPTO(){
    Apartamento val = new Apartamento();
  String nombre = txtNombre.getText();
        String identificacion = txtNoidentificacion.getText();
        int valorPagado = Integer.parseInt(txtValor.getText());
    String item =  box1.getSelectedItem().toString();
    val.precio = Integer.parseInt(item);
    
     Factura fac = new Factura();
    fac.obtenerValorPagado(Integer.parseInt(txtValor.getText()));  
    int saldo = fac.saldo(val.precio,fac.obtenerValorPagado());
     JOptionPane.showMessageDialog(this,"Usuario"+ nombre+" de No, Identificascion "+ identificacion + " de saldo " + saldo +"\n Compra exitosa !!!", "Saldo", JOptionPane.INFORMATION_MESSAGE);
   // JOptionPane.showMessageDialog(this,val.precio, "Atención", JOptionPane.INFORMATION_MESSAGE);
   
}
   private void crearFactura(){
        
        String nombre = txtNombre.getText();
        String identificacion = txtNoidentificacion.getText();
        int valorPagado = Integer.parseInt(txtValor.getText());
        Apartamento val = new Apartamento();
 if(valorPagado == 150000000 || valorPagado == 180000000 || valorPagado == 200000000){
     
 
        String item =  box1.getSelectedItem().toString();
        val.precio = Integer.parseInt(item);
    
    Factura fac = new Factura();
    
         fac.obtenerValorPagado(Integer.parseInt(txtValor.getText()));  
         int saldo = fac.saldo(val.precio,fac.obtenerValorPagado());
        
        
        GestorRegistro g = new GestorRegistro();
        Factura c = g.crearRegistro(nombre, identificacion, valorPagado, saldo);
        if (c != null){
            this.cargarFactura();
            JOptionPane.showMessageDialog(this, "Se a Facturado la compra --->"+c);
            
        }else{
            JOptionPane.showMessageDialog(this, "No se Facturo la compra , porfavor confirmar la iaformacion");
        }
     }else{
      JOptionPane.showMessageDialog(this, "Verificar su consignacion. ");
 }
   }
   private void cargarFactura() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        modelo.addColumn("NOMBRE COMPLETO");
        modelo.addColumn("NO.IDENTIFICATION");
        modelo.addColumn("SALDO");
       
        GestorRegistro gestor = new GestorRegistro();
        Map<String, Factura> lista = gestor.obtenerLista();
        for (Map.Entry<String, Factura> dato  : lista.entrySet()) {
            Factura lafactura = dato.getValue();
            Object[] datos = {
                lafactura .obtenerCliente().obtenerNombreCompleto(),
                lafactura .obtenerCliente().obtenerNoIdentificacion(),
                lafactura.obtenerSaldo()
            };
            modelo.addRow(datos);
            
        }
        this.tablaFactura.setModel(modelo);
    }
    }




