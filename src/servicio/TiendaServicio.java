/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaServicio {
    
    //Declaramos el Maoa
    HashMap<String, Double> productos = new HashMap();
    Scanner consola = new Scanner(System.in);
    
    public void cargarProductor(){
        String producto;
        Double precio;
        
        System.out.print("Nombre Producto: ");
        producto = consola.nextLine();
        System.out.print("Precio: ");
        precio = consola.nextDouble();
        
        consola.nextLine();
        productos.put(producto, precio);        
    }
    
    public void listarProductos(){
        for(Map.Entry<String, Double> entry: productos.entrySet()){
            System.out.println("Producto: "+entry.getKey()+"  -  Precio: "+entry.getValue());
        }
    }
    
    public void modificarProducto(){
        String producto;
        Double precio;
        System.out.print("Ingrese Producto: ");
        producto = consola.nextLine();
        
        if(productos.containsKey(producto)){
            System.out.print("Precio modificado: ");
            precio = consola.nextDouble();
            
            productos.replace(producto, precio);
            
            System.out.println("Registro actualizado!!!");
        }else{
            System.out.println("Producto no Existe!!!");      
        }
    }
    
    public void eliminarProducto(){
        String producto;
        System.out.print("Ingrese Producto: ");
        producto = consola.nextLine();
        
        if(productos.containsKey(producto)){
            productos.remove(producto);
            System.out.println("Producto Eliminado!!!");
        }else{
            System.out.println("Producto no existe!!");
        }
    }
}
