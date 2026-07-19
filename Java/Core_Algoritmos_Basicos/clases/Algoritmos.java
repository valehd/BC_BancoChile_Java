package clases;

public class Algoritmos {


    public static boolean esPar(int numero) {
        if( numero % 2 == 0){
            
            System.out.println(numero + "es par");
            return true;

        }else{
            
            System.out.println(numero+" no es par");
            return false;
            }

        }



    public static boolean esPrimo(int nro){
        if (nro<=1){
            System.out.println(nro + " No es numero primo");
            return false;
        }else 
        if(nro==2){
            System.out.println(nro + " Es numero primo");
            return true;

        }else 
        if (nro%2==0) { 
            System.out.println(nro + " No es numero primo");
            return false;}
      

        for (int i=3; i*i <=nro; i+=2){
            if(nro%i==0){
            System.out.println(nro + " No es numero primo");

                return false;
            }

        }
        
        System.out.println(nro + " Es numero primo");

        return true;


        
    }

    public static String stringEnReversa(String txt){

        if(txt==null) 
            return null;

        // utilizo Stringbuilder: contruye un string con los mismos caracteres utilizados y ademas tiene el metodo reverse que lo da vuelta 
        String txtReverso= new StringBuilder(txt).reverse().toString();
        System.out.println("el texto es: " + txt+ " y en reversa es: " +  txtReverso);
        return txtReverso;

    }

    public static boolean esPalindromo(String txt2){
        if (txt2==null)
        return false;
        
        String txtEnMinusculas = txt2.toLowerCase();
        String txtEnReverso= stringEnReversa(txtEnMinusculas);
        
        if (txtEnMinusculas.equals(txtEnReverso)){
        System.out.println("la palabra " + txtEnMinusculas +" es palindromo" );
        return true;


        } else{
        System.out.println("la palabra " + txtEnMinusculas + " No es palindromo" );
        return false;

        }



    }

    public static void secuenciaFizzBuzz(int nroEntero){
        for(int i=1; i<= nroEntero; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }


    }
}   

