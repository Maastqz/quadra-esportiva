package view;
import model.Aluguel;
import java.util.List;

public class AluguelView {
    public void exibirMensagem(String msg) { System.out.println(msg); }

    public void imprimirRelatorio(List<Aluguel> lista) {
        System.out.println("\nRelatório do Dia");
        lista.forEach(System.out::println);
    }
}