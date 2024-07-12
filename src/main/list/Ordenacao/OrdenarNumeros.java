package main.list.Ordenacao;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Random;


public class OrdenarNumeros {
    private List<Integer> numerosList;
    private Random random;
    public OrdenarNumeros(){
        this.numerosList = new ArrayList<>();
        this.random = new Random();
    }
    
    public int adicionarNumeros() {
    int min = 0;
    int max = 100; 
    int numeroAleatorio = random.nextInt(max - min + 1) + min;
    this.numerosList.add(numeroAleatorio);
    return numeroAleatorio;
    }

    public List<Integer> ordenarDescrescente(){
        List<Integer> numerodesc = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            numerodesc.sort(Collections.reverseOrder());
            return numerodesc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarCrescente(){
        List<Integer> numeroasc = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numeroasc);
            return numeroasc;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
          System.out.println("Lista Original: " + this.numerosList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    public static void main(String[] args) {
      // Criando uma instância da classe OrdenacaoNumeros
    OrdenarNumeros numeros = new OrdenarNumeros();
    
    // Adicionando números à lista
    for (int i = 0; i < 10; i++){
    numeros.adicionarNumeros();
    }

    // Exibindo a lista de números adicionados  
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println("Lista Crescente: " + numeros.ordenarCrescente());

    // Ordenando e exibindo em ordem descendente
    System.out.println("Lista Decrescente: " + numeros.ordenarDescrescente());
    }
}