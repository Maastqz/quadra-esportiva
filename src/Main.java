import controller.GerenciadorAluguel;
import model.*;
import view.AluguelView;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GerenciadorAluguel controller = new GerenciadorAluguel();
        AluguelView view = new AluguelView();

        Cliente c1 = new Cliente("Ana Silva", "9999-8888");
        Horario h10 = new Horario(LocalTime.of(10, 0), 100.0);

        String msg = controller.registrarAluguel(c1, LocalDate.now(), Arrays.asList(h10));
        view.exibirMensagem(msg);

        view.imprimirRelatorio(controller.consultarPorData(LocalDate.now()));
    }
}