package co.edu.uniquindio;

import java.time.LocalDate;

public class ArchivoMedico {
    private String nombre;
    private byte[] contenido;
    private TipoArchivo tipoArchivo;
    private LocalDate fecha;

    public ArchivoMedico(String nombre, byte[] contenido, TipoArchivo tipoArchivo, LocalDate fecha) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipoArchivo = tipoArchivo;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public TipoArchivo getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(TipoArchivo tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

