package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.list.Ordenacao.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoas {
    //atributo

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

     public void adicionarPessoas(String nome, int age, double height) {
        pessoaList.add(new Pessoa(nome, age, height));
    }
     public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoas("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoas("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoas("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoas("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.pessoaList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }

}
