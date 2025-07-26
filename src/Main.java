import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso novo= new Curso();

        novo.setTitulo("Back-End");
        novo.setDescricao("Curso voltado para o back end na linguagem java");
        novo.setCargaHoraria(48);

        System.out.println(novo);

        Mentoria novaMent= new Mentoria();

        novaMent.setTitulo("Intesivo Java");
        novaMent.setDescricao("Melhor boot camp");
        novaMent.setData(LocalDate.of(2025, 12, 01));
        System.out.println(novaMent);
        
    }
}
