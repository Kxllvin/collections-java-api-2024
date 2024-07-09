package main.list.OperacoesBasicas;

public class Compra {
        //atributos
        private String nome;
        private double preco;
        private int qntd;
    
        public Compra(String nome, double preco, int qntd){
            this.nome = nome;
            this.preco = preco;
            this.qntd = qntd;
        }
        
        public String getNome(){
            return nome;
        }
        public double getPreco(){
            return preco;
        }
        public int getQNTD(){
            return qntd;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Item{" +
                            "nome='" + nome + '\''+
                            "preco='" + preco + '\''+
                            "quantidade='" + qntd + '\''+
                            '}';
        }
    }
