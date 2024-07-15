package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> agendaSet;

    public AgendaContatos() {
        this.agendaSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        agendaSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!agendaSet.isEmpty()){
        System.out.println("Sua Agenda de Contatos: " + agendaSet);
    }else {
        System.out.println("A agenda está vazia!");
    }
}

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : agendaSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;}    

    public Contato atualizarNumeroContato (String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!agendaSet.isEmpty()){
        for(Contato c : agendaSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
                }
            }
                return contatoAtualizado;
            } else {
                throw new RuntimeException("A agenda está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
    
        // Exibindo os contatos na agenda vazia
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContatos("João", 123456789);
        agendaContatos.adicionarContatos("Maria", 987654321);
        agendaContatos.adicionarContatos("Maria Fernandes", 55555555);
        agendaContatos.adicionarContatos("Ana", 88889999);
        agendaContatos.adicionarContatos("Fernando", 77778888);
        agendaContatos.adicionarContatos("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
    
        // Pesquisando contatos pelo nome
        System.out.println("Pesquisa de contatos: " + agendaContatos.pesquisaPorNome("Maria"));
    
        // Atualizando o número de um contatolista telefonia
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
      }
}
