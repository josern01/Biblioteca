/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model1.Persona;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario 1
 */
public class PersonaDAO implements PersonaDAOImp {
   

    private String archivo = "personas.txt";

    @Override
    public void crear(Persona persona) {
        List<Persona> personas = listarPersonas();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            personas.add(persona);
            oos.writeObject(personas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Persona leer(int id) {
        List<Persona> personas = listarPersonas();

        for (Persona persona : personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }

        return null;
    }

    @Override
    public void actualizar(int id, Persona nuevaPersona) {
        List<Persona> personas = listarPersonas();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                personas.set(i, nuevaPersona);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                    oos.writeObject(personas);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        List<Persona> personas = listarPersonas();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                personas.remove(i);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                    oos.writeObject(personas);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return;
            }
        }
    }

    private List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            personas = (List<Persona>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // El archivo aún no existe o está vacío, no es un error
        }

        return personas;
    }
}

   

    

