/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos.Business.interfaces.Repositoris;

import Datos.Business.Exceptions.DuplicateEntityException;
import Datos.Business.Exceptions.EntityNotFoundException;
import Negocio.Estudiante;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public interface EstudianteRepository {
    
     Estudiante findEstudianteById(Integer id) throws EntityNotFoundException, Exception;
    List<Estudiante> getAllEstudiantes() throws Exception;
    void saveEstudiante(Estudiante estudiante) throws DuplicateEntityException, Exception;
    void editEstudiante(Estudiante estudiante) throws EntityNotFoundException, Exception;
    void deleteEstudianteById(Integer id) throws EntityNotFoundException, Exception;
    
}
