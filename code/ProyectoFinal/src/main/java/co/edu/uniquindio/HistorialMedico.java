package co.edu.uniquindio;

import java.util.LinkedList;

public class HistorialMedico {
    private LinkedList<String> diagnosticos;
    private LinkedList<String> tratamientos;
    private LinkedList<ArchivoMedico> archivoMedicos;

    public HistorialMedico(LinkedList<String> diagnosticos, LinkedList<String> tratamientos, LinkedList<ArchivoMedico> archivoMedicos) {
        this.diagnosticos = diagnosticos;
        this.tratamientos = tratamientos;
        this.archivoMedicos = archivoMedicos;
    }

    public LinkedList<String> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(LinkedList<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public LinkedList<String> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(LinkedList<String> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public LinkedList<ArchivoMedico> getArchivoMedicos() {
        return archivoMedicos;
    }

    public void setArchivoMedicos(LinkedList<ArchivoMedico> archivoMedicos) {
        this.archivoMedicos = archivoMedicos;
    }
}

