package main.list.Ordenacao;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

public class OrdenarNumeros {
    private List<Integer> numeros;
    private Random random;
    public OrdenarNumeros(){
        this.numeros = new ArrayList<>();
        this.random = new Random();
    }
    
    public int adicionarNumeros(int min, int max) {
    if(min > max){
        throw new IllegalArgumentException("O minimo deve ser menor que o MAXIMO!");
    }
    int numeroAleatorio = random.nextInt(max - min + 1) + min;
    this.numeros.add(numeroAleatorio);
    return numeroAleatorio;
    }

    public ordenarAscendente(){
        
    }

    public ordenarDescendente(){
    
    }
}
