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
public class Verduras {
    //Atrinbutos
    private double precio;
    private double cant_invet;
    private String categoria;
    private String tipo;
    
    //Constructores
    public Verduras(){
    }
    public Verduras(double precio, double cant_invent, String categoria, String tipo){
        this.precio=precio;
        this.cant_invet=cant_invent;
        this.categoria=categoria;
        this.tipo=tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Metodos de administracion
    public String toString(){
        return "Verduras - Precio: "+precio+" cantidad de inventario: "+cant_invet+" categoria: "+categoria+" tipo: "+tipo;  
    }
}
