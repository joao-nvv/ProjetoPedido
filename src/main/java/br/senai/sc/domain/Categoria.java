package br.senai.sc.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity // fazer anotação na meu código para que o java entenda que deve salvar no banco
public class Categoria {

	// Atributos: id e nome
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para gerar automaticamente para mim
	private Integer id;
	private String nome;

	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public Categoria() {

	}

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
