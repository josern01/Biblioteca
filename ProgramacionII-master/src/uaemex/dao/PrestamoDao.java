
package uaemex.dao;
import mx.uaemex.dto.Prestamo;
import java.util.ArrayList;
import java.util.List;



public class PrestamoDao {
     List<Prestamo> prestamos = new ArrayList <Prestamo>();
     int id=0;
     
public void AgregarPrestamo(Prestamo prestamo){
        prestamo.setId(id+1);
        prestamos.add(prestamo);
        id++;
        
        
 
    }
    
    
}
     
     

     