/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Instrumento;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author LUCYLEONOR
 */
public class AgregarInstrumento extends javax.swing.JDialog {

    /**
     * Creates new form AgregarInstrumento
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Instrumento> instrumento;
    int aux = 0;

    public AgregarInstrumento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtRegistro.requestFocusInWindow();
        ruta = "src/datos/instrumentos.txt";
        instrumento = Helper.TraerDatosI(ruta);
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.Volcado(salida, instrumento);
            Helper.LimpiarTabla(tblTabla);
            Helper.LlenadoTablaI(tblTabla, ruta);
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdEliminar, cmdGuardar};
            JTextField cajaD[] = {txtNombre, txtPeso, txtPrecio, txtColor};
            JTextField cajaH[] = {txtRegistro};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
            Helper.editarCajaDeTexto(cajaH);
            Helper.noEditarCajaTexto(cajaD);
            cmbGenero.setEnabled(false);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cmdCancelar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Instrumento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Instrumento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("No. Registro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtRegistro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroKeyTyped(evt);
            }
        });
        jPanel2.add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Genero");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Peso");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 30, -1));

        txtPeso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 80, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Precio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 40, -1));

        txtPrecio.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 80, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Color");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, -1));

        txtColor.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 80, -1));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vallenato", "Folclor", "Salsa", "General" }));
        jPanel2.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        cmdEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        cmdCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 150, 90, -1));

        cmdBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 110, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "No. Registro", "Nombre", "Genero", "Precio", "Color", "Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.setToolTipText("");
        tblTabla.getTableHeader().setReorderingAllowed(false);
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 200));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 760, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grupo Folclorico.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 503));

        setSize(new java.awt.Dimension(817, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        String nombre, genero, peso, color, registro, precio;
        ArrayList<Instrumento> instrumentoActualizado;

        try {
            if (txtColor.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPeso.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtRegistro.getText().isEmpty()) {
                Helper.mensaje(this, "No puede dejar campos vacios", "Error", 2);
                txtNombre.requestFocusInWindow();
                txtNombre.selectAll();
            } else if (!Helper.soloNumeros(txtPeso.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtPeso.requestFocusInWindow();
                txtPeso.selectAll();
            } else if (!Helper.soloNumeros(txtRegistro.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtRegistro.requestFocusInWindow();
                txtRegistro.selectAll();
            } else if (!Helper.soloNumeros(txtPrecio.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar numeros", "Error", 2);
                txtPrecio.requestFocusInWindow();
                txtPrecio.selectAll();
            } else if (Helper.soloLetras(txtNombre.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtNombre.requestFocusInWindow();
                txtNombre.selectAll();
            } else if (Helper.soloLetras(txtColor.getText().trim())) {
                Helper.mensaje(this, "Solo puede ingresar letras", "Error", 2);
                txtColor.requestFocusInWindow();
                txtColor.selectAll();
            } else {
                nombre = txtNombre.getText();
                genero = cmbGenero.getSelectedItem().toString();
                peso = txtPeso.getText();
                color = txtColor.getText();
                registro = txtRegistro.getText();
                precio = txtPrecio.getText();

                if (aux == 0) {

                    Instrumento i = new Instrumento(nombre, genero, peso, color, precio, registro);

                    try {
                        i.guardar(salida);
                        txtNombre.requestFocusInWindow();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    Helper.mensaje(this, "Datos guardados exitosamente", "Correcto!", 1);
                    Helper.LlenadoTablaI(tblTabla, ruta);
                    limpiar();
                    JButton botonesH[] = {cmdBuscar, cmdCancelar};
                    JButton botonesD[] = {cmdEliminar, cmdGuardar};
                    JTextField cajaD[] = {txtNombre, txtPeso, txtPrecio, txtColor};
                    JTextField cajaH[] = {txtRegistro};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                    Helper.editarCajaDeTexto(cajaH);
                    Helper.noEditarCajaTexto(cajaD);
                    cmbGenero.setEnabled(false);
                    cmbGenero.setSelectedItem(0);

                } else {

                    instrumentoActualizado = Helper.actualizarInstrumento(ruta, nombre, genero, peso, color, precio, registro);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.Volcado(salida, instrumentoActualizado);
                    Helper.LlenadoTablaI(tblTabla, ruta);
                    Helper.mensaje(this, "Datos actualizados exitosamente", "Correcto!", 1);

                    limpiar();
                    JButton botonesH[] = {cmdBuscar, cmdCancelar};
                    JButton botonesD[] = {cmdEliminar, cmdGuardar};
                    JTextField cajaD[] = {txtNombre, txtPeso, txtPrecio, txtColor};
                    JTextField cajaH[] = {txtRegistro};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                    Helper.editarCajaDeTexto(cajaH);
                    Helper.noEditarCajaTexto(cajaD);
                    cmbGenero.setEnabled(false);
                    cmbGenero.setSelectedItem(0);

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            Helper.mensaje(this, "Por favor digite datos correctos", "Error", 2);
        }

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        // TODO add your handling code here:
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblTabla.getSelectedRow();
                instrumento.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.VolcadoI(salida, instrumento);
                Helper.LlenadoTablaI(tblTabla, ruta);
                limpiar();
                txtRegistro.requestFocusInWindow();
                JButton botonesH[] = {cmdBuscar, cmdCancelar};
                JButton botonesD[] = {cmdEliminar, cmdGuardar};
                JTextField cajaD[] = {txtNombre, txtPeso, txtPrecio, txtColor};
                JTextField cajaH[] = {txtRegistro};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                Helper.editarCajaDeTexto(cajaH);
                Helper.noEditarCajaTexto(cajaD);
                cmbGenero.setEnabled(false);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        JButton botonesH[] = {cmdBuscar, cmdCancelar};
        JButton botonesD[] = {cmdEliminar, cmdGuardar};
        JTextField cajaD[] = {txtNombre, txtPeso, txtPrecio, txtColor};
        JTextField cajaH[] = {txtRegistro};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        Helper.editarCajaDeTexto(cajaH);
        Helper.noEditarCajaTexto(cajaD);
        cmbGenero.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtRegistroKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        // TODO add your handling code here:
        Instrumento p;
        int i;
        instrumento = Helper.TraerDatosI(ruta);
        i = tblTabla.getSelectedRow();
        p = instrumento.get(i);

        txtColor.setText(p.getColor());
        txtNombre.setText(p.getNombre());
        cmbGenero.setSelectedItem(p.getGenero());
        txtPeso.setText(p.getPeso());
        txtPrecio.setText(p.getPrecio());
        txtRegistro.setText(p.getIdentificacion());
        JButton botonesH[] = {cmdEliminar, cmdGuardar, cmdCancelar};
        JButton botonesD[] = {cmdBuscar};
        JTextField cajaH[] = {txtRegistro, txtNombre, txtPeso, txtPrecio, txtColor};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        Helper.editarCajaDeTexto(cajaH);
        cmbGenero.setEnabled(true);
        aux = 1;
    }//GEN-LAST:event_tblTablaMouseClicked

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed

        String registro = txtRegistro.getText();
        if (txtRegistro.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por favor no dejar campos vacios", "Revisar campos", 2);
            txtRegistro.requestFocusInWindow();
        } else {
            if (Helper.buscarPorNoRegistro(registro, ruta)) {
                Instrumento i = Helper.traerInstrumento(registro, ruta);
                txtColor.setText(i.getColor());
                txtNombre.setText(i.getNombre());
                cmbGenero.setSelectedItem(i.getGenero());
                txtPeso.setText(i.getPeso());
                txtPrecio.setText(i.getPrecio());
                txtRegistro.setText(i.getIdentificacion());
                JButton botonesH[] = {cmdEliminar, cmdGuardar, cmdCancelar};
                JButton botonesD[] = {cmdBuscar};
                JTextField cajaH[] = {txtRegistro, txtNombre, txtPeso, txtPrecio, txtColor};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                Helper.editarCajaDeTexto(cajaH);
                cmbGenero.setEnabled(true);
                aux = 1;

            } else {
                txtNombre.requestFocusInWindow();
                JButton botonesH[] = {cmdGuardar, cmdCancelar};
                JButton botonesD[] = {cmdBuscar, cmdEliminar};
                JTextField cajaH[] = {txtRegistro, txtNombre, txtPeso, txtPrecio, txtColor};
                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
                Helper.editarCajaDeTexto(cajaH);
                cmbGenero.setEnabled(true);
                aux = 0;

            }

        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    public void limpiar() {
        txtNombre.setText("");
        txtColor.setText("");
        cmbGenero.setSelectedItem(0);
        txtPeso.setText("");
        txtPrecio.setText("");
        txtRegistro.setText("");
        txtRegistro.requestFocusInWindow();
    }

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
            java.util.logging.Logger.getLogger(AgregarInstrumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInstrumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInstrumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AgregarInstrumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarInstrumento dialog = new AgregarInstrumento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables
}
