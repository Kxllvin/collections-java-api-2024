package main.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;


public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Não há palavras no conjunto!.");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrenquentes(){
        String linguagemMFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
              maiorContagem = entry.getValue();
              linguagemMFrequente = entry.getKey();
            }
          }
          return linguagemMFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMFrequente = contagemLinguagens.encontrarPalavrasMaisFrenquentes();
        System.out.println("A linguagem mais frequente é: " + linguagemMFrequente);
      }
}
