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

}
