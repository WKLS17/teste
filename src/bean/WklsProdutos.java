/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u70791707105
 */
public class WklsProdutos {
    private int wkls_id_produto;
    private String wkls_nome;
    private String wkls_categoria;
    private Double wkls_preco;
    private String wkls_descricao;
    private String wkls_plataforma;
    private Date wkls_data_lancamento;
    private String wkls_classificacao;

    public int getWkls_id_produto() {
        return wkls_id_produto;
    }

    public void setWkls_id_produto(int wkls_id_produto) {
        this.wkls_id_produto = wkls_id_produto;
    }

    public String getWkls_nome() {
        return wkls_nome;
    }

    public void setWkls_nome(String wkls_nome) {
        this.wkls_nome = wkls_nome;
    }

    public String getWkls_categoria() {
        return wkls_categoria;
    }

    public void setWkls_categoria(String wkls_categoria) {
        this.wkls_categoria = wkls_categoria;
    }

    public Double getWkls_preco() {
        return wkls_preco;
    }

    public void setWkls_preco(Double wkls_preco) {
        this.wkls_preco = wkls_preco;
    }

    public String getWkls_descricao() {
        return wkls_descricao;
    }

    public void setWkls_descricao(String wkls_descricao) {
        this.wkls_descricao = wkls_descricao;
    }

    public String getWkls_plataforma() {
        return wkls_plataforma;
    }

    public void setWkls_plataforma(String wkls_plataforma) {
        this.wkls_plataforma = wkls_plataforma;
    }

    public Date getWkls_data_lancamento() {
        return wkls_data_lancamento;
    }

    public void setWkls_data_lancamento(Date wkls_data_lancamento) {
        this.wkls_data_lancamento = wkls_data_lancamento;
    }

    public String getWkls_classificacao() {
        return wkls_classificacao;
    }

    public void setWkls_classificacao(String wkls_classificacao) {
        this.wkls_classificacao = wkls_classificacao;
    }
}
