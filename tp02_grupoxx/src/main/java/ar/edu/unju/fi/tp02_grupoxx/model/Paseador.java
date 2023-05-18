package ar.edu.unju.fi.tp02_grupoxx.model;

import org.springframework.stereotype.Component;

@Component
public class Paseador {
    private int id;
    private String nombre;
    private String apellido;    
    private String horario;


    public Paseador(int id, String nombre, String apellido, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horario = horario;
    }


    public Paseador() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
