public class CarroLuxo extends Veiculo{
    private int qtdAirbags;
    private float tmnhPortaMalas;
    private boolean gpsIntegrado;
    
    public CarroLuxo(String marca, String modelo, String placa, int ano, double valorLocacao, 
    double valorMulta, int qtdAirbags, float tmnhPortaMalas, boolean gpsIntegrado) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta, 5);
        this.qtdAirbags = qtdAirbags;
        this.tmnhPortaMalas = tmnhPortaMalas;
        this.gpsIntegrado = gpsIntegrado;
    }

    public int getQtdAirbags() {
        return qtdAirbags;
    }
    
    public void setQtdAirbags(int qtdAirbags) {
        this.qtdAirbags = qtdAirbags;
    }
    
    public float getTmnhPortaMalas() {
        return tmnhPortaMalas;
    }
    
    public void setTmnhPortaMalas(float tmnhPortaMalas) {
        this.tmnhPortaMalas = tmnhPortaMalas;
    }
    
    public boolean isGpsIntegrado() {
        return gpsIntegrado;
    }
    
    public void setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }
}