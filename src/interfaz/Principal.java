/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.UIManager;

/**
 *
 * @author LUCYLEONOR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MnAgregar = new javax.swing.JMenu();
        MnAgregarAlumno = new javax.swing.JMenuItem();
        mnReportes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MnAgregar1 = new javax.swing.JMenu();
        MnAgregarInstrumento1 = new javax.swing.JMenuItem();
        mnReportes1 = new javax.swing.JMenuItem();
        mnCerrarSesionAdmin = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnCerrarSesion = new javax.swing.JMenuItem();
        MnSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caribbean To World");
        setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 436, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 614, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Instrumentos.jpeg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        jMenu2.setText("Alumnos");

        MnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alumno.jpg"))); // NOI18N
        MnAgregar.setText("Agregar");
        MnAgregar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        MnAgregarAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        MnAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alumno.jpg"))); // NOI18N
        MnAgregarAlumno.setText("Alumno");
        MnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgregarAlumnoActionPerformed(evt);
            }
        });
        MnAgregar.add(MnAgregarAlumno);

        jMenu2.add(MnAgregar);

        mnReportes.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alumno.jpg"))); // NOI18N
        mnReportes.setText("Reportes");
        mnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportesActionPerformed(evt);
            }
        });
        jMenu2.add(mnReportes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Instrumentos");

        MnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Instrumentow.png"))); // NOI18N
        MnAgregar1.setText("Agregar");
        MnAgregar1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        MnAgregarInstrumento1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        MnAgregarInstrumento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Instrumentow.png"))); // NOI18N
        MnAgregarInstrumento1.setText("Instrumento");
        MnAgregarInstrumento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgregarInstrumento1ActionPerformed(evt);
            }
        });
        MnAgregar1.add(MnAgregarInstrumento1);

        jMenu3.add(MnAgregar1);

        mnReportes1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnReportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Instrumentow.png"))); // NOI18N
        mnReportes1.setText("Reporte por genero");
        mnReportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportes1ActionPerformed(evt);
            }
        });
        jMenu3.add(mnReportes1);

        jMenuBar1.add(jMenu3);

        mnCerrarSesionAdmin.setText("Opciones");
        mnCerrarSesionAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mnCerrarSesionAdmin.add(jSeparator1);

        MnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        MnCerrarSesion.setText("Cerrar sesion Administrador");
        MnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCerrarSesionActionPerformed(evt);
            }
        });
        mnCerrarSesionAdmin.add(MnCerrarSesion);

        MnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        MnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        mnCerrarSesionAdmin.add(MnSalir);

        jMenuBar1.add(mnCerrarSesionAdmin);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(618, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgregarAlumnoActionPerformed
        AgregarAlumno a = new AgregarAlumno(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_MnAgregarAlumnoActionPerformed

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MnSalirActionPerformed

    private void MnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCerrarSesionActionPerformed
        PanelSeleccion ps = new PanelSeleccion();
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_MnCerrarSesionActionPerformed

    private void MnAgregarInstrumento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgregarInstrumento1ActionPerformed
        AgregarInstrumento a = new AgregarInstrumento(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_MnAgregarInstrumento1ActionPerformed

    private void mnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportesActionPerformed
        ReporteAlumno a = new ReporteAlumno(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_mnReportesActionPerformed

    private void mnReportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportes1ActionPerformed
        ListadoInstrumentos i = new ListadoInstrumentos(this, true);
        i.setVisible(true);
    }//GEN-LAST:event_mnReportes1ActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/ UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnAgregar;
    private javax.swing.JMenu MnAgregar1;
    private javax.swing.JMenuItem MnAgregarAlumno;
    private javax.swing.JMenuItem MnAgregarInstrumento1;
    private javax.swing.JMenuItem MnCerrarSesion;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnCerrarSesionAdmin;
    private javax.swing.JMenuItem mnReportes;
    private javax.swing.JMenuItem mnReportes1;
    // End of variables declaration//GEN-END:variables
}
