/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class POP4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList grano_básicos = new ArrayList();
        ArrayList productos_limpieza = new ArrayList();
        ArrayList liquidos = new ArrayList();
        ArrayList carnes_embutidos = new ArrayList();
        ArrayList frutas_verduras = new ArrayList();
        Date o = new Date();
        char resp='s';
        while (resp=='s' || resp=='S') {
            System.out.println("1 - Agregar Producto \n"
                    + "2 - Modificar Producto\n"
                    + "3 - Eliminar Producto\n"
                    + "4 - Reporte\n"
                    + "5 - Salir\n"
                    + "Ingrese su opción");
            int opcion = sc.nextInt();
            if (opcion==1) {
                System.out.println("a. Agregar grano\n"
                        + "b. Agregar Limpieza\n"
                        + "c. Agregar Liquido\n"
                        + "d. Agregar embutido\n"
                        + "e. Agregar Frutas y Verdura\n"
                        + "Ingrese su opción");
                char letra = sc.next().charAt(0);
                if (letra == 'a' || letra == 'A') {
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Cantidad de quintales: ");
                    double cant_quitales = sc.nextDouble();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Unidad de medida\n"
                            + "1 - Libra\n"
                            + "2 - Medida\n"
                            + "3 - Quilo ");
                    int op = sc.nextInt();
                    String Unid_medida =" ";
                    switch (op) {
                        case 1: Unid_medida = "Libra";
                            break;
                        case 2: Unid_medida = "Medida";
                            break;
                        case 3: Unid_medida = "Quilo";
                        default:
                            System.out.println("Opcion no valida");
                    }
                    System.out.print("Procedencia: ");
                    String procedencia = sc.next();
                    grano_básicos.add(new Granos_básicos(nombre, cant_quitales, precio, Unid_medida));
               }else if(letra == 'b' || letra == 'B'){
                    System.out.print(" 1 - Liquido\n"
                            + "2 - Polvo");
                    int opc = sc.nextInt();
                    String tipo="";
                    switch (opc) {
                        case 1: tipo="Liquido";
                            break;
                        case 2: tipo="Polvo";
                        default:
                            System.out.println("Opcion no valida");
                    }
                    System.out.print("Ingrese la marca: ");
                    String marca = sc.next();
                    System.out.print("Ingrese codigo: ");
                    String codigo = sc.next();
                    int cont=0, cont1=0;
                    for (int i = 0; i < codigo.length(); i++) {//validamos que solo ingrese numero y que no se repita
                        if ((codigo.charAt(i)>47 && codigo.charAt(i)<58) && codigo.charAt(i-1)!=codigo.charAt(i)) {
                            cont++;
                        }
                        cont1++;
                    }
                    while (cont!=cont1) {
                        System.out.print("Ingrese codigo de solo numero sin repetirse: ");
                        codigo = sc.next();
                    }
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Proveedor: ");
                    String proveedor = sc.next();
                    System.out.print("Nombre del producto: ");
                    String nombre_product = sc.next();
                    productos_limpieza.add(new Productos_limpieza(tipo,marca,codigo,precio,cantidad,proveedor,nombre_product));
                }else if(letra == 'c' || letra == 'C'){
                    System.out.print("1-Lácteo\n"
                            + "2-Gaseosas\n"
                            + "3-Jugos\n"
                            + "4-agua\n"
                            + "Ingrese la categoria: ");
                    int opci =sc.nextInt();
                    String categoria = "";
                    switch (opci) {
                        case 1:categoria="Lácteos";
                            break;
                        case 2:categoria="Gaseosas";
                            break;
                        case 3:categoria="Jugos";
                            break;
                        case 4:categoria="Agua";
                        default:
                            System.out.println("Opcion no valida");
                    }
                    System.out.print("1-Botella\n"
                            + "2-Bote\n"
                            + "3-Caja\n"
                            + "4-Lata\n"
                            + "Ingrese la forma del empaque: ");
                    int opc =sc.nextInt();
                    String empaque = " ";
                    switch (opc) {
                        case 1:empaque="botella";
                            break;
                        case 2:empaque="bote";
                            break;
                        case 3:empaque="caja";
                            break;
                        case 4:empaque="lata";
                        default:
                            System.out.println("Opcion novalida");
                    }
                    System.out.print("1-pequeño\n"
                            + "2-mediano\n"
                            + "3-grande\n"
                            + "Ingrese el tamaño");
                    int tam=sc.nextInt();
                    String tamaño =" ";
                    switch (tam) {
                        case 1:tamaño="pequeño";
                            break;
                        case 2:tamaño="mediano";
                            break;
                        case 3:tamaño="grande";
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    System.out.print("Nombre del producto: ");
                    String nombre_product = sc.next();
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    String fecha =o.toString();
                    liquidos.add(new Liquidos(categoria,empaque,tamaño,nombre_product,precio,fecha));
                }else if(letra == 'd' || letra == 'D'){
                    System.out.print("Ingrese la procedencia: ");
                    String procedencia = sc.next();
                    System.out.print("cantidad: ");
                    double cant_invent =sc.nextDouble();
                    System.out.print("tipo: ");
                    String tipo = sc.next();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                }else if(letra == 'e' || letra == 'E'){
                    System.out.print("1-Frutas\n"
                            + "2-verduras\n"
                            + "Ingrese su opcion: ");
                    int opcio = sc.nextInt();
                    switch (opcio) {
                        case 1:
                            System.out.print("Ingrese precio: ");
                            double precio = sc.nextDouble();
                            System.out.print("cantidad a inventaio: ");
                            double cant_invet = sc.nextDouble();
                            System.out.print("1-citricos\n"
                                    + "2-tropical\n"
                                    + "3-grano\n"
                                    + "4-fibra\n"
                                    + "Ingrese la categoria: ");
                            int op = sc.nextInt();
                            String categoria = " ";
                            switch (op) {
                                case 1:categoria="citricos";
                                    break;
                                case 2:categoria="tropical";
                                    break;
                                case 3:categoria="grano";
                                    break;
                                case 4:categoria="fibra";
                                default:
                                    System.out.println("Opcion no valida");
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("OPcion no valida");
                    }
                }else{
                    System.out.println("Opcion no valida!!!!");
                }
            }else if(opcion==2) {
                System.out.println("a. Modificar grano\n"
                        + "b. Modificar Limpieza\n"
                        + "c. Modificar Liquido\n"
                        + "d. Modificar embutido\n"
                        + "e. Modificar Frutas y Verdura\n"
                        + "Ingrese su opción");
                char letra = sc.next().charAt(0);
                if (letra == 'a' || letra == 'A') {
                    
                }else if(letra == 'b' || letra == 'B'){
                }else if(letra == 'c' || letra == 'C'){
                }else if(letra == 'd' || letra == 'D'){
                }else if(letra == 'e' || letra == 'E'){
                }else{
                    System.out.println("Opcion no valida!!!!");
                }
            }else if(opcion==3){
                System.out.println("a. Eliminar grano\n"
                        + "b. Eliminar Limpieza\n"
                        + "c. Eliminar Liquido\n"
                        + "d. Eliminar embutido\n"
                        + "e. Eliminar Frutas y Verdura\n"
                        + "Ingrese su opción");
                char letra = sc.next().charAt(0);
                if (letra == 'a' || letra == 'b') {
                    System.out.print("Ingrese la posicion a eliminar: ");
                    int pos = sc.nextInt();
                    if (grano_básicos.size()<0 && grano_básicos.size()>pos) {
                        System.out.print("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    grano_básicos.remove(pos);
                }else if(letra == 'b' || letra == 'B'){
                    System.out.print("Ingrese la posicion a eliminar: ");
                    int pos = sc.nextInt();
                    if (productos_limpieza.size()<0 && productos_limpieza.size()>pos) {
                        System.out.print("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    productos_limpieza.remove(pos);
                }else if(letra == 'c' || letra == 'C'){
                    System.out.print("Ingrese la posicion a eliminar: ");
                    int pos = sc.nextInt();
                    if (liquidos.size()<0 && liquidos.size()>pos) {
                        System.out.print("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    liquidos.remove(pos);
                }else if(letra == 'd' || letra == 'D'){
                    System.out.print("Ingrese la posicion a eliminar: ");
                    int pos = sc.nextInt();
                    if (carnes_embutidos.size()<0 && carnes_embutidos.size()>pos) {
                        System.out.print("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    carnes_embutidos.remove(pos);
                }else if(letra == 'e' || letra == 'E'){
                    System.out.print("Ingrese la posicion a eliminar: ");
                    int pos = sc.nextInt();
                    if (frutas_verduras.size()<0 && frutas_verduras.size()>pos) {
                        System.out.print("Posicion no encontrada: ");
                        pos = sc.nextInt();
                    }
                    frutas_verduras.remove(pos);
                }else{
                    System.out.println("Opcion no valida!!!!");
                }
            }else if(opcion==4){
                System.out.println("a. Listar grano\n"
                        + "b. Listar Limpieza\n"
                        + "c. LIstar Liquido\n"
                        + "d. Listar embutido\n"
                        + "e. Listar Frutas y Verdura\n"
                        + "Ingrese su opción");
                char letra = sc.next().charAt(0);
                if (letra == 'a' || letra == 'A') {
                    for (Object i : grano_básicos) {
                        System.out.println(grano_básicos.indexOf(i) +"-"+i);
                    }
                }else if(letra == 'b' || letra == 'B'){
                    for (Object i : productos_limpieza) {
                        System.out.println(productos_limpieza.indexOf(i)+"-"+i);
                    }
                }else if(letra == 'c' || letra == 'C'){
                    for (Object i : liquidos) {
                        System.out.println(liquidos.indexOf(i)+"-"+i);
                    }
                }else if(letra == 'd' || letra == 'D'){
                    for (Object i : carnes_embutidos) {
                        System.out.println(carnes_embutidos.indexOf(i)+"-"+i);
                    }
                }else if(letra == 'e' || letra == 'E'){
                    for (Object i : frutas_verduras) {
                        System.out.println(frutas_verduras.indexOf(i)+"-"+i);
                    }
                }else{
                    System.out.println("Opcion no valida!!!!");
                }
            }else if(opcion==5){
                resp='n';
            }else{
                System.out.println("Opción no valida!!!!!");
            }
        }
    }
    
}
