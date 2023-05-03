public class Pessoa{
    
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