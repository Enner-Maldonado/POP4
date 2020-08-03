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
public class Carnes_embutidos {
    //Atributos
    private String procedencia;
    private double cant_invent;
    private String tipo;
    private double precio;
    
    //Constuctores
    public Carnes_embutidos(){
    }
    public Carnes_embutidos(String procedencia, double cant_invent, String tipo, double precio){
    this.procedencia=procedencia;
    this.cant_invent=cant_invent;
    this.tipo=tipo;
    this.precio=precio;
    }
    //Mutadores
    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getCant_invent() {
        return cant_invent;
    }

    public void setCant_invent(double cant_invent) {
        this.cant_invent = cant_invent;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Metodos de administracion
    public String toString(){
        return "Carne y embutidos - Procedencia: "+procedencia+" Cantidad invetario: "+cant_invent+" Tipo: "+tipo+" Precio: "+precio;
    }
    
}
