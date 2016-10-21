/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUCYLEONOR
 */
public class Helper {
    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }
    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);

            }

        }
    }
    public static void llenadoTabla(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Alumno> alumno = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = alumno.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(alumno.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(alumno.get(i).getNombre(), i, 2);
            tm.setValueAt(alumno.get(i).getPrimer_apellido(), i, 3);
            tm.setValueAt(alumno.get(i).getSegundo_apellido(), i, 4);
            tm.setValueAt(alumno.get(i).getEdad(), i, 5);
            tm.setValueAt(alumno.get(i).getClase(), i, 6);
            
        }
    }
    public static void llenadoTablaI(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Instrumento> instrumento = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = instrumento.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(instrumento.get(i).getNumero_registro(), i, 1);
            tm.setValueAt(instrumento.get(i).getNombre(), i, 2);
            tm.setValueAt(instrumento.get(i).getGenero(), i, 3);
            tm.setValueAt(instrumento.get(i).getPrecio(), i, 4);
            tm.setValueAt(instrumento.get(i).getColor(), i, 5);
            tm.setValueAt(instrumento.get(i).getPeso(), i, 6);
            
        }
    }

    public static ArrayList traerDatos(String ruta){
        FileInputStream archivo;
            ObjectInputStream entrada;
            ArrayList alumno = new ArrayList();
            Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                alumno.add(p);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return alumno;

    }
    public static ArrayList traerDatosI(String ruta){
        FileInputStream archivo;
            ObjectInputStream entrada;
            ArrayList instrumento = new ArrayList();
            Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                instrumento.add(p);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return instrumento;

    }
    public static void volcado(ObjectOutputStream salida, ArrayList alumno){
        for (int i = 0; i < alumno.size(); i++) {
            try {
                salida.writeObject(alumno.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
    public static void volcadoI(ObjectOutputStream salida, ArrayList instrumento){
        for (int i = 0; i < instrumento.size(); i++) {
            try {
                salida.writeObject(instrumento.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
}