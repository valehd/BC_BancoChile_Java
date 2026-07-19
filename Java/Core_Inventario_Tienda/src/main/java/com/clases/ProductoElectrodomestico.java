package com.clases;

public class ProductoElectrodomestico {
    private String nombre;
    private double precio;
    private int cantidadDisponible;


//primer constructor
public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
//cnstructor sobrecargado que inicia cantidad con 0
public ProductoElectrodomestico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }


// getters and setters    
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public int getCantidadDisponible() {
    return cantidadDisponible;
}
public void setCantidadDisponible(int cantidadDisponible) {
    this.cantidadDisponible = cantidadDisponible;
}

//metodo que imprime detalles
public void mostrarInformacion(){
    System.out.println("nombre: "+this.nombre+" precio: "+this.precio+" cantidad disponible: "+this.cantidadDisponible);
}


}

