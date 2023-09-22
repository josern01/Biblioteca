/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagrama;

/**
 *
 * @author Lab_Redes_Eq15
 */
public class CuentaBancaria {
   
   
   int nuumeroCuenta;
   String nombreBanco;

    public CuentaBancaria(int nuumeroCuenta, String nombreBanco) {
        this.nuumeroCuenta = nuumeroCuenta;
        this.nombreBanco = nombreBanco;
    }

    public int getNuumeroCuenta() {
        return nuumeroCuenta;
    }

    public void setNuumeroCuenta(int nuumeroCuenta) {
        this.nuumeroCuenta = nuumeroCuenta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "nuumeroCuenta=" + nuumeroCuenta + ", nombreBanco=" + nombreBanco + '}';
    }

    
   
    
       
   }
    
    

