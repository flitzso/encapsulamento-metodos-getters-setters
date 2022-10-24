public class Main {

    public static void main(String[] args) throws Exception {
        //orientado a objeto e isso você busca referencia no outro.Java
        Pessoa pessoa = new Pessoa();

         //Pegar - get  Modificar - set
        //Todas as funções de Pessoa!
        //se você matar a linha set e deixar a get no print ela vai buscar a referencia no private
        pessoa.setNome("Batman");
        pessoa.setIdade(21);
        pessoa.setAltura(1.70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

    }
}