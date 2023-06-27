# São João do Estrelas

*Essa atividade foi realizada em grupo com o objetivo de treinar o GitFlow.*

<hr>

**As regras de negócio para o sistema:**
+ Cadastrar um produto;
+ Permitir listar os produtos;
+ Permitir ver o valor total dos produtos cadastrados;
+ Permitir sair do sistema.

<hr>

De início nossa squad definiu que utilizaríamos a JDK - Correto 20, e os nome das branchs são descritivos dizendo o que foi feito nela.
+ Nosso sistema conta com uma classe 'Produto' que é responsável por ter os atributos do produto que vamos receber do usuário.


+ Temos outra classe nomeada 'ProdutoController' que contém os métodos:

    + listarProduto()- que mostra todos os produtos;

    + cadastrarProduto() - cadastra o produto do usuário;

    + procurarProduto() - é resposável por exibir a descrição do produto após o usuário selecionar um;

    + valorTotal() - esse método exibe o valor e o preço total dos produtos.


+ Na nossa 'Main' temos um switch case que é responsável por exibir nosso menu e com base na escolha do usuário chamamos o método referente a essa escolha.