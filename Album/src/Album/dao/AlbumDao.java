
package Album.dao;

import Album.dto.Album;
import java.util.ArrayList;
import java.util.List;


public class AlbumDao {
     public  List<Album> albumes = new ArrayList<>();

     
    public void agregarAlbum(Album album) {
        albumes.add(album);

    }

    public void eliminarAlbum( Album album) {
        album.remove(album);
    }

    public Album buscarAlbum(int id) {
        for (int i = 0; i < albumes.size(); i++) {
            Album a= albumes.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarAlbum(Album album) {
        for (int i = 0; i < albumes.size(); i++) {
          if(albumes.get(i).getId()== album.getId()){
              albumes.get(i).setNombre(album.getNombre());
               albumes.get(i).setFechalanzamineto(album.getFechalanzamineto());
          }
            }
        }
     
    
    public void imprimirAlbum (ArrayList<Album> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }

    public void imprimirAlbum(Album album) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
