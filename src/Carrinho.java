import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }

    void adicionarProduto(Produto produto){
        itens.add(produto);
        System.out.println(produto.getNome()+ " adicionado ao pedido.");
    }

    void removerProduto(Produto produto){
        itens.remove(produto);
        System.out.println(produto.getNome()+ " removido ao pedido.");
    }

    void listarPedidos(){
        System.out.println("Pedidos");
        for(Produto produto : itens){
            System.out.println(produto.getNome()+ " - " + produto.getPreco());
        }
    }

    double calcularTotal(){
        double total = 0;
        for(Produto produto : itens){
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getItens() {
        return itens;
    }

}
