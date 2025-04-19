package co.edu.uniquindio;

public class Sala {
    private int numero;
    private TipoSala tipoSala;
    private EstadoSala estadoSala;

    public Sala(int numero, TipoSala tipoSala, EstadoSala estadoSala) {
        this.numero = numero;
        this.tipoSala = tipoSala;
        this.estadoSala = estadoSala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public EstadoSala getEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(EstadoSala estadoSala) {
        this.estadoSala = estadoSala;
    }
}
