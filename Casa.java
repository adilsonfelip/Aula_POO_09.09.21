package group.quintoprojeto;

public class Casa extends Imovel {

    private int andar;

    public Casa(double areaUtil, String endereco, int andar) {
        super(areaUtil, endereco);
        this.andar = andar;
    }

    @Override
    public double calcularIPTU() {
        return super.calcularIPTU() + (this.andar * 0.15) * 1;
    }

    @Override
    public String toString() {
        return "\nCasa\nArea Util: " + this.areaUtil + "\nQuantidade de andares: " + this.andar + "\nEndereco: " + this.endereco;
    }
}
