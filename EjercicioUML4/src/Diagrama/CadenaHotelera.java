/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagrama;

import java.util.ArrayList;

/**
 *
 * @author Lab_Redes_Eq15
 */
public class CadenaHotelera {
    
     String nombre;
    String director;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    //array de hoteles  
    ArrayList < Hotel> lista = new ArrayList <Hotel>();
    
    public void addHotel (Hotel hotel){
        lista.add(hotel);
    }

    
    
    public ArrayList<Hotel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Hotel> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "CadenaHotelera{" + "nombre=" + nombre + ", director=" + director + ", lista=" + lista + '}';
    }
    
    
 }
