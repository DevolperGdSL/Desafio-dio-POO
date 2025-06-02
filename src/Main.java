import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso1","Descrição simples",10);
        System.out.println(curso1);
        Curso curso2 = new Curso("Curso2",30);
        System.out.println(curso2);
        Mentoria mentoria1 = new Mentoria("mentoria1", LocalDate.now());
        System.out.println(mentoria1);
    }
}