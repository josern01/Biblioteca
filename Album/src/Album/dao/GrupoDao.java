
package Album.dao;

import Album.dto.Grupo;
import java.util.ArrayList;
import java.util.List;


public class GrupoDao {
     public  List<Grupo> grupos = new ArrayList<>();

     
    public void agregarGrupo(Grupo grupo) {
       grupos.add(grupo);

    }

    public void eliminarGrupo( Grupo grupo) {
        grupos.remove(grupos);
    }

    public Grupo buscarGrupo(int id) {
        for (int i = 0; i < grupos.size(); i++) {
            Grupo a= grupos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarGrupo(Grupo grupo) {
        for (int i = 0; i < grupos.size(); i++) {
          if(grupos.get(i).getId()== grupo.getId()){
              grupos.get(i).setNombre(grupo.getNombre());
              
          }
            }
        }
     
    
    public void imprimirGrupo (ArrayList<Grupo> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }

    public void MostrarListaDeGrupos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
