import java.util.ArrayList;
import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion{
public static void main(String[] args) {
    
    Persona persona1 = new Persona("Vale", 25);
    Persona persona2 = new Persona("Camila", 33);
    Persona persona3 = new Persona("Junaito", 20);

    CuentaBancaria cuenta1 = new CuentaBancaria(10000, persona1);
    CuentaBancaria cuenta2 = new CuentaBancaria(25000, persona2);
    CuentaBancaria cuenta3 = new CuentaBancaria(5000, persona3);


      System.out.println("==========================================");
    cuenta1.despliegaInformacion();
    
     System.out.println("==========================================");
    //DEPOSITO
    cuenta2.depositar(10000);
    cuenta2.despliegaInformacion();
    
     System.out.println("==========================================");
    //RETIRO
    cuenta3.retirar(800);
    cuenta3.despliegaInformacion();
  
    System.out.println("==========================================");

 System.out.println("Array de cuentas bancarias");
  System.out.println("==========================================");

        ArrayList<CuentaBancaria> listaDeCuentas = new ArrayList<>();
        listaDeCuentas.add(cuenta1);
        listaDeCuentas.add(cuenta2);
        listaDeCuentas.add(cuenta3);

 CuentaBancaria.imprimeInformacionDeTodasLasCuentas(listaDeCuentas);
}
}





