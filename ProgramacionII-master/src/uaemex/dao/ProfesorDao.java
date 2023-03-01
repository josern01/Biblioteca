
package uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Profesor;


public class ProfesorDao {
    List<Profesor> profesores = new ArrayList<Profesor>();
    int id=0;
    
    public void AgregarProfesor(Profesor profesor){
        profesor.setId(id+1);
        profesores.add(profesor);
        id++;
    }
    
    public void EliminarProfesor(Profesor profesor){
        profesores.remove(profesor);
        
    }
    
}
