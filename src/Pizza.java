import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza{
List<Produto> pizzas;
    public Pizza() {

        this.pizzas = Arrays.asList(
                new Produto("Pizza de Margherita", 30.0),
                new Produto("Pizza de Calabresa com Catupiry", 35.0),
                new Produto("Pizza de Alho com requeijao", 40.0),
                new Produto("Pizza de Frango com brocolis", 50.0),
                new Produto("Pizza de Nutella", 50.0),
                new Produto("Pizza de Ouro branco", 45.0)
        );
    }

    public List<Produto> getPizzas() {
        return pizzas;
    }

}