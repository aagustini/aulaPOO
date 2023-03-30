import java.util.ArrayList;

public class Venda {

    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    private int nroVenda;

    // área de infos de classe
    private static int proximaVenda = 5001;

    public static int getProximaVenda() {
        return proximaVenda;
     }

    //static {
    //    proximaVenda = 5000;
    //}

    public Venda(Cliente umCliente) {
        this.cliente = umCliente;
        this.itens = new ArrayList<>();

        nroVenda = Venda.proximaVenda;
        Venda.proximaVenda += 1;

        
        //nroVenda = proximaVenda++;
    }

    public void inserir(int umaQuantidade, Produto umProduto) {
        ItemVenda novo = new ItemVenda(umaQuantidade, umProduto);
        itens.add( novo );

        //itens.add( new ItemVenda(umaQuantidade,umProduto));
    }

    public void inserir(Produto umProduto) {

        itens.add( new ItemVenda(1, umProduto));
    }


    
    public double valorTotal() {
        double total = 0;

        // se fosse com array seria assim...

        //for (int i = 0; i<itens.length; i++) {
        //    ItemVenda item = itens[i];
        //    total += item.getValor();
        //}
        

        // com arraylist é assim
        //for (int i = 0; i<itens.size(); i++) {
        //    ItemVenda item = itens.get(i);
        //    total += item.getValor();
        //}

        // e com foreach assim (sempre)
        for (ItemVenda item: itens) {
            total = total + item.getValor();
        }

        return total;
    }


    public String getNotaFiscal() {
   
        StringBuilder rel = new StringBuilder("\nCupom de Venda \t\t NF: "+ nroVenda);
        rel.append("\nComprador: ");
        rel.append(cliente.toString());
        rel.append("\n- - - - - - - - - - - - - - - - - - - - - -\n");

        for (ItemVenda item: itens ) {
            rel.append(item.toString());
            rel.append("\n");
        }

        rel.append("\n");
        rel.append("Total: " + this.valorTotal());
        rel.append("\n------------------------------------------\n");

        return rel.toString();
    }
}
