
package Album.Servicios;

import Album.dto.Album;
import Album.dto.Artista;
import Album.dto.Cancion;
import Album.dto.Grupo;


public interface Servicios {
    
    void agregarAlbum(Album album);
	void actualizarAlbum(Album album);
	void imprimirAlbum();
	void eliminarAlbum(Album album);
	
	void agregarArtista(Artista artista);
	void actualizarArtista(Artista artista);
	void imprimirArtista();
	void eliminarArtista(Artista artista);
	
	void agregarCancion(Cancion cancion);
	void actualizarCancion(Cancion cancion);
	void imprimirCancion();
	void eliminarCancion(Cancion cancion);
	
	void agregarGrupo(Grupo grupo);
	void actualizarGrupo(Grupo grupo);
	void imprimirGrupo();
	void eliminarGrupo(Grupo grupo);
    
}
