
package sistema;

import ConexionSQLBD.BDAsesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import selecciones.Asesores;

public class Asesor extends javax.swing.JFrame {
ArrayList <Asesor>asesor;
BDAsesor bas= new BDAsesor();

    public Asesor() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_hortrabajo = new javax.swing.JTextField();
        txt_cubiculo = new javax.swing.JTextField();
        btn_sig = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_idasesor = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_asesorias = new javax.swing.JTextField();
        txt_trabajo = new javax.swing.JTextField();

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Datos del Asesor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 180, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Correo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Nombre ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Cubículo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Lugar de trabajo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 110, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Horarios de asesorias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Horario de trabajo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, 20));
        jPanel1.add(txt_hortrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, -1));
        jPanel1.add(txt_cubiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, 30));

        btn_sig.setText("Siguiente");
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 100, 50));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 50));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, 50));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Id Asesor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Apellidos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 30));
        jPanel1.add(txt_idasesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, 30));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));
        jPanel1.add(txt_asesorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, -1));
        jPanel1.add(txt_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        this.txt_idasesor.setText("");
        this.txt_nombre.setText("");
        this.txt_correo.setText("");
        this.txt_hortrabajo.setText("");
        this.txt_apellidos.setText("");
        this.txt_cubiculo.setText("");
        this.txt_correo.setText("");
        this.txt_asesorias.setText("");
        this.txt_hortrabajo.setText("");
        this.txt_trabajo.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
     
        Asesores as = new Asesores();
        as.setIdasesor(txt_idasesor.getText());
        as.setNombre(txt_nombre.getText());
        as.setApellidos(txt_apellidos.getText());
        as.setCubiculo(txt_cubiculo.getText());
        as.setCorreoasesor(txt_correo.getText());
        as.setHorarioasesoria(txt_asesorias.getText());
        as.setLugar(txt_trabajo.getText());
        as.setHorariotrabajo(txt_hortrabajo.getText());
       
        if (!"".equals(txt_idasesor.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_apellidos.getText()) && !"".equals(txt_cubiculo.getText())
        && !"".equals(txt_correo.getText())&& !"".equals(txt_asesorias.getText())&& !"".equals(txt_trabajo.getText())
        && !"".equals(txt_hortrabajo.getText())){
            bas.InsertarAsesores(as);
            JOptionPane.showMessageDialog(this,"Datos Guardados del asesor en la DB ", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Es obligatorio todo los campos del asesor", "", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
    RegistroAspirantes ases= new RegistroAspirantes();
    ases.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn_sigActionPerformed

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
            java.util.logging.Logger.getLogger(Asesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_sig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_asesorias;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_cubiculo;
    private javax.swing.JTextField txt_hortrabajo;
    private javax.swing.JTextField txt_idasesor;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_trabajo;
    // End of variables declaration//GEN-END:variables
}
