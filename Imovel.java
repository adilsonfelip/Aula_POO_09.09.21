package group.quintoprojeto;

public abstract class Imovel {

    protected double areaUtil;
    protected String endereco;

    public Imovel(double areaUtil, String endereco) {
        this.areaUtil = areaUtil;
        this.endereco = endereco;
    }

    public Imovel(String nome) {
        this.areaUtil = 12.50;
        this.endereco = endereco;
    }

    public double calcularIPTU() {
        return 12.5;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
