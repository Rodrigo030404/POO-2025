package RODIRGO.SAN;

import RODIRGO.SAN.entidad.Estudiante;
import RODIRGO.SAN.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private EstudianteRepositorio repositorio;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Estudiante estudiante = new Estudiante("0001", "piril", "santy",12345678);
        Estudiante estudiante2 = new Estudiante("0002", "cielo", "santos" ,87654321);
        Estudiante estudiante3 = new Estudiante("0003", "diego", "nieto",12344321);
        repositorio.save(estudiante3);
        repositorio.save(estudiante2);
    }
}

