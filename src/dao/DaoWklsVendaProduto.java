/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsVendaProduto;
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
public class DaoWklsVendaProduto extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsVendaProduto wklsVendaProduto = (WklsVendaProduto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into Wkls_VendaProduto values(?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsVendaProduto.getWkls_id_VendaProduto());
              pst.setInt(2, wklsVendaProduto.getWkls_produto_venda());
              pst.setInt(3, wklsVendaProduto.getWkls_id_Venda());
              pst.setInt(4, wklsVendaProduto.getWkls_Quantidade);
              pst.setDouble(5, wklsVendaProduto.getWkls_preco());
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsVendaProduto wklsVendaProduto = (WklsVendaProduto) object;
    }

    public void delete(Object object) {
        WklsVendaProduto wklsVendaProduto = (WklsVendaProduto) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
