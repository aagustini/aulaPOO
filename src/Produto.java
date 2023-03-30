public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int umCodigo, String umNome, double umPreco) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.preco = umPreco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
