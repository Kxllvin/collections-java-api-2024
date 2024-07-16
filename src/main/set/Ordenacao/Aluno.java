package main.set.Ordenacao;

public class Aluno {
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
    public String toString() {
        // TODO Auto-generated method stub
        return "Aluno{" + "ID/Matr.:" + idAluno + " | Nome:" + nome + " | Nota:" + media +'}';
    }
}
