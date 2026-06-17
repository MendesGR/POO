public class Emprestimo {
    private Pessoa cliente;
    private Veiculo carro;
    private int qtdRenovacao;
    private double valorTotal;

    public Emprestimo(Pessoa cliente, Veiculo carro) throws LimiteEmprestimoException, CarroIndisponivelException {
        if(carro.isDisponivel()){
            if(cliente.liberarEmprestimo()){
                this.cliente = cliente;
                this.carro = carro;
                this.qtdRenovacao = 0;
                this.valorTotal = 0;
                this.carro.alugar();
                this.cliente.fazEmprestimo();
            }else{
                throw new LimiteEmprestimoException("Limite  de emprestimos atingido");
            }
        }else{
            throw new CarroIndisponivelException("Carro não está disponivel");
        }
    }

    public void renovar(){
        this.qtdRenovacao++;
    }

    private double valorMulta(){
        if(this.qtdRenovacao > this.carro.getCotaRenovacoes()){
            return(this.qtdRenovacao - this.carro.getCotaRenovacoes()) * this.carro.getValorMulta();
        }
        return 0;
    }

    private double calcularValorTotal(){
        this.valorTotal = this.carro.getValorLocacao() + this.valorMulta();
        return this.valorTotal;
    }

    public void devolver(){
        this.carro.devolver();
        this.cliente.devolveEmprestimo();
        this.calcularValorTotal();
    }
}