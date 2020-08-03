/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop4;

/**
 *
 * @author ENNER
 */
public class Frutas {
    //Atrinbutos
    private double precio;
    private double cant_invet;
    private String categoria;
    
    //Constructores
    public Frutas(){
    }
    public Frutas(double precio, double cant_invent, String categoria){
        this.precio=precio;
        this.cant_invet=cant_invent;
        this.categoria=categoria;
    }
    //Mutadores

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCant_invet() {
        return cant_invet;
    }

    public void setCant_invet(double cant_invet) {
        this.cant_invet = cant_invet;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    //Metodos de administracion
    public String toString(){
        return "Frutas - Precio: "+precio+" cantidad de inventario: "+cant_invet+" categoria: "+categoria;  
    }
    
}
