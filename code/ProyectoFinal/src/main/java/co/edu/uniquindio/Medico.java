package co.edu.uniquindio;

import java.util.LinkedList;

public class Medico extends Usuario {
    private Especialidad especialidad;
    private LinkedList<Paciente> pacientes;
    private LinkedList<Horario> horarios;
    private LinkedList<Cita> citas;
    private EstadoMedico estadoMedico;

    public Medico(String nombre, String id, String correo, String password, String telefono, LinkedList<Paciente> pacientes, LinkedList<Medico> medicos, Especialidad especialidad, LinkedList<Paciente> pacientes1, LinkedList<Horario> horarios, LinkedList<Cita> citas, EstadoMedico estadoMedico) {
        super(nombre, id, correo, password, telefono, pacientes, medicos);
        this.especialidad = especialidad;
        this.pacientes = pacientes1;
        this.horarios = horarios;
        this.citas = citas;
        this.estadoMedico = estadoMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public LinkedList<Paciente> getPacientes() {
        return pacientes;
    }

    @Override
    public void setPacientes(LinkedList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public LinkedList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(LinkedList<Horario> horarios) {
        this.horarios = horarios;
    }

    public LinkedList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(LinkedList<Cita> citas) {
        this.citas = citas;
    }

    public EstadoMedico getEstadoMedico() {
        return estadoMedico;
    }

    public void setEstadoMedico(EstadoMedico estadoMedico) {
        this.estadoMedico = estadoMedico;
    }
}
