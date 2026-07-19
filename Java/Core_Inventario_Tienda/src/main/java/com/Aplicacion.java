package com;
import com.clases.ComputadoraPortatil;
import com.clases.ProductoElectrodomestico;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
                TiendaElectronica tienda1 = new TiendaElectronica();

        //crear productos
        ProductoElectrodomestico producto1 = new ProductoElectrodomestico("notebook", 200000, 5);
        ProductoElectrodomestico producto2 = new ProductoElectrodomestico("celular", 90000, 3);
        Televisor tv1 = new Televisor("sony", 350000, 5, 44, "Full HD");
        ComputadoraPortatil cPortatil1= new ComputadoraPortatil("pcmac", 800000, 6, "mac", "8GB", 12345);
        

        System.out.println("\n--------AGREGAR PRODUCTOS-------------------\n");
        
        //agregar productos a la tienda
        tienda1.agregarProducto(producto1);
        tienda1.agregarProducto(producto2);
        tienda1.agregarProducto(tv1);
        tienda1.agregarProducto(cPortatil1);
 
        System.out.println("------------------------------------"); 
        System.out.println("\n------------VENTA PRODUCTO----------------\n");

        //realizar venta
        tienda1.realizarVenta("notebook", 1);

 System.out.println("------------------------------------"); 
    System.out.println("\n----------BUSCAR PRODUCTO-----------------\n");
      
    //buscar producto
        ProductoElectrodomestico productoEncontrado = tienda1.buscarProductoPorNombre("celular");
        if (productoEncontrado != null) {
            System.out.println("producto encontrado: "+productoEncontrado.getNombre());
        }else{
            System.out.println("producto no encontrado");
        }

 System.out.println("------------------------------------"); 
        System.out.println("\n------------MOSTRAR TODOS LOS PRODUCTOS---------------\n");
        
        //mostrar productos
        tienda1.mostrarTodosLosProductos();
    }

     System.out.println("------------------------------------"); 

    
}
