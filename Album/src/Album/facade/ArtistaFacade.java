
package Album.facade;

import Album.Servicios.Servicios;
import Album.dao.ArtistaDao;
import Album.dto.Artista;

public abstract class ArtistaFacade implements Servicios {
    	ArtistaDao artistaDao = new ArtistaDao();
	
	@Override
	public void agregarArtista(Artista artista) {
	artistaDao.agregarArtista(artista);
}

	@Override
	public void actualizarArtista(Artista artista) {
	artistaDao.actualizarArtista(artista);
}

	public void imprimirArtista(Artista artista) {
	artistaDao.imprimirListaDeArtistas();
}

	@Override
	public void eliminarArtista(Artista artista) {
	artistaDao.eliminarArtista(artista);
}
    
    
}
