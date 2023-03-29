
package Album.facade;

import Album.Servicios.Servicios;
import Album.dao.CancionDao;
import Album.dto.Artista;
import Album.dto.Cancion;

public abstract class CancionFacade implements Servicios {
    
    CancionDao cancionDao = new CancionDao();
	
	@Override
	public void agregarCancion(Cancion cancion) {
	cancionDao.agregarCancion(cancion);
	}

	@Override
	public void actualizarCancion(Cancion cancion) {
	cancionDao.actualizarCancion(cancion);
	}

	public void imprimirCancion(Artista artista) {
	cancionDao.imprimirListaDeCanciones();
}

	@Override
	public void eliminarCancion(Cancion cancion) {
	cancionDao.eliminarCancion(cancion);
}
    
    
}
