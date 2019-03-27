package br.senai.sc.domain;

import javax.persistence.Entity;

import br.senai.sc.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeparcelas;

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeparcelas) {
		super(id, estado, pedido);
		this.numeroDeparcelas = numeroDeparcelas;
	}

	public PagamentoComCartao() {
	}

	public Integer getNumeroDeparcelas() {
		return numeroDeparcelas;
	}

	public void setNumeroDeparcelas(Integer numeroDeparcelas) {
		this.numeroDeparcelas = numeroDeparcelas;
	}
	
	
	
	
}

