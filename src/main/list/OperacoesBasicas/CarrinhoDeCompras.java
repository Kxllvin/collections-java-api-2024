package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras<Item> {
    //atributos
    private List<Compra> compraList;

    public CarrinhoDeCompras() {
        this.compraList = new ArrayList<>();
    }    
    public void adicionarItem(String nome, double preco, int qntd){
        Compra compra = new Compra(nome, preco, qntd);
        this.compraList.add(compra);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void rmItem(String nome) {
        List<Compra> itensParaRemover = new ArrayList();
        if( !compraList.isEmpty()) {
            for (Compra i : compraList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            compraList.removeAll(itensParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!compraList.isEmpty()){
        for(Compra compra : compraList) {
            double valorItem = compra.getPreco() * compra.getQNTD();
            valorTotal += valorItem;
        }
        return valorTotal;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
}

    public void exibirItens(){
        if (!compraList.isEmpty()) {
            System.out.println(this.compraList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" + "itens=" + compraList +'}';
    }

    public static void main(String[] args) {
            // Criando uma instância do carrinho de compras
    @SuppressWarnings("rawtypes")
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.rmItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }



}
