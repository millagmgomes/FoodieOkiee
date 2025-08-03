public class Main {
    public static void main(String[] args) {


       Cliente milla = new Cliente("Milla", 15);

       Bebidas bebidas = new Bebidas();

       Pedido pedido1 = new Pedido(milla);

       Produto cerveja = bebidas.getBebidas().stream().
               filter(produto -> produto.getNome().
               equalsIgnoreCase("Cerveja")).
               findFirst().orElse(null);

       if(cerveja == null){
           pedido1.addProduto(cerveja);
       }

       pedido1.listarPedidos();

       Carrinho carrinho = new Carrinho();
       Produto carro = new Produto("Carro", 15);

       carrinho.adicionarProduto(carro);
       carrinho.adicionarProduto(cerveja);

       carrinho.listarPedidos();
        System.out.println("Carrinho: " + carrinho.calcularTotal());

    }
}

//TODO: Fazer carrinho de compras, aplicando tratamentos de idade: DONE.