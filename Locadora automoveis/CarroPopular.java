public class CarroPopular extends Veiculo {
    private boolean arCondicionado;

    public CarroPopular(String marca, String modelo, String placa, int ano, 
        double valorLocacao, double valorMulta, boolean arCondicionado) {
            super(marca, modelo, placa, ano, valorLocacao, valorMulta, 1);
            this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}