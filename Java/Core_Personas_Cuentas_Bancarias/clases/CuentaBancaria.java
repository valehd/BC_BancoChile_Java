package clases;

import java.util.Random;
import java.util.ArrayList;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private ArrayList<CuentaBancaria> listaDeCuentasBancarias;


    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;

        this.listaDeCuentasBancarias = new ArrayList<CuentaBancaria>();
        Random random=new Random();
        this.numeroCuenta = 100000 + random.nextInt(900000);
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Persona getTitular() {
        return titular;
    }


    public void setTitular(Persona titular) {
        this.titular = titular;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }


    public void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
        this.listaDeCuentasBancarias = listaDeCuentasBancarias;
    }
    

    
    public void depositar(double monto){
        this.saldo=this.saldo+monto;
    }

    public void retirar(double monto){
        if (this.saldo>=monto) {
            this.saldo=this.saldo-monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
        
    }

    public void despliegaInformacion(){
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: $" + this.saldo);
        if (this.titular != null) {
            this.titular.despliegaInformacion();
        }


    
    }

   public static void imprimeInformacionDeTodasLasCuentas(ArrayList<CuentaBancaria> cuentas) {
    for (CuentaBancaria cuenta : cuentas) {
        cuenta.despliegaInformacion();
    }
}




}

