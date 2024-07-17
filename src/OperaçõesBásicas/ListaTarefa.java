package OperaçõesBásicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //método para Adicionar Tarefas
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //método para Remover Tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //método para Obter Número Total de Tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //método para Obter Descrições das Tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) throws Exception {
        // Criando uma instância na Lista de Tarefas
        ListaTarefa listaTarefa = new ListaTarefa();

       // Exibindo o número total de Tarefas
       System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

       // Adicionando Tarefas na lista
       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 3");

       // Exibindo e Atualizando o número total de Tarefas
       System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

       // Removendo Tarefa
       listaTarefa.removerTarefa("Tarefa 3");

       // Exibindo e Atualizando o número total de Tarefas
       System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

       // Exibindo descrições das tarefas
       listaTarefa.obterDescricoesTarefas();
    }
}
