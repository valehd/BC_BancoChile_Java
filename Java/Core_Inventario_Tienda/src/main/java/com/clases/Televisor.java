package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private int tamanoPantalla;
    private String resolucion;


//contructor
public Televisor(String nombre, double precio, int cantidadDisponible, int tamanoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

// sobreescribir metodo mostrarInformacio()
@Override
public void mostrarInformacion(){
   System.out.println("tamaño pantalla: "+this.tamanoPantalla+" resolucion: "+this.resolucion);

}



}
