/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploDAO;

import DAO.PersonaDAO;
import DAO.PersonaDAOImp;
import Model1.Persona;

/**
 *
 * @author Usuario 1
 */
public class ejemploDAO {
    
    public static void main(String[] args) {
        
       
        PersonaDAO personaDAO = new PersonaDAO ();

        // Crear una persona
        Persona persona1 = new Persona();
        persona1.setId(1);
        persona1.setNombre("Jose");
        persona1.setEdad(30);
        personaDAO.crear(persona1);

        // Leer una persona
        Persona personaLeida = personaDAO.leer(1);
        if (personaLeida != null) {
            System.out.println("Persona leída: " + personaLeida.getNombre());
        } else {
            System.out.println("Persona no encontrada.");
        }

        // Actualizar una persona
        Persona personaNueva = new Persona();
        personaNueva.setId(1);
        personaNueva.setNombre("NuevoNombre");
        personaNueva.setEdad(35);
        personaDAO.actualizar(1, personaNueva);

        // Eliminar una persona
        personaDAO.eliminar(1);
    }
}

        
    
    
