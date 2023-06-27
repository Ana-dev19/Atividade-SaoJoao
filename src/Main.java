package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n1-Listar Produtos\n2-Cadastrar produto\n3-Selecionar produto\n4-Ver valor total\n5-Sair\nDigite a opção desejada :");
            int opcao = sc.nextInt();
            try {
                switch (opcao){
                    case 1:
                        produtoController.listarProdutos();
                        break;
                    case 2:
                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.next();
                        System.out.println("Digite o preço do produto: ");
                        double preco = sc.nextDouble();
                        System.out.println("Digite a quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        System.out.println("Digite a quantidade de ingredientes que deseja adicionar a receita: ");
                        int numeroIng = sc.nextInt();
                        List<String> receita = new ArrayList<>();
                        for (int i = 0; i < numeroIng; i++) {
                            System.out.println("Ingrediente "+(i+1));
                            receita.add(sc.next());
                        }
                        produtoController.cadastrarProduto(nome,preco,quantidade,receita);
                        System.out.println("Produto cadastrado com sucesso");
                        break;
                    case 3:
                        System.out.println("---------PRODUTOS------------");
                        produtoController.exibirNomeProduto();
                        System.out.println("Digite o indice do produto desejado: ");
                        produtoController.procurarProdutos(sc.nextInt());
                        break;
                    case 4:
                        produtoController.valorTotal();
                        break;
                    case 5:
                        exit(0);
                    default:
                        System.out.println("Valor invalido");
                }
            }catch (IllegalArgumentException|NullPointerException erro){
                System.out.println(erro.getMessage());
            }catch (InputMismatchException erro){
                System.out.println("Por favor digite apenas inteiros!");
            }
        }

    }
}
