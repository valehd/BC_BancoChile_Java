package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    private String marca;
    private String memoriaRam;
    private int numeroSerie;



public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRam,
        int numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

@Override
public void mostrarInformacion(){
    System.out.println("marca: "+this.marca+" memoria ram: "+this.memoriaRam+" numero de serie: "+this.numeroSerie);
}


}
