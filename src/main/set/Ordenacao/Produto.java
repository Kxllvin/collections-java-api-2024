package main.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    //atributos
    private String nome;
    private long idproduto;
    private double preco;
    private int quant;

    public Produto(long idproduto, String nome, double preco, int quant) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(o.getNome());
    }

    public long getIdproduto() {
        return idproduto;
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
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj) return true;
        if (!(obj instanceof Produto produto)) return false;
        return getIdproduto() == produto.getIdproduto();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(getIdproduto());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Produto{" + "ID= " + idproduto + " | nome= " + nome + " | preco= " + preco + " | QTD= "+ quant + '}';
    }
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
