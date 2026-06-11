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
public class WklsCompra {
    private int wkls_id_compra;
    private int wkls_id_fornecedor;
    private Date wkls_data_compra;
    private int wkls_quantidade;
    private Double wkls_preco;
    private int wkls_id_usuario;
    
    public int getWkls_id_compra() {
        return wkls_id_compra;
    }

    public void setWkls_id_compra(int wkls_id_compra) {
        this.wkls_id_compra = wkls_id_compra;
    }

    public int getWkls_id_fornecedor() {
        return wkls_id_fornecedor;
    }

    public void setWkls_id_fornecedor(int wkls_id_fornecedor) {
        this.wkls_id_fornecedor = wkls_id_fornecedor;
    }

    public Date getWkls_data_compra() {
        return wkls_data_compra;
    }

    public void setWkls_data_compra(Date wkls_data_compra) {
        this.wkls_data_compra = wkls_data_compra;
    }

    public int getWkls_quantidade() {
        return wkls_quantidade;
    }

    public void setWkls_quantidade(int wkls_quantidade) {
        this.wkls_quantidade = wkls_quantidade;
    }

    public Double getWkls_preco() {
        return wkls_preco;
    }

    public void setWkls_preco(Double wkls_preco) {
        this.wkls_preco = wkls_preco;
    }

    public int getWkls_id_usuario() {
        return wkls_id_usuario;
    }

    public void setWkls_id_usuario(int wkls_id_usuario) {
        this.wkls_id_usuario = wkls_id_usuario;
    }
    
}
