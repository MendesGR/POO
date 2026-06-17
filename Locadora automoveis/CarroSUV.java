public class CarroSUV extends Veiculo{
    private float tmnhPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;
    
    public CarroSUV(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta, float tmnhPortaMalas,
            String tipoTracao, String tipoCombustivel) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta, 3);
        this.tmnhPortaMalas = tmnhPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public float getTmnhPortaMalas() {
        return tmnhPortaMalas;
    }
    
    public void setTmnhPortaMalas(float tmnhPortaMalas) {
        this.tmnhPortaMalas = tmnhPortaMalas;
    }
    
    public String getTipoTracao() {
        return tipoTracao;
    }
    
    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    } 
}