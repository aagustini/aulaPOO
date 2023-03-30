public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int umaQtde, Produto umProduto) {
        this.quantidade = umaQtde;
        this.prod = umProduto;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    public Produto getProd() {
        return prod;
    }

    @Override
    public String toString() {
        return String.format("(%03d) %-15s %5.2f %2d  %7.2f",
                prod.getCodigo(),
                prod.getNome(),
                prod.getPreco(),
                this.quantidade,
                this.getValor());
    }
}
