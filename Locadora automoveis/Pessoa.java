public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int limiteEmprestimo;
    private int qtdEmprestimo;

    public Pessoa(String nome, String telefone, String endereco, int limiteEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limiteEmprestimo = limiteEmprestimo;
        this.qtdEmprestimo = 0;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public int getQtdEmprestimo() {
        return qtdEmprestimo;
    }
    
    public void fazEmprestimo(){
        this.qtdEmprestimo++;
    }

    public void devolveEmprestimo(){
        this.qtdEmprestimo--;
    }

    public boolean liberarEmprestimo(){
        return this.limiteEmprestimo > this.qtdEmprestimo;
    }
    
}