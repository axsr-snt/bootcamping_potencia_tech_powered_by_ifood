package intermediario;

import intermediario.dominio.Bootcamp;
import intermediario.dominio.Curso;
import intermediario.dominio.Dev;
import intermediario.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java com foco a orientação a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Spring Framework");
        curso2.setDescricao("Curso Spring Framework");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java com foco a orientação a objetos");
        mentoria1.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setTitulo("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Alex");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Contúdos Inscritos Alex" + dev1.getConteudoInscrito()+ "\n");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Contúdos Inscritos Alex" + dev1.getConteudoInscrito());
        System.out.println("Contúdos Concluidos Alex" + dev1.getConteudoConcluido());
        System.out.println("XP: " + dev1.calcularTotalXp() + "\n");


        Dev dev2 = new Dev();
        dev2.setNome("Safira");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Contúdo Inscritos Safira" + dev2.getConteudoInscrito()+ "\n");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Contúdo Inscritos Safira" + dev2.getConteudoInscrito());
        System.out.println("Contúdos Concluidos Safira" + dev2.getConteudoConcluido()+ "\n");
        System.out.println("XP: " + dev2.calcularTotalXp() + "\n");
    }
}
