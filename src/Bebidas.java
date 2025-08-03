import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bebidas {
    private List<Produto> bebidas;

    public Bebidas() {
        this.bebidas = Arrays.asList(
                new Produto("Coca zero", 4.50),
                new Produto("Fanta laranja", 3.50),
                new Produto("Cerveja", 10.0)
        );

    }

    public List<Produto> getBebidas() {
        return bebidas;
    }
}
