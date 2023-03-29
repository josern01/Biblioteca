
package Album.dao;

import Album.dto.Cancion;
import java.util.ArrayList;
import java.util.List;


public class CancionDao {
    
     public  List<Cancion> canciones = new ArrayList<>();

     
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);

    }

    public void eliminarCancion( Cancion cancion) {
        canciones.remove(cancion);
    }

    public Cancion buscarCancion(int id) {
        for (int i = 0; i < canciones.size(); i++) {
            Cancion a= canciones.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarCancion(Cancion cancion) {
        for (int i = 0; i < canciones.size(); i++) {
          if(canciones.get(i).getId()== cancion.getId()){
              canciones.get(i).setNombre(cancion.getNombre());
               canciones.get(i).setCompositor(cancion.getCompositor());
               canciones.get(i).setFechalanzamineto(cancion.getFechalanzamineto());
               canciones.get(i).setGenero(cancion.getGenero());
               
          }
            }
        }
     
    
    public void imprimirCancion (ArrayList<Cancion> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }

    public void imprimirListaDeCanciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
