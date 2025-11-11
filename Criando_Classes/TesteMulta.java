package exercicos.Criando_Classes;

import java.time.LocalDate;

public class TesteMulta {

    public static void main(String[] args) {
        
        Multa multa = new Multa(1, "Alberto", "Alta velocidade em via Escola", 120, LocalDate.of(2025, 9, 22));

        multa.show();
    }
}
