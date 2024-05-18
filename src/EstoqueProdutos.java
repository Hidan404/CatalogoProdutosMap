import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer,Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(int codigo, String nome, int quantidade, double preco){
        produtos.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!produtos.isEmpty()){
            for (Produto p : produtos.values()) {
                valorTotal+= p.getQuantidade() *p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto  produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!produtos.isEmpty()){
            for (Produto p : produtos.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
