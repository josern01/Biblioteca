package uaemex.dao;
import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Alumno;

public class AlumnoDao {
    List<Alumno> alumnos = new ArrayList<Alumno>(); 
    int id=0;
    
    public void AgregarAlumno(Alumno alumno){
        alumno.setId(id+1);
        alumnos.add(alumno);
        id++;
 
    }
    
    public void Actualizar (Alumno alumno){
        
    }
    
    public void Eliminar (Alumno alumno){
         alumnos.remove(alumno);    
    }

}
