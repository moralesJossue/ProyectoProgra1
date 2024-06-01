/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.umg.gestionbancaria.Apertura1;
import com.umg.gestionbancaria.RetirarDinero1;

/**
 *
 * @author erick.ramazzini
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlFondo = new javax.swing.JPanel();
        jpnlFondo1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblActualizacionCliente = new javax.swing.JLabel();
        lblAperturaCunta = new javax.swing.JLabel();
        lblRealizarDeposito = new javax.swing.JLabel();
        lblRetirarDinero = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        btnRegistroCliente = new javax.swing.JButton();
        btnActualizaonCliente = new javax.swing.JButton();
        btnAperturaCuenta = new javax.swing.JButton();
        btnRealizarDeposito = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnRetirarDinero = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlFondo.setBackground(new java.awt.Color(102, 255, 255));

        lblMenu.setText("MENU");

        jLabel2.setText("REGISTRO DE CLIENTE:");

        lblActualizacionCliente.setText("ACTUALIZACIÓN DE CLIENTE:");

        lblAperturaCunta.setText("APERTURA DE CUENTA:");

        lblRealizarDeposito.setText("REALIZAR DEPÓSITO:");

        lblRetirarDinero.setText("RETIRAR DINIERO:");

        lblReportes.setText("REPORTES:");

        btnRegistroCliente.setText("ENTRAR");
        btnRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClienteActionPerformed(evt);
            }
        });

        btnActualizaonCliente.setText("ENTRAR");
        btnActualizaonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaonClienteActionPerformed(evt);
            }
        });

        btnAperturaCuenta.setText("ENTRAR");
        btnAperturaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAperturaCuentaActionPerformed(evt);
            }
        });

        btnRealizarDeposito.setText("ENTRAR");
        btnRealizarDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarDepositoActionPerformed(evt);
            }
        });

        btnReportes.setText("ENTRAR");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnRetirarDinero.setText("ENTRAR");
        btnRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDineroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlFondo1Layout = new javax.swing.GroupLayout(jpnlFondo1);
        jpnlFondo1.setLayout(jpnlFondo1Layout);
        jpnlFondo1Layout.setHorizontalGroup(
            jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondo1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(lblRetirarDinero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetirarDinero))
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(lblRealizarDeposito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarDeposito))
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(lblReportes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReportes))
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(lblAperturaCunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAperturaCuenta))
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(lblActualizacionCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnActualizaonCliente))
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistroCliente)))
                .addGap(67, 67, 67))
        );
        jpnlFondo1Layout.setVerticalGroup(
            jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addGap(18, 18, 18)
                .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                        .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnlFondo1Layout.createSequentialGroup()
                                .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpnlFondo1Layout.createSequentialGroup()
                                        .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(btnRegistroCliente))
                                        .addGap(42, 42, 42)
                                        .addComponent(lblActualizacionCliente))
                                    .addComponent(btnActualizaonCliente))
                                .addGap(43, 43, 43)
                                .addComponent(lblAperturaCunta))
                            .addComponent(btnAperturaCuenta))
                        .addGap(41, 41, 41)
                        .addComponent(lblRealizarDeposito))
                    .addComponent(btnRealizarDeposito))
                .addGap(45, 45, 45)
                .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetirarDinero)
                    .addComponent(btnRetirarDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jpnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportes)
                    .addComponent(btnReportes))
                .addGap(16, 16, 16))
        );

        btnSalir1.setText("SALIR");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlFondoLayout = new javax.swing.GroupLayout(jpnlFondo);
        jpnlFondo.setLayout(jpnlFondoLayout);
        jpnlFondoLayout.setHorizontalGroup(
            jpnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jpnlFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir1)
                .addGap(17, 17, 17))
        );
        jpnlFondoLayout.setVerticalGroup(
            jpnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpnlFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnSalir1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnlFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClienteActionPerformed
        RegistroCliente registro = new RegistroCliente();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroClienteActionPerformed

    private void btnActualizaonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaonClienteActionPerformed
        ActualizacionCliente actualizacion = new ActualizacionCliente ();
        actualizacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActualizaonClienteActionPerformed

    private void btnRealizarDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarDepositoActionPerformed
        
        // llamar al metodo la interfaz RealizarDeposito
        RealizarDeposito depo = new RealizarDeposito();
        depo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRealizarDepositoActionPerformed

    private void btnRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDineroActionPerformed
       
        RetirarDinero retiroDi = new RetirarDinero ();
        retiroDi.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRetirarDineroActionPerformed

    private void btnAperturaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAperturaCuentaActionPerformed
        Apertura ape = new Apertura();
        ape.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAperturaCuentaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
        Reportes reportes = new Reportes ();
        reportes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizaonCliente;
    private javax.swing.JButton btnAperturaCuenta;
    private javax.swing.JButton btnRealizarDeposito;
    private javax.swing.JButton btnRegistroCliente;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRetirarDinero;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpnlFondo;
    private javax.swing.JPanel jpnlFondo1;
    private javax.swing.JLabel lblActualizacionCliente;
    private javax.swing.JLabel lblAperturaCunta;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRealizarDeposito;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblRetirarDinero;
    // End of variables declaration//GEN-END:variables
}
