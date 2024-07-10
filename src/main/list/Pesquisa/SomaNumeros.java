package main.list.Pesquisa;

import java.util.List;
import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.Random;

public class SomaNumeros {

    private List<Integer> numero;
    private Random random;
    public SomaNumeros() {
        this.numero = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionarNumero(int max, int min){
        if(min > max){
            throw new IllegalArgumentException("O minimo deve ser menor ou igual ao Maximo");
        }
        int numeroAleatorio = random.nextInt(max - min + 1) + min;
        this.numero.add(numeroAleatorio);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer num : numero)
            soma += num;
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numero.isEmpty()){
            for(Integer num : numero){
                if(num >= maiorNumero){
                    maiorNumero = num;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeErrorException(null, "A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numero.isEmpty()){
            for(Integer num : numero){
                if(num <= menorNumero){
                    menorNumero = num;
                }
            }
        return menorNumero;
    } else {
            throw new RuntimeErrorException(null, "A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if(!numero.isEmpty()){
            System.out.println(this.numero);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
            // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(500, 5 );
    somaNumeros.adicionarNumero(500, 5 );
    somaNumeros.adicionarNumero(500, 5 );
    somaNumeros.adicionarNumero(500, 5 );
    somaNumeros.adicionarNumero(500, 5 );
    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());    
    }
 }
