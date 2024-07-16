package main.set.Ordenacao;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {
 
    private Set<Aluno> classeSet;

    public GerenciadorAlunos() {
        this.classeSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long idAluno, double media){
        classeSet.add(new Aluno(idAluno, nome, media));
    }

    public void removerAluno(long idAluno){
        Aluno alunoParaRemover = null;   
        if(!classeSet.isEmpty()){
            for(Aluno a : classeSet){
                if(a.getIdAluno() == idAluno){
                    alunoParaRemover = a;
                    break;
                }
            }
            classeSet.remove(alunoParaRemover);
            } else {
                throw new RuntimeException("Não há Alunos na Classe!");
            }

            if (alunoParaRemover == null){
                System.out.println("Matrícula não encontrada!");
            }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(classeSet);
        if(!classeSet.isEmpty()){
            System.out.println(alunoPorNome); 
        } else {
            System.out.println("Não há Alunos na Classe!"); 
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        if(!classeSet.isEmpty()){
            alunoPorNota.addAll(classeSet);
            System.out.println(alunoPorNota);
        } else {
            System.out.println("Não há Alunos com esta nota na Classe!");
        }   
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.classeSet);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.classeSet);
    
        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();
    
        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
      }
}
