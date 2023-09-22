/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagrama;

/**
 *
 * @author Lab_Redes_Eq15
 */
public class Hotel extends CuentaBancaria{
    
    String nombre;
    String direccion;
    int habitaciones;

    public Hotel(int nuumeroCuenta, String numeroBanco ,String nombre) {
        super(nuumeroCuenta, numeroBanco);
        this.nombre = nombre;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones + '}';
    }
    
    
    
}
