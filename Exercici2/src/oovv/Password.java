/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 * 
 * @author vinar
 */
public final class Password {

    private final static int LONG_DEF = 8;

    private int longitud;

    private String contraseña;

/**
 * 
 * @return 
 */
    public int getLongitud() {
        return longitud;
    }
/**
 * 
 * @param longitud 
 */
    public void setLongitud(int longitud) {

        this.longitud = longitud;
    }
/**
 * 
 * @return 
 */
    public String getContraseña() {
        return contraseña;
    }
/**
 * 
 * @return 
 */
    public String generaPassword() {
        String password = "";
        for (int i = 0; i < longitud; i++) {
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }
/**
 * 
 * @return 
 */
    public boolean esFuerte() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }
        if (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2) {
            return true;
        } else {
            return false;
        }
    }
/**
 * 
 * @return 
 */
    public boolean esFort() {
        int cuentanumeros = 0;
        int cuentaminusculas = 0;
        int cuentamayusculas = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                cuentaminusculas += 1;
            } else {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    cuentamayusculas += 1;
                } else {
                    cuentanumeros += 1;
                }
            }
        }
        if (cuentanumeros >= 3 && cuentaminusculas >= 1 && cuentamayusculas >= 1) {
            return true;
        } else {
            return false;
        }
    }
/**
 * 
 */
    public Password() {
        this(LONG_DEF);
    }
/**
 * 
 * @param longitud 
 */
    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generaPassword();
    }
}
