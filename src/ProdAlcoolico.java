public class ProdAlcoolico extends Produto {

    private static double taxaAlcool;

    public ProdAlcoolico(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
    }

    public static void setTaxaAlcoolica(double novaTaxa) {
        taxaAlcool = novaTaxa;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + (super.getPreco() * taxaAlcool / 100); 
    }

    @Override
    public String toString() {
        return super.toString() + " taxa alcool: " + taxaAlcool;
    }

}