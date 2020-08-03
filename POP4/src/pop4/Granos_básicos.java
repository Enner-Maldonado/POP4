/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop4;

public class Granos_básicos {
    //Atributos
    private String nombre;
    private double cant_quitales;
    private double precio;
    private String Unid_medida;
    private String procedencia;
    
    //Constructor vacio
    public Granos_básicos(){
    }
    
    public Granos_básicos(String nombre, double cant_quitales, double precio ,String Unid_medida ,String procedencia){
        this.nombre=nombre;
        this.cant_quitales=cant_quitales;
        this.precio=precio;
        this.Unid_medida=Unid_medida;
        this.procedencia=procedencia;
    }

    Granos_básicos(String nombre, double cant_quitales, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Granos_básicos(String nombre, double cant_quitales, double precio, String Unid_medida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCant_quitales() {
        return cant_quitales;
    }

    public void setCant_quitales(double cant_quitales) {
        this.cant_quitales = cant_quitales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnid_medida() {
        return Unid_medida;
    }

    public void setUnid_medida(String Unid_medida) {
        this.Unid_medida = Unid_medida;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    //Metodos de administracion
    public String toString(){
        return "Granos básicos - Nombres: "+nombre+" Cantidad de quintales: "+cant_quitales+" Precio: "+precio+" Unidad de medida: "+Unid_medida+" Procedencia: "+procedencia;
    }
    
}
