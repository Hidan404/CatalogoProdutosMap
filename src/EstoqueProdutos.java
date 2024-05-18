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

    
}
