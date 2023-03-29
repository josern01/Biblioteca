package Album.dao;

import Album.dto.Artista;
import java.util.ArrayList;
import java.util.List;

public class ArtistaDao {

    public List<Artista> artistas = new ArrayList<>();

    public void agregarArtista(Artista artista) {
        artistas.add(artista);

    }

    public void eliminarArtista(Artista artista) {
        artista.remove(artista);
    }

    public Artista buscarArtista(int id) {
        for (int i = 0; i < artistas.size(); i++) {
            Artista a = artistas.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void actualizarArtista(Artista artista) {
        for (int i = 0; i < artistas.size(); i++) {
            if (artistas.get(i).getId() == artista.getId()) {
                artistas.get(i).setNombreArtista(artista.getNombreArtista());

            }
        }
    }

    public void imprimirArtista(ArrayList<Artista> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());

        }

    }

    public void imprimirListaDeArtistas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
