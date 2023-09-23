/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model1.Persona;
/**
 *
 * @author Usuario 1
 */
public interface PersonaDAOImp {
    
   
    void crear(Persona persona);
    Persona leer(int id);
    void actualizar(int id, Persona nuevaPersona);
    void eliminar(int id);
}

    

