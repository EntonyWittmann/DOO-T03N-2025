package classes;

import java.util.Date;

public class Pedido {
	
	int id;
	Date dataCriacao;
	Date dataPagamento;
    Date dataVencimentoReserva;
	String cliente;
	String vendedor;
	String loja;
    Item[] itens;
	
	
    public Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva,
            String cliente, String vendedor, String loja, Item[] itens) {
    	
    
     this.id = id;
     this.dataCriacao = dataCriacao;
     this.dataPagamento = dataPagamento;
     this.dataVencimentoReserva = dataVencimentoReserva;
     this.cliente = cliente;
     this.vendedor = vendedor;
     this.loja = loja;
     this.itens = itens;
	
    }
    
    
    public double calcularValorTotal() {
    	
        double total = 0;
        
        for (Item item : itens) {
            total += item.valor;
        }
        
        return total;
    }

    
    public void gerarDescricaoVenda() {
    	
        System.out.println("Pedido criado em: " + dataCriacao);
        System.out.println("Valor total: R$" + calcularValorTotal());
    }
    

}
