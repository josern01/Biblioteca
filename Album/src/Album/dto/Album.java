package Album.dto;

import java.util.List;

public class Album {

    private int id;
    private String nombre;
    private int Fechalanzamineto;
    List<Cancion>Cancion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechalanzamineto() {
        return Fechalanzamineto;
    }

    public void setFechalanzamineto(int Fechalanzamineto) {
        this.Fechalanzamineto = Fechalanzamineto;
    }

    public List<Cancion> getCancion() {
        return Cancion;
    }

    public void setCancion(List<Cancion> Cancion) {
        this.Cancion = Cancion;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombre=" + nombre + ", Fechalanzamineto=" + Fechalanzamineto + ", Cancion=" + Cancion + '}';
    }

    public void remove(Album album) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
