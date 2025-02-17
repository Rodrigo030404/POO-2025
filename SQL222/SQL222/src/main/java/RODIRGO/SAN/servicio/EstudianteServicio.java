package RODIRGO.SAN.servicio;

import RODIRGO.SAN.entidad.Estudiante;
import RODIRGO.SAN.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicio implements InterfaceEstudianteServicio{
    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarEstudiante() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante agregarEstudinate(Estudiante estudiante) {
        return null;
    }

    @Override
    public Estudiante editarEstudiante(Integer id) {
        return null;
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return null;
    }

    @Override
    public void eliminarEstudinate(Integer id) {

    }
}
