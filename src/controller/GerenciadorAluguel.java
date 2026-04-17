package controller;
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorAluguel {
    private List<Aluguel> alugueisHistórico = new ArrayList<>();

    public String registrarAluguel(Cliente cliente, LocalDate data, List<Horario> horários) {
        for (Horario h : horários) {
            if (h.isOcupado()) return "Erro: Horário ocupado";
        }
        horários.forEach(h -> h.setOcupado(true));
        alugueisHistórico.add(new Aluguel(cliente, data, horários));
        return "Aluguel realizado com sucesso";
    }

    public List<Aluguel> consultarPorData(LocalDate data) {
        return alugueisHistórico.stream().filter(a -> a.getData().equals(data)).collect(Collectors.toList());
    }
}