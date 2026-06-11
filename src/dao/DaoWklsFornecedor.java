/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsFornecedor;
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
public class DaoWklsFornecedor extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsFornecedor wklsFornecedor = (WklsFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into wkls_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsFornecedor.getWkls_id_Fornecedores());
              pst.setString(2, "wklsFornecedor.getWkls_Nome()");
              pst.setString(3, "wklsFornecedor.getWkls_Cnpj()");
              pst.setString(4, "wklsFornecedor.getWkls_Empresa()");
              pst.setString(5, "wklsFornecedor.getWkls_Categoria()");
              pst.setString(6, "wklsFornecedor.getWkls_Telefone()");
              pst.setString(7, "wklsFornecedor.getWkls_Email()");
              pst.setString(8, "wklsFornecedor.getWkls_Bairro()");
              pst.setString(9, "wklsFornecedor.getWkls_Rua()");
              pst.setString(10, "wklsFornecedor.getWkls_Numero()");
              pst.setString(11, "wklsFornecedor.getWkls_Cidade()");
              pst.setString(12, "wklsFornecedor.getWkls_Estado()");
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsFornecedor wklsFornecedor = (WklsFornecedor) object;
    }

    public void delete(Object object) {
        WklsFornecedor wklsFornecedor = (WklsFornecedor) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
