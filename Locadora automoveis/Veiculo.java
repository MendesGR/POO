public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocacao;
    private int cotaRenovacoes;
    private double valorMulta;
    private boolean disponivel;
    
    public Veiculo(String marca, String modelo, String placa, int ano, double valorLocacao, 
      double valorMulta, int cotaRenovacoes) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.cotaRenovacoes = cotaRenovacoes;
        this.valorMulta = valorMulta;
        this.disponivel = true;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getValorLocacao() {
        return valorLocacao;
    }
    
    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public int getCotaRenovacoes() {
        return cotaRenovacoes;
    }   

    public void alugar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }
}