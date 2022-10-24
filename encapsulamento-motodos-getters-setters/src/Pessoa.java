public class Pessoa {

    private String nome = "João";
    private int idade;
    private double altura;


    // <Modificador-acesso> <retorno> nomeDoMetodo()
    public String getNome() {
        return nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    void setAltura(double altura) {
        this.altura = altura;
    }

}
