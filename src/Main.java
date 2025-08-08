import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
        

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudo().add(novo);
        bootcamp.getConteudo().add(novaMent);
        System.out.println("---------------");

    
        Dev devIvair = new Dev();
        devIvair.setNome("Ivair");
        devIvair.inscreverBootCamp(bootcamp);
        System.out.println("**Conteudos Inscritos" + devIvair.getConteudoInscritos());
        devIvair.progredir();
        System.out.println("**Conteudos Concluidos" + devIvair.getConteudoConcluidos());

        System.out.println("___");

        Dev devKeke = new Dev();
        devKeke.setNome("Kethellen");
        devKeke.inscreverBootCamp(bootcamp);
        System.out.println("**Conteudos Inscritos" + devKeke.getConteudoInscritos());
        devKeke.progredir();
        System.out.println("**Conteudos Concluidos" + devKeke.getConteudoConcluidos());
    }
}
