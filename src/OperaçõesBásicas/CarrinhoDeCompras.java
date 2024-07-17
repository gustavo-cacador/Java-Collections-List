package OperaçõesBásicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    // Método para adicionar os Itens
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    // método para Remover Itens
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    // Método para Calcular Valor Total
    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    // método para exibir Itens
    public void exibirItens(){
        System.out.println(itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }
    
    public static void main(String[] args) throws Exception{
    // Criando uma Instância no carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando Itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os Itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo os Itens do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
    
}
