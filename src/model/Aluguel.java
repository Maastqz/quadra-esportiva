package model;

import java.time.LocalDate;
import java.util.List;

public class Aluguel {
    private Cliente cliente;
    private LocalDate data;
    private List<Horario> horáriosReservados;
    private double valorTotal;

    public Aluguel(Cliente cliente, LocalDate data, List<Horario> horáriosReservados) {
        this.cliente = cliente;
        this.data = data;
        this.horáriosReservados = horáriosReservados;
        this.valorTotal = calcularTotal();
    }

    private double calcularTotal() {
        return horáriosReservados.stream().mapToDouble(Horario::getValor).sum();
    }

    public LocalDate getData() { return data; }
    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        return "Data: " + data + " | model.Cliente: " + cliente.getNome() +
                " | Total: R$ " + valorTotal + " (" + horáriosReservados.size() + " hora(s))";
    }
}