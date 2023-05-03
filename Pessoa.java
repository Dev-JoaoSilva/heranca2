public class Pessoa{
    

    public static void main(String[] args) {
        
        Pessoa pessoa =new Pessoa("Isaque",24,"Etec");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getEndereço());

        Funcionario funcionario = new Funcionario("Isaque", 24, "Etec", "Professor");

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getMarca());
        System.out.println(funcionario.getCor());
        System.out.println(funcionario.getAno());

        Patinete patinete =new Patinete("Bandeirantes","Bandeirantes","Rosa", 2023);

        System.out.println(patinete.getNome());
        System.out.println(patinete.getMarca());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());








    private String nome;
    private int idade;
    private String endereço;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEndereço() {
        return this.endereço;
    }


    public Pessoa (String nome, int idade, String endereço){
        this.nome=nome;
        this.idade=idade;
        this.endereço=endereço;
    }
    public Pessoa(){
        
    }
}