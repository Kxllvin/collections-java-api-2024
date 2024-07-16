package main.set.Ordenacao;

import java.util.Objects;
import java.lang.Comparable;
import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    //atributos
    private String nome;
    private long idAluno;
    private double media;

    public Aluno(long idAluno, String nome, double media) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.media = media;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj) return true;
        if(!(obj instanceof Aluno aluno)) return false;
        return Objects.equals(getIdAluno(), aluno.getIdAluno());
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hashCode(getIdAluno());
    }

    public int compareTo(Aluno aluno){
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Aluno{" + "ID/Matr.:" + idAluno + " | Nome:" + nome + " | Nota:" + media +'}';
    }
}

class ComparatorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno o1, Aluno o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
