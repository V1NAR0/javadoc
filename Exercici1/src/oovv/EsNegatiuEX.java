/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author vinar
 */
public class EsNegatiuEX extends Exception {

    public EsNegatiuEX () {
        super("el valor no pot ser negatiu");
    }
    public EsNegatiuEX (String msg) {
        super(msg);
    }
}