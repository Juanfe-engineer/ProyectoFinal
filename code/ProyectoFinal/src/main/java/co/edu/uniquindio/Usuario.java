package co.edu.uniquindio;

import java.util.LinkedList;

abstract class Usuario {
    protected String nombre;
    protected String id;
    protected String correo;
    protected String password;
    protected String telefono;
    protected LinkedList<Paciente> pacientes;
    protected LinkedList<Medico> medicos;

    public Usuario(String nombre, String id, String correo, String password, String telefono, LinkedList<Paciente> pacientes, LinkedList<Medico> medicos) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.pacientes = pacientes;
        this.medicos = medicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(LinkedList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public LinkedList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(LinkedList<Medico> medicos) {
        this.medicos = medicos;
    }
}

