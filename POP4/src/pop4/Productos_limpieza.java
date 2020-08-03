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
public class Productos_limpieza {
    //Atributos
    private String tipo;
    private String marca;
    private String codigo;
    private double precio;
    private int cantidad;
    private String proveedor;
    private String nombre_product;
    
    //Constructores
    public Productos_limpieza(){
    }
    
    public Productos_limpieza(String nombre , String marca, String codigo, double precio, int cantidad, String proveedor, String nombre_product ){
        this.tipo=tipo;
        this.marca=marca;
        this.codigo=codigo;
        this.precio=precio;
        this.cantidad=cantidad;
        this.proveedor=proveedor;
        this.nombre_product=nombre_product;
   }
    
    //Mutadores

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre_product() {
        return nombre_product;
    }

    public void setNombre_product(String nombre_product) {
        this.nombre_product = nombre_product;
    }
    
    //Metodo de administracion
    public String toString(){
        return "Productos de limpieza - Tipo: "+tipo+" Marca: "+marca+" Codigo: "+codigo+" Precio: "+precio+" Cantidad: "+cantidad+" Proveedor: "+proveedor+" Nombre del porducto"+nombre_product;
    }
}
