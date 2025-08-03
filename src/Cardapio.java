import java.util.Arrays;
import java.util.List;

public class Cardapio implements CardapioInterface {

private Hamburguer hamburguer;
private Bebidas bebidas;
private Pizza pizzas;

public Cardapio() {
    hamburguer = new Hamburguer();
    bebidas = new Bebidas();
    pizzas = new Pizza();

}

    @Override
public void listarProdutos() {
     for (Produto p : hamburguer.getHamburguer()){
            System.out.println(p.getNome() + " - " + p.getPreco());
     }

     for (Produto p : bebidas.getBebidas()){
         System.out.println(p.getNome() + " - " + p.getPreco());
     }

        for (Produto p : pizzas.getPizzas()){
            System.out.println(p.getNome() + " - " + p.getPreco());
        }


   }

}

