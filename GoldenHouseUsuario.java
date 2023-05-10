package ProjetoMoraxLP;

public class GoldenHouseUsuario implements GoldenHouseServicos{
    private String nome;
    private String endereco;
    private String cpf;
    private String idade;
    private String telefone;
    private String numConta;
    private String senha;
    public GoldenHouseUsuario(String nome, String endereco, String cpf, String idade,  String telefone, String numConta, String senha){
        this.nome=nome;
        this.endereco=endereco;
        this.cpf=cpf;
        this.idade=idade;
        this.telefone=telefone;
        this.numConta=numConta;
        this.senha=senha;
    }
    public GoldenHouseUsuario(){
        this("","","","","","","");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString(){
        return (this.nome+this.idade+this.cpf+this.endereco+this.telefone+this.numConta);
    }
}
