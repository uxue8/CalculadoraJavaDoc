package operaciones;

import java.lang.System.Logger;

public class Operaciones{
	
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * 
     * @param valor1 coge un valor
     * @param valor2 coge otro valor
     * @return devuelve la respuesta de la suma que se ha hecho entre los dos valores
     */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * 
     * @param valor1 coge un valor
     * @param valor2 coge otro valor
     * @return devuelve la respuesta de la resta que se ha hecho entre los dos valores
     */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * 
     * @param valor1 coge un valor 
     * @param valor2 coge otro valor
     * @return devuelve la respuesta de esa multiplicacion entre esos dos valores
     */
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * 
     * @param valor1 coge un valor
     * @param valor2 coge otro valor
     * @return devuelve la respuesta de la division que se ha hecho entre esos dos valores
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
    /**
     * 
     * @param valor1 coge un valor
     * @param valor2 coge otro valor
     * @return devuelve el resto de la division que se ha hecho entre esos dos valores
     */
   
}