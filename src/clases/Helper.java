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
import javafx.scene.control.TextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void editarCajaDeTexto(JTextField[] caja) {
        for (int i = 0; i < caja.length; i++) {
            caja[i].setEditable(true);
        }
    }

    public static void noEditarCajaTexto(JTextField[] caja) {
        for (int i = 0; i < caja.length; i++) {
            caja[i].setEditable(false);
        }
    }

    public static void LimpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void LlenadoTabla(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Alumno> alumno = TraerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = alumno.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(alumno.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(alumno.get(i).getNombre(), i, 2);
            tm.setValueAt(alumno.get(i).getPrimer_apellido(), i, 3);
            tm.setValueAt(alumno.get(i).getSegundo_apellido(), i, 4);
            tm.setValueAt(alumno.get(i).getEdad(), i, 5);
            tm.setValueAt(alumno.get(i).getClase(), i, 6);
            tm.setValueAt(alumno.get(i).getSexo(), i, 7);
        }
    }

    public static void LlenadoTabla(JTable tabla, ArrayList<Alumno> alumno) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = alumno.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(alumno.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(alumno.get(i).getNombre(), i, 2);
            tm.setValueAt(alumno.get(i).getPrimer_apellido(), i, 3);
            tm.setValueAt(alumno.get(i).getSegundo_apellido(), i, 4);
            tm.setValueAt(alumno.get(i).getEdad(), i, 5);
            tm.setValueAt(alumno.get(i).getClase(), i, 6);
            tm.setValueAt(alumno.get(i).getSexo(), i, 7);
        }
    }

    public static void LlenadoTablaI(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Instrumento> instrumento = TraerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = instrumento.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
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

    public static void LlenadoTablaI(JTable tabla, ArrayList<Instrumento> instrumentos) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = instrumentos.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(instrumentos.get(i).getGenero(), i, 1);
            tm.setValueAt(instrumentos.get(i).getNombre(), i, 2);
        }
    }

    public static ArrayList TraerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList alumno = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                alumno.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return alumno;
    }

    public static ArrayList TraerDatosI(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList instrumento = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                instrumento.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return instrumento;
    }

    public static void Volcado(ObjectOutputStream salida, ArrayList alumno) {
        for (int i = 0; i < alumno.size(); i++) {
            try {
                salida.writeObject(alumno.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void VolcadoI(ObjectOutputStream salida, ArrayList instrumento) {
        for (int i = 0; i < instrumento.size(); i++) {
            try {
                salida.writeObject(instrumento.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void ListadoInstrumentoPorGenero(JTable tabla, String ruta, String genero) {
        ArrayList<Instrumento> instrumentos = TraerDatosI(ruta);
        ArrayList<Instrumento> instrumentosFiltrados = new ArrayList();
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getGenero().equals(genero)) {
                instrumentosFiltrados.add(instrumentos.get(i));
            }
        }
        LlenadoTablaI(tabla, instrumentosFiltrados);
    }

    public static void ListadoAlumnoPorSexo(JTable tabla, String ruta, String sexo) {
        ArrayList<Alumno> alumnos = TraerDatos(ruta);
        ArrayList<Alumno> alumnosFiltrados = new ArrayList();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getSexo().equals(sexo)) {
                alumnosFiltrados.add(alumnos.get(i));
            }
        }
        LlenadoTabla(tabla, alumnosFiltrados);
    }

    public static void ListadoAlumnoPorClase(JTable tabla, String ruta, String clase) {
        ArrayList<Alumno> alumnos = TraerDatos(ruta);
        ArrayList<Alumno> alumnosFiltrados = new ArrayList();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getClase().equals(clase)) {
                alumnosFiltrados.add(alumnos.get(i));
            }
        }
        LlenadoTabla(tabla, alumnosFiltrados);
    }

    public static boolean buscarPorIdentificacion(String identificacion, String ruta) {
        ArrayList<Alumno> alumnos = TraerDatos(ruta);
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion().equals(identificacion)) {
                return true;
            }

        }
        return false;
    }

    public static boolean buscarPorNoRegistro(String numero_registro, String ruta) {
        ArrayList<Instrumento> instrumento = TraerDatosI(ruta);
        for (int i = 0; i < instrumento.size(); i++) {
            if (instrumento.get(i).getNumero_registro().equals(numero_registro)) {
                return true;
            }

        }
        return false;
    }

    public static Alumno traerAlumno(String identificacion, String ruta) {
        ArrayList<Alumno> alumnos = TraerDatos(ruta);
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion().equals(identificacion)) {
                return alumnos.get(i);
            }

        }
        return null;
    }

    public static Instrumento traerInstrumento(String numero_registro, String ruta) {
        ArrayList<Instrumento> instrumento = TraerDatosI(ruta);
        for (int i = 0; i < instrumento.size(); i++) {
            if (instrumento.get(i).getNumero_registro().equals(numero_registro)) {
                return instrumento.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Alumno> actualizarAlumno(String ruta, String identificacion, String nombre, String primer_apellido, String segundo_apellido, String edad, String clase, String sexo) {
        ArrayList<Alumno> alumnos = TraerDatos(ruta);
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion().equals(identificacion)) {
                alumnos.get(i).setNombre(nombre);
                alumnos.get(i).setPrimer_apellido(primer_apellido);
                alumnos.get(i).setSegundo_apellido(segundo_apellido);
                alumnos.get(i).setEdad(edad);
                alumnos.get(i).setClase(clase);
                alumnos.get(i).setSexo(sexo);

                i = alumnos.size();
            }
        }
        return alumnos;
    }

    public static ArrayList<Instrumento> actualizarInstrumento(String ruta, String nombre, String genero, String peso, String color, String precio, String numero_registro) {
        ArrayList<Instrumento> instrumento = TraerDatosI(ruta);
        for (int i = 0; i < instrumento.size(); i++) {
            if (instrumento.get(i).getNumero_registro().equals(numero_registro)) {
                instrumento.get(i).setNombre(nombre);
                instrumento.get(i).setGenero(genero);
                instrumento.get(i).setPeso(peso);
                instrumento.get(i).setColor(color);
                instrumento.get(i).setPrecio(precio);

                i = instrumento.size();
            }
        }
        return instrumento;
    }

    

}
