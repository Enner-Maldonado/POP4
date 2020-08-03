/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop4;
import java.util.Date;

/**
 *
 * @author ENNER
 */
public class Liquidos {
    //Atributos
    private String categoria;
    private String empaque;
    private String tamaño;
    private String nombre_product;
    private double precio;
    private String fecha;
    
    //Constructores
    public Liquidos(){
    }
    public Liquidos(String categoria, String empaque,String tamaño, String nombres_porduct, double precio, String fecha ){
        this.categoria=categoria;
        this.empaque=empaque;
        this.tamaño=tamaño;
        this.nombre_product=nombres_porduct;
        this.precio=precio;
        this.fecha=fecha;
    }
    
    //Mutadores

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre_product() {
        return nombre_product;
    }

    public void setNombre_product(String nombre_product) {
        this.nombre_product = nombre_product;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //Metodos de adminitracion
    public String toString(){
        return "Liquidos - Categoria: "+categoria+" Empaque: "+empaque+" Tamaño: "+tamaño+" Nombre del producto: "+nombre_product+" Precio: "+precio+" Fecha: "+fecha;
    }
}
