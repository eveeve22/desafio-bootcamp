import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
     Curso curso1 = new Curso();

     curso1.setTitulo("Curso Java");
     curso1.setDescricao("Descrição curso Java");
     curso1.setCargaHoraria(8);

     Curso curso2 = new Curso();
     curso2.setTitulo("Curso Boas patricas de desenvolvimento");
     curso2.setDescricao("Curso Boas patricas de desenvolvimento");
     curso2.setCargaHoraria(8);

     Mentoria mentoria1 = new Mentoria();
     mentoria1.setTitulo("Mentoria Java");
     mentoria1.setDescricao("Descrição Mentoria Java");
     mentoria1.setData(LocalDate.now());

      /*System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria1);
      */

      Bootcamp bootcamp1= new Bootcamp();
      bootcamp1.setNome("Java backend");
      bootcamp1.setDescricao("Descrição Java backend");
      bootcamp1.getConteudos().add(curso1);
      bootcamp1.getConteudos().add(curso2);
      bootcamp1.getConteudos().add(mentoria1);

      Dev devEvely = new Dev();
      devEvely.setNome("Evely");
      devEvely.inscreverBootcamp(bootcamp1);
      System.out.println("Conteudos Inscritos"+devEvely.getConteudosInscritos());
      devEvely.progredir();
      System.out.println("Conteudos Inscritos"+devEvely.getConteudosConcluidos());
      System.out.println("XP:"+ devEvely.calcularTotalXp());
      System.out.println("---------------------");

      Dev devGuilherme = new Dev();
      devGuilherme.setNome("Guilherme");
      devGuilherme.inscreverBootcamp(bootcamp1);
      System.out.println("Conteudos Inscritos"+devGuilherme.getConteudosInscritos());
      devGuilherme.progredir();
      System.out.println("Conteudos Inscritos"+devGuilherme.getConteudosConcluidos());
      System.out.println("XP:"+ devGuilherme.calcularTotalXp());
    }
}
