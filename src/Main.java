import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Aprenda Java do zero", 8);
        Curso curso2 = new Curso("Estrutura de Dados", "Pilhas, filas e listas", 12);
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire dúvidas ao vivo", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Formação completa em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("João - Conteúdos Inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();

        System.out.println("João - Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("João - Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("João - XP total: " + devJoao.calcularTotalXP());
    }
}