public class AppProdutosMap {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(1, "Caderno", 5, 25.00);
        produtos.adicionarProduto(2, "lapis", 15, 2.00);
        produtos.adicionarProduto(3, "Caneta", 1, 3.50);
        produtos.adicionarProduto(4, "feijao", 30, 8.00);

        System.out.println(produtos.calcularValorTotalEstoque());
        System.out.println(produtos.obterProdutoMaisCaro());
        produtos.exibirProdutos();
    }
}
