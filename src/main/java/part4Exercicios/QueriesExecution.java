package part4Exercicios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

        // =========================== 1 - Consulta =================================================
        //List<Curso> cursos = cursoDAO.list();

        //cursos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
       // Curso cursoConsulta = cursoDAO.getById(3);

        //System.out.println(cursoConsulta);


        // =========================== 2 - Inserção =================================================
        
        Curso cursoADD = new Curso(
                "Programação Orientada a Objetos dasda",
                50
        );

       // cursoDAO.create(cursoADD);


        // =========================== 3 - Delete ===================================================
        List<Curso> cursos = cursoDAO.list();

      //  cursos.stream().forEach(System.out::println);
       // cursoDAO.delete(4);

       // cursos = cursoDAO.list();

       // cursos.stream().forEach(System.out::println);

        // =========================== 4 - Atualizar ================================================
       // Curso cursoAtt = cursoDAO.getById(4);
       // cursoAtt.setNome("programação orientada a gambiarra");
       // cursoAtt.setDuracaoHoras(200);
      //  cursoDAO.update(cursoAtt);
       // List<Curso> cursos = cursoDAO.list();

       // cursos.stream().forEach(System.out::println);
    }

}


