package Album.facade;

import Album.dto.*;
import Album.dao.*;
import Album.Servicios.*;

public abstract class AlbumFacade implements Servicios {

    AlbumDao albumDao = new AlbumDao();
    
    @Override
    public void agregarAlbum(Album album) {
        albumDao.agregarAlbum(album);
    }
    
    @Override
    public void actualizarAlbum(Album album) {
        albumDao.actualizarAlbum(album);
    }
    
    public void imprimirAlbum(Album album) {
        albumDao.imprimirAlbum(album);
    }
    
    @Override
    public void eliminarAlbum(Album album) {
        albumDao.eliminarAlbum(album);
    }
    
}
