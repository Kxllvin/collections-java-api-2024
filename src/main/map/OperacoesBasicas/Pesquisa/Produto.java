package main.map.OperacoesBasicas.Pesquisa;

public class Produto {

    private String nome;
    private double preco;
    private int quant;

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return" Produto{ " + "Nome: " + nome + " | Preco: R$" + preco + " | QNT: " + quant + '}';
    }
}
