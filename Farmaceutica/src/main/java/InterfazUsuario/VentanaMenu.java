/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazUsuario;


public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Farmaceutica - Pedidos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Clientes = new javax.swing.JButton();
        Farmaceuticos = new javax.swing.JButton();
        Medicamentos = new javax.swing.JButton();
        Operaciones = new javax.swing.JButton();
        Pedidos = new javax.swing.JButton();
        AgregarMedicamentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Famaceutica - Pedidos de Medicamentos");

        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        Farmaceuticos.setText("Farmaceuticos");
        Farmaceuticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarmaceuticosActionPerformed(evt);
            }
        });

        Medicamentos.setText("Medicamentos");
        Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentosActionPerformed(evt);
            }
        });

        Operaciones.setText("Operaciones");
        Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionesActionPerformed(evt);
            }
        });

        Pedidos.setText("Iniciar Pedidos");
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });

        AgregarMedicamentos.setText("Agregar Medicamentos a Pedidos");
        AgregarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMedicamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Farmaceuticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Medicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Operaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgregarMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clientes)
                    .addComponent(Operaciones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Farmaceuticos)
                    .addComponent(Pedidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Medicamentos)
                    .addComponent(AgregarMedicamentos))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FarmaceuticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarmaceuticosActionPerformed
        VentanaFarmaceutico mostrar = new VentanaFarmaceutico();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FarmaceuticosActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        VentanaCliente cliente = new VentanaCliente();
        cliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClientesActionPerformed

    private void MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentosActionPerformed
        VentanaMedicamento medicamentos = new VentanaMedicamento();
        medicamentos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MedicamentosActionPerformed

    private void OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionesActionPerformed
        VentanaOperacion operaciones = new VentanaOperacion();
        operaciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OperacionesActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        VentanaPedidos pedidos = new VentanaPedidos();
        pedidos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PedidosActionPerformed

    private void AgregarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMedicamentosActionPerformed
        VentanaAgregarMedicamentos agregar = new VentanaAgregarMedicamentos();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarMedicamentosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMedicamentos;
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Farmaceuticos;
    private javax.swing.JButton Medicamentos;
    private javax.swing.JButton Operaciones;
    private javax.swing.JButton Pedidos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}