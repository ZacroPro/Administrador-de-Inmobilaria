
package apartamento;

import javax.swing.JOptionPane;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 195, 195));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel1.setText("Nombre y Apellido :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 120, 15);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel2.setText("Valor a Consignar :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 150, 110, 15);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel3.setText("No . Identificacion :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 80, 120, 15);

        txtNoidentificacion.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        getContentPane().add(txtNoidentificacion);
        txtNoidentificacion.setBounds(470, 80, 110, 21);

        txtNombre.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(180, 80, 90, 21);

        txtValor.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(180, 150, 90, 21);

        box1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150000000", "180000000", "200000000" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(470, 150, 120, 20);

        jButton1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 280, 80, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        jLabel4.setText("Apartamento - Tamaño.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 150, 150, 15);

        jButton2.setText("Registro");
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 280, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
       
    }//GEN-LAST:event_txtValorActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
         
    }//GEN-LAST:event_box1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     SeleccionarAPTO();
     //RegistroPers();
  // valorPagar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField txtNoidentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables


    
 public void SeleccionarAPTO(){
    Apartamentos val = new Apartamentos();
 
    String item =  box1.getSelectedItem().toString();
    val.precio = Integer.parseInt(item);
     Factura fac = new Factura();
    fac.obtenerValorPagado(Integer.parseInt(txtValor.getText()));  
    double saldo = fac.saldo(val.precio,fac.getValorPagado());
     JOptionPane.showMessageDialog(this,saldo, "Saldo", JOptionPane.INFORMATION_MESSAGE);
   // JOptionPane.showMessageDialog(this,val.precio, "Atención", JOptionPane.INFORMATION_MESSAGE);
   
}public void RegistroPers(){
    
    Cliente cli = new Cliente();
    
   cli.nombreCompleto = txtNombre.getText();
   cli.noIdentificacion = Integer.parseInt(txtNoidentificacion.getText());
   JOptionPane.showMessageDialog(this,cli.nombreCompleto + " No." +cli.noIdentificacion, "Atención", JOptionPane.INFORMATION_MESSAGE);
    
}
}


