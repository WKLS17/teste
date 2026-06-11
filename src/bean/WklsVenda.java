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
public class WklsVenda {
    private int wkls_id_venda;
    private int wkls_id_usuarios;
    private int wkls_id_clientes;
    private String wkls_produto;
    private Date wkls_data_venda;
    private Double wkls_valortotal;

    public int getWkls_id_venda() {
        return wkls_id_venda;
    }

    public void setWkls_id_venda(int wkls_id_venda) {
        this.wkls_id_venda = wkls_id_venda;
    }

    public int getWkls_id_usuarios() {
        return wkls_id_usuarios;
    }

    public void setWkls_id_usuarios(int wkls_id_usuarios) {
        this.wkls_id_usuarios = wkls_id_usuarios;
    }

    public int getWkls_id_clientes() {
        return wkls_id_clientes;
    }

    public void setWkls_id_clientes(int wkls_id_clientes) {
        this.wkls_id_clientes = wkls_id_clientes;
    }

    public String getWkls_produto() {
        return wkls_produto;
    }

    public void setWkls_produto(String wkls_produto) {
        this.wkls_produto = wkls_produto;
    }

    public Date getWkls_data_venda() {
        return wkls_data_venda;
    }

    public void setWkls_data_venda(Date wkls_data_venda) {
        this.wkls_data_venda = wkls_data_venda;
    }

    public Double getWkls_valortotal() {
        return wkls_valortotal;
    }

    public void setWkls_valortotal(Double wkls_valortotal) {
        this.wkls_valortotal = wkls_valortotal;
    }

    public double getWkls_ValorTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
