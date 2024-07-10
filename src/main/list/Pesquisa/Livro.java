package main.list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPubli;

    public Livro(String titulo, String autor, int anoPubli) {
        this.titulo =  titulo;
        this.autor =  autor;
        this.anoPubli =  anoPubli;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public int getanoPubli(){
        return anoPubli;
    }

    @Override
    public String toString(){
        return "Livro{" + 
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", anoPublicacao=" + anoPubli +
            '}';
    }
}