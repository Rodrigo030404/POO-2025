package RODIRGO.SAN.servicio;

import RODIRGO.SAN.entidad.Estudiante;

import java.util.List;

public interface InterfaceEstudianteServicio {
    public List<Estudiante> listarEstudiante();
    public Estudiante agregarEstudinate(Estudiante estudiante);
    public Estudiante editarEstudiante(Integer id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudinate(Integer id);
}
