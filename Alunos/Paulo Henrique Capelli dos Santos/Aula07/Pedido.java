
import java.util.*;
;
public class Pedido {;
 private int id;
 private Date dataCriacao;
 private Date dataPagamento;
 private Date dataVencimentoReserva;
 private Cliente cliente;
 private Vendedor vendedor;
 private Loja loja;
 private List<Item> itens;
;
 public Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {;
 this.id = id;
 this.dataCriacao = dataCriacao;
 this.dataPagamento = dataPagamento;
 this.dataVencimentoReserva = dataVencimentoReserva;
 this.cliente = cliente;
 this.vendedor = vendedor;
 this.loja = loja;
 this.itens = itens;
 };
;
 public double calcularValorTotal() {;
 return itens.stream().mapToDouble(Item::getValor).sum();
 };
;
 public void gerarDescricaoVenda() {;
 System.out.println("Pedido criado em: " + dataCriacao + " | Total: R$" + calcularValorTotal());
 }
}
