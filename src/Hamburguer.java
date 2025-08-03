import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hamburguer{
    private List<Produto> hamburguer;
    public Hamburguer() {
        this.hamburguer = Arrays.asList(
                new Produto("Hamburguer de picanha", 37.50),
                new Produto("Hamburguer de salada", 37.50),
                new Produto("Hamburguer cheddar e bacon", 37.50),
                new Produto("Hamburguer onion rings", 37.50),
                new Produto("Hamburguer vegetariano", 37.50)
        );
    }
    public List<Produto> getHamburguer() {
        return hamburguer;

    }


}
