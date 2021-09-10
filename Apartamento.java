package group.quintoprojeto;

public class Apartamento extends Imovel {

    protected boolean cobertura;

    public Apartamento(double areaUtil, String endereco, boolean cobertura) {
        super(areaUtil, endereco);
        this.cobertura = cobertura;
    }

    @Override
    public double calcularIPTU() {
        if (this.cobertura) {
            return super.calcularIPTU() * 1.1;
        }
        return super.calcularIPTU();
    }

    @Override
    public String toString() {
        if (this.cobertura) {
            return "\nApartamento com cobertura\nArea Util: " + this.areaUtil + "\nEndereco: " + this.endereco;
        }
        return "\nApartamento sem cobertura\nArea Util: " + this.areaUtil + "\nEndereco: " + this.endereco;
    }
}
