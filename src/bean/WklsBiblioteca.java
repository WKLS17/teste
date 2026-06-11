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
public class WklsBiblioteca {
    private int wkls_id_biblioteca;
    private Date wkls_data;
    private String wkls_nome;
    private String wkls_categoria;
    private int wkls_quantidade;
    private String wkls_status;
    private String wkls_localizacao;

    public int getWkls_id_biblioteca() {
        return wkls_id_biblioteca;
    }

    public void setWkls_id_biblioteca(int wkls_id_biblioteca) {
        this.wkls_id_biblioteca = wkls_id_biblioteca;
    }

    public Date getWkls_data() {
        return wkls_data;
    }

    public void setWkls_data(Date wkls_data) {
        this.wkls_data = wkls_data;
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

    public int getWkls_quantidade() {
        return wkls_quantidade;
    }

    public void setWkls_quantidade(int wkls_quantidade) {
        this.wkls_quantidade = wkls_quantidade;
    }

    public String getWkls_status() {
        return wkls_status;
    }

    public void setWkls_status(String wkls_status) {
        this.wkls_status = wkls_status;
    }

    public String getWkls_localizacao() {
        return wkls_localizacao;
    }

    public void setWkls_localizacao(String wkls_localizacao) {
        this.wkls_localizacao = wkls_localizacao;
    }
}
