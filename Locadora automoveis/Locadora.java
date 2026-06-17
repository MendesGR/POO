import java.util.ArrayList;

public class Locadora{
    private String nome;
    private String telefone;
    private String endereco;
    private ArrayList<Veiculo> disponiveis;
    private ArrayList<Pessoa>clientes;
    private ArrayList<Emprestimo>realizados;
       
    public Locadora(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.disponiveis = new ArrayList<Veiculo>();
        this.clientes = new ArrayList<Pessoa>();
        this.realizados = new ArrayList<Emprestimo>();
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

    public boolean addCarro(Veiculo carro){
        return this.disponiveis.add(carro);
    }

    public boolean removeCarro(Veiculo carro){
        return this.disponiveis.remove(carro);
    }

    public boolean addCliente(Pessoa cliente){
        return this.clientes.add(cliente);
    } 

    public boolean removeCliente(Pessoa cliente){
        return this.clientes.remove(cliente);
    }

    public boolean addEmprestimo(Emprestimo aluguel){
        return this.realizados.add(aluguel);
    }

    public boolean removeEmprestimo(Emprestimo aluguel){ 
        return this.realizados.remove(aluguel);
    }
    
}