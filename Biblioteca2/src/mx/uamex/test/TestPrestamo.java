/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;

/**
 *
 * @author Angela Rios
 */
public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(1);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setIsbn(344);
        libro2.setStock(2);
        
        Libro libro3 = new Libro (); 
        libro3.setId(1);
        libro3.setNombre("Introduccion al calculo");
        libro3.setCategoria("Matematicas");
        libro3.setEditorial("International Books");
        libro3.setIsbn(456);
        libro3.setStock(3);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        listaLibros.add(libro3);
        
        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Hernadez");
        alumno1.setApellidoMaterno("Ruiz");
        alumno1.setNumeroCuenta(20227102);

        Alumno alumno2 = new Alumno(); 
        alumno2.setId(1);
        alumno2.setNombre("Raul");
        alumno2.setApellidoPaterno("Sanchez");
        alumno2.setApellidoMaterno("Perez");
        alumno2.setNumeroCuenta(2227171);
        
        Profesor profesor1 = new Profesor(); 
        profesor1.setId(1);
        profesor1.setNombre("Hipolito");
        profesor1.setApellidoPaterno("Hernandez");
        profesor1.setApellidoMaterno("Alvares");
        profesor1.setNumeroEmpleado(28916457);
        
        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        
        Prestamo prestamo2 = new Prestamo(); 
        prestamo2.setId(1);
        prestamo2.setFolio(561);
        prestamo2.setFechainicio(fechaIni);
        prestamo2.setLibros(listaLibros);
        prestamo2.setPersona(profesor1);
        
        Prestamo prestamo3 = new Prestamo(); 
        prestamo3.setId(1);
        prestamo3.setFolio(824);
        prestamo3.setFechainicio(fechaIni);
        prestamo3.setLibros(listaLibros);
        prestamo3.setPersona(alumno2);

        System.out.println(prestamo1);
        System.out.println(prestamo2);
        System.out.println(prestamo3);
        

    }
}
