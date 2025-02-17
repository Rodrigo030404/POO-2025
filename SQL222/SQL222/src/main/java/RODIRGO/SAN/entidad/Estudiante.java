package RODIRGO.SAN.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "codigo",nullable = true, length = 10)
    private String codigo;
    @Column(name = "nombres", nullable = true, length = 120)
    private String nombre;
    @Column(name = "apellidos", nullable = true,length = 120)
    private String apellido;
    @Column(name = "dni",nullable = true, length = 8)
    private int dni;

    public Estudiante(){

    }
    public Estudiante(Integer id, String codigo, String nombre, String apellido, int dni) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Estudiante(String codigo, String nombre, String apellido, int dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
