/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsVenda;
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
public class DaoWklsVenda extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsVenda wklsVenda = (WklsVenda) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into Wkls_Venda values(?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsVenda.getWkls_id_venda());
              pst.setInt(2, wklsVenda.getWkls_id_usuarios());
              pst.setInt(3, wklsVenda.getWkls_id_clientes());
              pst.setString(4, "wklsVenda.getWkls_Produto()");
              pst.setDate(5,null );//wklsVenda.getWkls_Data_Venda();
              pst.setDouble(6, wklsVenda.getWkls_ValorTotal());
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsVenda wklsVenda = (WklsVenda) object;
    }

    public void delete(Object object) {
        WklsVenda wklsVenda = (WklsVenda) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
