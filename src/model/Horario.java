package model;

import java.time.LocalTime;

public class Horario {
    private LocalTime inicio;
    private double valor;
    private boolean ocupado;

    public Horario(LocalTime inicio, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do horário não pode ser negativo.");
        }
        this.inicio = inicio;
        this.valor = valor;
        this.ocupado = false;
    }

    public LocalTime getInicio() { return inicio; }
    public double getValor() { return valor; }
    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
}