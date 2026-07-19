package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList <ProductoElectrodomestico> listaDeProductos;

//constructor lista vacia

public TiendaElectronica(){
    this.listaDeProductos = new ArrayList<>();

}

//metodo 1: agregar productos al array
public void agregarProducto(ProductoElectrodomestico producto){
    listaDeProductos.add(producto);
    System.out.println("producto: "+producto.getNombre()+" agregado con exito");
}

//metodo 2: mostrar todos los productos
public void mostrarTodosLosProductos(){
    for (ProductoElectrodomestico producto : listaDeProductos) {
        producto.mostrarInformacion();
        
    }
}

// metodo 3: buscar producto por nombre
public ProductoElectrodomestico buscarProductoPorNombre(String nombre){
    for (ProductoElectrodomestico producto : listaDeProductos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            return producto;
        }
        
    }
    return null;
}

//metodo 4: venta -->reduce cant disponible de stock
public void realizarVenta(String nombreProducto, int cantidadVendida){
    ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
    if (producto != null) {
        if(producto.getCantidadDisponible() <=0){
            System.out.println("producto agotado");
        } else{
            producto.setCantidadDisponible(producto.getCantidadDisponible()-1);
            System.out.println("venta realizada correctamente");
        }
    }else{
            System.out.println("no se encuentra producto");
        }
    
}

}
