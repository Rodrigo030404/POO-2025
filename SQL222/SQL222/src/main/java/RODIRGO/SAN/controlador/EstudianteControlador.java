package RODIRGO.SAN.controlador;

import RODIRGO.SAN.entidad.Estudiante;
import RODIRGO.SAN.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteControlador {
@Autowired
    private EstudianteServicio servicio;
    @GetMapping
    public List<Estudiante> inndex(){
        return servicio.listarEstudiante();
    }
}

