package Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class OrdenacaoPessoas {
    // atributo
    public List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) throws Exception{
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("Gustavo", 23, 1.80);
    ordenacaoPessoas.adicionarPessoa("Miguel", 17, 1.78);
    ordenacaoPessoas.adicionarPessoa("Bruno", 20, 1.75);
    ordenacaoPessoas.adicionarPessoa("André", 25, 1.58);

    System.out.println(ordenacaoPessoas.pessoaList);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
    
}
