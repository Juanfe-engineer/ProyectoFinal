package co.edu.uniquindio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private LocalDate Dia;
    private LocalTime hora;
    private LocalTime Horafin;
    private JornadaCita Jornada;

    public Horario(LocalDate dia, LocalTime hora, LocalTime horafin, JornadaCita jornada) {
        Dia = dia;
        this.hora = hora;
        Horafin = horafin;
        Jornada = jornada;
    }

    public LocalDate getDia() {
        return Dia;
    }

    public void setDia(LocalDate dia) {
        Dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalTime getHorafin() {
        return Horafin;
    }

    public void setHorafin(LocalTime horafin) {
        Horafin = horafin;
    }

    public JornadaCita getJornada() {
        return Jornada;
    }

    public void setJornada(JornadaCita jornada) {
        Jornada = jornada;
    }
}

