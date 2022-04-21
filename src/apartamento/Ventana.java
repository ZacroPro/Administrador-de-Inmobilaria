
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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Nombre y Apellido :");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 100, 120, 15);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText(" Consignar :");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(610, 150, 110, 15);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("No . Identificacion :");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 100, 120, 15);

        txtNoidentificacion.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        getContentPane().add(txtNoidentificacion);
        txtNoidentificacion.setBounds(710, 90, 150, 30);

        txtNombre.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(190, 90, 150, 30);

        txtValor.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(710, 140, 150, 30);

        box1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150000000", "180000000", "200000000" }));
        box1.setToolTipText("");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(210, 250, 120, 20);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 390, 100, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Seleccionar Apartamento - Tamaño.");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 190, 220, 30);

        jButton2.setText("Salir");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 390, 90, 30);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 240, 470, 160);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("Pequeño : 150.000.000");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 230, 140, 45);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("Mediano : 180.000.000");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 270, 140, 15);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("Grande : 200.000.000");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 280, 140, 50);

        jLabel8.setText("Venta de Apartamentos");
        jLabel8.setAutoscrolls(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 40, 190, 14);

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




