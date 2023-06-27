package src;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> estoqueProdutos = new ArrayList<>();

    public void listarProdutos(){

        if(estoqueProdutos.isEmpty()){
            throw new NullPointerException("Ainda não foi cadastrado nenhum produto");
        }
        for (Produto produto: estoqueProdutos) {
            System.out.println(produto.mostrarProduto());
        }
    }

    public void cadastrarProduto(String nome, double valorUnitario, int quantidade, List<String> receita){
        estoqueProdutos.add(new Produto(nome,valorUnitario,quantidade,receita));
    }

    public void procurarProdutos(int indexProduto){
        if (indexProduto > estoqueProdutos.size()+1){
            throw new IllegalArgumentException("Produto não encontrado");
        }
        System.out.println(estoqueProdutos.get(indexProduto-1).mostrarProduto());
    }
    public void valorTotal(){
        double total = 0;
        for (Produto produto: estoqueProdutos) {
            total += produto.getValorTotal();
            System.out.println(produto.getNome() + " -R$ " + produto.getValorTotal() + "\n");
    }
        System.out.println("Valor total dos produtos" + total);



}
    }

