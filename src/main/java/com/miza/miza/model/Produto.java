package com.miza.miza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "produto", sequenceName = "SQ_PRODUTO", allocationSize = 1)
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	private int codigo;
	private String nome;
	private double preco;
	private boolean novo;
	private LocalDate dataFabricacao;

	// Getter for codigo
    public int getCodigo() {
        return codigo;
    }

    // Setter for codigo
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Getter for nome
    public String getNome() {
        return nome;
    }

    // Setter for nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter for preco
    public double getPreco() {
        return preco;
    }

    // Setter for preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter for novo
    public boolean isNovo() {
        return novo;
    }

    // Setter for novo
    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    // Getter for dataFabricacao
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    // Setter for dataFabricacao
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
