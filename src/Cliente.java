public class Cliente {
    private String nome;
    private int idade;
    //TODO : Forma de pagamento.

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    int getIdade(){
        return this.idade;
    }

    public String getNome() {
        return nome;
    }
}
