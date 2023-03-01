
package uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Libro;


public class LibroDao {
    
    List<Libro> libros = new ArrayList<Libro>();
    int id=0;
    
    public void AgregarLibro(Libro libro){
        libro.setId(id+1);
        libros.add(libro);
        id++;
    }
    
    public void ActualizarLibro (Libro libro){
        
    }
    
    public void EliminarLibro(Libro libro){
        libros.remove(libro);
        
    }
    
    
    
    
}
