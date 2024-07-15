package main.set.Pesquisa;

public class Tarefa {
    //atributo
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

public void setConcluido(boolean concluido) {
    this.concluido = concluido;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

    @Override
    public String toString() {
        return "{" + descricao + " | Status: " + concluido + "}";
    }
}