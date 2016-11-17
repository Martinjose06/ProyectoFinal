/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author LUCYLEONOR
 */
public class Alumno extends Generalidad implements java.io.Serializable {

    private String identificacion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String edad;
    private String clase;
    private String sexo;
    private Instrumento instrumento;

    public Alumno(String identificacion, String nombre, String primer_apellido, String segundo_apellido, String edad, String clase, String sexo, Instrumento instrumento) {
        super(identificacion, nombre);
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.edad = edad;
        this.clase = clase;
        this.sexo = sexo;
        this.instrumento = instrumento;
    }

    

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
