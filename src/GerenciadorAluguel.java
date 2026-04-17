import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorAluguel {
    private List<Aluguel> alugueisHistórico = new ArrayList<>();

    public void registrarAluguel(Cliente cliente, LocalDate data, List<Horario> horariosSelecionados) {

        for (Horario h : horariosSelecionados) {
            if (h.isOcupado()) {
                System.out.println("Erro: O horário das " + h.getInicio() + " já está ocupado!");
                return;
            }
        }

        horariosSelecionados.forEach(h -> h.setOcupado(true));
        Aluguel novoAluguel = new Aluguel(cliente, data, horariosSelecionados);
        alugueisHistórico.add(novoAluguel);
        System.out.println("Aluguel realizado com sucesso para " + cliente.getNome());
    }

    public List<Aluguel> consultarPorData(LocalDate data) {
        return alugueisHistórico.stream()
                .filter(a -> a.getData().equals(data))
                .collect(Collectors.toList());
    }
}