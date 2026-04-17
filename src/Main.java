import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GerenciadorAluguel sistema = new GerenciadorAluguel();
        Cliente c1 = new Cliente("Ana Silva", "9999-8888");

        Horario h10 = new Horario(LocalTime.of(10, 0), 100.0);
        Horario h11 = new Horario(LocalTime.of(11, 0), 100.0);

        sistema.registrarAluguel(c1, LocalDate.now(), Arrays.asList(h10, h11));

        Cliente c2 = new Cliente("João Souza", "8888-7777");
        sistema.registrarAluguel(c2, LocalDate.now(), Arrays.asList(h10));

        System.out.println("\n--- Relatório do Dia ---");
        sistema.consultarPorData(LocalDate.now()).forEach(System.out::println);
    }
}