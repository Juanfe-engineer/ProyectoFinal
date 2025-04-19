package co.edu.uniquindio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Medico> medicos;
    private LinkedList<Paciente> pacientes;
    private EstadoCita estadoCita;
    private String motivoCita;

    public Cita(LocalDate fecha, LocalTime hora, LinkedList<Medico> medicos, LinkedList<Paciente> pacientes, EstadoCita estadoCita, String motivoCita) {
        this.fecha = fecha;
        this.hora = hora;
        this.medicos = medicos;
        this.pacientes = pacientes;
        this.estadoCita = estadoCita;
        this.motivoCita = motivoCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LinkedList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(LinkedList<Medico> medicos) {
        this.medicos = medicos;
    }

    public LinkedList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(LinkedList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }
}
