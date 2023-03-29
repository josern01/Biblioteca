package Album.facade;

import Album.Servicios.Servicios;
import Album.dao.GrupoDao;
import Album.dto.Grupo;

public abstract class GrupoFacade implements Servicios {

    GrupoDao grupoDao = new GrupoDao();

    @Override
    public void agregarGrupo(Grupo grupo) {
        grupoDao.agregarGrupo(grupo);
    }

    @Override
    public void actualizarGrupo(Grupo grupo) {
        grupoDao.actualizarGrupo(grupo);
    }

    public void mostrarGrupo() {
        grupoDao.MostrarListaDeGrupos();
    }

    @Override
    public void eliminarGrupo(Grupo grupo) {
        grupoDao.eliminarGrupo(grupo);
    }

}
