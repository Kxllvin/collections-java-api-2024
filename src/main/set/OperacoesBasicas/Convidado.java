package main.set.OperacoesBasicas;

//import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int idconvidado;

    public Convidado(String nome, int idconvidado){
        this.nome = nome;
        this.idconvidado = idconvidado;
    }

     public String getNome() {
        return nome;
    }

    public int getConvidadoID() {
        return idconvidado;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Convidado convidado = (Convidado) o;

        return idconvidado == convidado.idconvidado;
    }
    /*public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Convidado convidado)) return false;
        return getConvidadoID() == convidado.getConvidadoID();
    }*/


    @Override
    public int hashCode(){
        return idconvidado;
        //return Objects.hash(getConvidadoID());
    }   

    @Override
    public String toString(){
        return "Convidado{" +
                            "nome='" + nome + '\''+
                            "ID_Convidado='" + idconvidado +
                            '}';
    }
}
