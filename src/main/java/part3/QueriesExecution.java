package part3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        //List<Aluno> alunos = alunoDAO.list();

        //alunos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        //Aluno alunoParaConsulta = alunoDAO.getById(3);

        //System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

        //alunoDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================
        //List<Aluno> alunos = alunoDAO.list();

        //alunos.stream().forEach(System.out::println);
        //alunoDAO.delete(2);

        //alunos = alunoDAO.list();

        //alunos.stream().forEach(System.out::println);

        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(4);
        alunoParaAtualizar.setNome("Vanessa");
        alunoParaAtualizar.setIdade(23);
        alunoParaAtualizar.setEstado("SP");

        alunoDAO.update(alunoParaAtualizar);
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);
    }

}


