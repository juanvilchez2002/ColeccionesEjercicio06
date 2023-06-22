
package app;

import java.util.HashMap;
import java.util.Scanner;
import servicio.TiendaServicio;


public class App {


    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        TiendaServicio ts = new TiendaServicio();
        String op;
        boolean flag = true;
        
        
        System.out.println("--- La Tiendita de Luciano ---");
        
        do{
            System.out.println("1. Ingresar Producto. ");
            System.out.println("2. Listar Productos. ");
            System.out.println("3. Modificar Precio. ");
            System.out.println("4. Eliminar Producto. ");
            System.out.println("5. Salir. ");
            op = consola.nextLine();
            
            switch(op){
                case "1":
                    ts.cargarProductor();
                    break;
                case "2":
                    ts.listarProductos();
                    break;
                case "3":
                    ts.modificarProducto();
                    break;
                case "4":
                    ts.eliminarProducto();
                    break;
                case "5":
                    flag=false;
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion equivocada");
            }            
        }while(flag);        
    }
    
}
