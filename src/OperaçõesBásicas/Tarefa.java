package OperaçõesBásicas;

public class Tarefa {
    
    //atributo
    private String descricao;

    //criando um construtor para receber as informações
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
