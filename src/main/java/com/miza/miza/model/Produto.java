package com.miza.miza.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private double preco;

    @Column(name = "novo")
    private boolean novo;

    @Column(name = "data_fabricacao")
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
