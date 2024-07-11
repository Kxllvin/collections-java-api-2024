package main.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int age;
    private double height;


    public Pessoa(String nome, int age, double height) {
        this.nome = nome;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Pessoa p){
        return Integer.compare(age, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return age;
    }

    public double getAltura() {
        return height;
    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + age + '\'' +
                ", altura=" + height +
                '}';
    }

    public static class ComparatorPorAltura implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa p1, Pessoa p2){
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
}
