public class Main {

    public static void main(String[] args) {

        // teste de criação de clientes
        Cliente c1 = new Cliente(123, "Sr. Smith");
        Cliente c2 = new Cliente(321, "John Doe");
        System.out.println();
        System.out.println(c1.toString() );
        System.out.println("c2: " + c2.getCodigo() + " "+ c2.getNome() );
        System.out.println();

        CadastroClientes cadCli = CadastroClientes.getInstance();
     //  CadastroClientes cadCli = new CadastroClientes();

        cadCli.inserir(c1);
        cadCli.inserir(c2);
        cadCli.inserir(127, "Tio Patinhas");

        System.out.println(cadCli);



        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        // teste de criação de clientes
        Produto p1 = new Produto(1, "caneta azul", 2);
        Produto p2 = new Produto(2, "borracha", 1.5);
        Produto p3 = new Produto(3, "lápis", 1);
        Produto p4 = new Produto(4, "Chocolate", 10);
        
        System.out.println( p1.toString() );
        System.out.println( p4 );

        cadProd.inserir(1, "caneta azul", 2);
        cadProd.inserir(2, "borracha", 1.5);
        cadProd.inserir(3, "lápis", 1);
        cadProd.inserir(4, "Chocolate", 10);

        System.out.println("\n\n Herança... \n\n");

        ProdAlcoolico.setTaxaAlcoolica(200);
    
        ProdAlcoolico pa1 = new ProdAlcoolico(300, "Vodka", 50);
        System.out.println("pa1.getCodigo() = " + pa1.getCodigo());
        System.out.println("pa1.preco() = " + pa1.getPreco());
        System.out.println("pa1.toString() = " + pa1.toString());

        cadProd.inserir(pa1);
        System.out.println(cadProd.toString());

         // teste de criação de clientes não faz sentido criar itens venda sem vendas...
       // ItemVenda i1 = new ItemVenda(3, p4);
       // ItemVenda i2 = new ItemVenda(5, p1);

       // System.out.println();
       // System.out.println(i1);pa1
       // System.out.println(i2);


        // testar a classe venda...
        Cliente cli1 = cadCli.pesquisar(923);
        if (cli1 == null)
           System.out.println("cliente nao existe...");

       System.out.println("\nPrimeira  venda será de numero: " + Venda.getProximaVenda());

        Venda v1 = new Venda( cadCli.pesquisar(123) );
       
        v1.inserir(p1);
        v1.inserir(10, p2);

        v1.inserir( cadProd.pesquisar(1) );
        v1.inserir(10, cadProd.pesquisar(4) );

        System.out.println( v1.getNotaFiscal() );


        Venda v2 = new Venda( cadCli.pesquisar(321) );

        v2.inserir( cadProd.pesquisar(2) );
        v2.inserir(5, cadProd.pesquisar(3) );

        System.out.println( v2.getNotaFiscal() );

        Venda v3 = new Venda( cadCli.pesquisar(127) );

        v3.inserir( cadProd.pesquisar(4));
        v3.inserir(cadProd.pesquisar(300));



        System.out.println( v3.getNotaFiscal() );

        System.out.println("\nPróxima venda será de numero: " + Venda.getProximaVenda());

        /* 
//       System.out.println("\n\nPróxima venda será a de número: " + Venda.getProximaVenda());
 
        System.out.println("\n\n");

        Venda v1 = new Venda(c1);

        v1.inserir(p4);
       // System.out.println( "valor (parcial) da venda v1: " +v1.valorTotal());
        v1.inserir(7, p1);
       // System.out.println( "valor (parcial) da venda v1: " +v1.valorTotal());


        System.out.println("\n\n");
        System.out.println(v1.getNotaFiscal());

    System.out.println("\n\n Herança... \n\n");

    ProdAlcoolico.setTaxaAlcoolica(200);

    ProdAlcoolico pa1 = new ProdAlcoolico(300, "Vodka", 50);
    System.out.println("pa1.getCodigo() = " + pa1.getCodigo());
    System.out.println("pa1.preco() = " + pa1.getPreco());
    System.out.println("pa1.toString() = " + pa1.toString());
      */
    }
   
}
