package co.edu.uniquindio;

import java.util.LinkedList;

public class Paciente extends Usuario {

    private final LinkedList<HistorialMedico> historialMedicos;
    private LinkedList<Cita> citas;

    public Paciente(String nombre, String id, String correo, String password, String telefono, LinkedList<Paciente> pacientes, LinkedList<Medico> medicos, LinkedList<HistorialMedico> historialMedicos, LinkedList<Cita> citas) {
        super(nombre, id, correo, password, telefono, pacientes, medicos);
        this.historialMedicos = historialMedicos;
        this.citas = citas;
    }

    public LinkedList<HistorialMedico> getHistorialMedicos() {
        return historialMedicos;
    }

    public LinkedList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(LinkedList<Cita> citas) {
        this.citas = citas;
    }
}

