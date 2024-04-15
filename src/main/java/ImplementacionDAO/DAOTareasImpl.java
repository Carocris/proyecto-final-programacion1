/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplementacionDAO;

import com.mycompany.programacion.proyectofinal.interfaces.DAOTareas;
import com.mycompany.programacion.proyectofinal.moldels.Tareas;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DAOTareasImpl extends Conexion implements DAOTareas {

    @Override
    public Tareas getTareaById(int tareaId) throws Exception {

        Tareas tarea = null;

        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tareas WHERE id = ? LIMIT 1;");
            st.setInt(1, tareaId);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                tarea = new Tareas();
                tarea.setId(rs.getInt("id"));
                tarea.setTitulo(rs.getString("titulo"));
                tarea.setDescripcion(rs.getString("descripcion"));
                tarea.setEstado(rs.getString("estado"));

            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return tarea;
    }

    @Override
    public void modificar(Tareas tarea) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tareas SET titulo = ?, descripcion = ?, estado = ? WHERE id = ?");
            st.setString(1, tarea.getTitulo());
            st.setString(2, tarea.getDescripcion());
            st.setString(3, tarea.getEstado());
            st.setInt(4, tarea.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Object[]> listarTareas() throws Exception {

        List<Object[]> lista = null;
        try {
            this.conectar();
            String query = "SELECT id, titulo FROM tareas;";
            PreparedStatement st = this.conexion.prepareStatement(query);

            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Object[] tarea = new Object[2];
                tarea[0] = rs.getInt("id");
                tarea[1] = rs.getString("titulo");
                lista.add(tarea);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public void eliminar(int tareaId) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tareas SET titulo = '', descripcion = '', estado = '',  WHERE id = ?;");
            st.setInt(1, tareaId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
}
