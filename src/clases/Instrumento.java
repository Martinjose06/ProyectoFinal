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
public class Instrumento extends Generalidad implements java.io.Serializable{
    private String genero;
    private String peso;
    private String color;
    private String precio;
    private String identificacion;
    private String nombre;
    
    

    public Instrumento(String nombre, String genero, String peso, String color, String precio,String identificacion) {
        super(identificacion,nombre);
        this.genero = genero;
        this.peso = peso;
        this.color = color;
        this.precio = precio;
        
    }

  

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   
    
    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
}
