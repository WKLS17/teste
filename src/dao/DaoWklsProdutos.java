/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u70791707105
 */
public class DaoWklsProdutos extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsProdutos wklsProdutos = (WklsProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into wkls_produtos values(?,?,?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsProdutos.getWkls_id_produto());
              pst.setString(2, "WklsProdutos.getWkls_Nome()");
              pst.setString(3, "WklsProdutos.getWkls_Categoria()");
              pst.setDouble(4, wklsProdutos.getWkls_preco());
              pst.setString(5, "Wkls_descricao()");
              pst.setString(6, "Wkls_plataforma()");
              pst.setDate(7, null);
              pst.setString(8, "wklsProdutos.getWkl_classificacao()");
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsProdutos wklsProdutos = (WklsProdutos) object;
    }

    public void delete(Object object) {
        WklsProdutos wklsProdutos = (WklsProdutos) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
