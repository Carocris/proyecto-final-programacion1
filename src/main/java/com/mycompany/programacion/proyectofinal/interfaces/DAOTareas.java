
package com.mycompany.programacion.proyectofinal.interfaces;

import com.mycompany.programacion.proyectofinal.moldels.Tareas;
import java.util.List;


public interface DAOTareas {
     public Tareas getTareaById(int tareaId) throws Exception;
     public void modificar(Tareas tarea) throws Exception;
     public List<Object[]> listarTareas() throws Exception;
      public void eliminar(int tareaId) throws Exception;
}
