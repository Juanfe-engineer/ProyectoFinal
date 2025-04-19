package co.edu.uniquindio;

import java.util.LinkedList;

public class HospitalUQ {
    private String nombre;
    private String nit;
    private LinkedList<Usuario> usuarios;
    private LinkedList<Paciente> pacientes;
    private LinkedList<Medico> medicos;
    private LinkedList<Cita> citas;
    private LinkedList<Sala> salas;
    private LinkedList<HistorialMedico> historiales;
    private LinkedList<Horario> horarios;
    private LinkedList<ArchivoMedico> archivoMedicos;


    public HospitalUQ(String nombre, String nit, LinkedList<Usuario> usuarios, LinkedList<Paciente> pacientes, LinkedList<Medico> medicos, LinkedList<Cita> citas, LinkedList<Sala> salas, LinkedList<HistorialMedico> historiales, LinkedList<Horario> horarios, LinkedList<ArchivoMedico> archivoMedicos) {
        this.nombre = nombre;
        this.nit = nit;
        this.usuarios = usuarios;
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.citas = citas;
        this.salas = salas;
        this.historiales = historiales;
        this.horarios = horarios;
        this.archivoMedicos = archivoMedicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
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

    public LinkedList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(LinkedList<Cita> citas) {
        this.citas = citas;
    }

    public LinkedList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(LinkedList<Sala> salas) {
        this.salas = salas;
    }

    public LinkedList<HistorialMedico> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(LinkedList<HistorialMedico> historiales) {
        this.historiales = historiales;
    }

    public LinkedList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(LinkedList<Horario> horarios) {
        this.horarios = horarios;
    }

    public LinkedList<ArchivoMedico> getArchivoMedicos() {
        return archivoMedicos;
    }


    public void setArchivoMedicos(LinkedList<ArchivoMedico> archivoMedicos) {
        this.archivoMedicos = archivoMedicos;
    }


}

