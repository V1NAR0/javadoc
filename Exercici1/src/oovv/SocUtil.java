/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author vinar
 * @version 1.39, 01/27/23
 * @see EsNegatiuEX 
 */
public class SocUtil {
    
    /**
     * Comprueba si el número es capicua.
     * <p>Comprueba si el número que se pasa es capicua y devuelve true en el caso de serlo o false en caso contrario.</p>
     * @param numero
     * @return <code>true</code> si es capicua
     * @return <code>false</code> si no lo es
     * @throws EsNegatiuEX 
     * @see EsNegatiuEX
     * @deprecated Desde la versión 1.2, reemplazado por {@link #esCapikua(int))}
     */
    
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int còpia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return còpia == numAlReves;
    }
    
    /**
     * Comprueba si el número es capicua.
     * <p>Comprueba si el número que se pasa es capicua y lo devuelve en cadena de texto </p>
     * @param numero
     * @return
     * @throws EsNegatiuEX
     * @see EsNegatiuEX
     */
    
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX ();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }
    
    /**
     * Comprueba si el número es primo.
     * <p>Comprueba si el número que se pasa es primo</p>
     * @param numero
     * @return <code>true</code> si es primo
     * @return <code>false</code> si no es primo
     * @throws EsNegatiuEX
     * @see EsNegatiuEX
     */
    
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

    /**
     * 
     * @param numero
     * @return
     * @throws EsNegatiuEX
     * @see EsNegatiuEX
     */

    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un número negatiu");
        }
        long fact = 1L;
        while (numero > 1) {fact *= numero;
        numero --;
        }
        return fact;
    }
}