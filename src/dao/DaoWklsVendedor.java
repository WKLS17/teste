/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsVendedor;
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
public class DaoWklsVendedor extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsVendedor wklsVendedor = (WklsVendedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into wkls_vendedor values(?,?,?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsVendedor.getWkls_id_Vendedor());
              pst.setString(2, "wklsVendedor.getWkls_Nome()");
              pst.setString(3, "wklsVendedor.getWkls_Cpf()");
              pst.setString(4, "wklsVendedor.getWkls_Telefone()");
              pst.setString(5, "wklsVendedor.getWkls_email()");
              pst.setDate(6, null);//Wkls_data_contratado
              pst.setString(7, "wklsVendedor.getWkls_Status()");
              pst.setString(8, "wklsVendedor.getWkls_Sexo()");
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsVendedor wklsVendedor = (WklsVendedor) object;
    }

    public void delete(Object object) {
        WklsVendedor wklsVendedor = (WklsVendedor) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
