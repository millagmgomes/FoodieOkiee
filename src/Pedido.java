import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public boolean addProduto(Produto produto) {
        if (produto.getNome().equals("Cerveja") && cliente.getIdade() < 18) {
            System.out.println("Pedido negado: cliente menor de idade");
            return false;
        }
        produtos.add(produto);
        System.out.println(produto.getNome()+ " adicionado ao pedido");
        return true;
        }

        void listarPedidos(){
            System.out.println("Pedido do cliente");
            for (Produto produto : produtos) {
                System.out.println("- " + produto.getNome() + ": R$" + produto.getPreco());

        }
    }
}
