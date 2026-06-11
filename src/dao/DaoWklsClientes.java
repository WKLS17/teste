/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsClientes;
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
public class DaoWklsClientes extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsClientes wklsClientes = (WklsClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into wkls_clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsClientes.getWkls_id_Clientes());
              pst.setString(2, "wklsClientes.getWkls_Nome()");
              pst.setString(3, "wklsClientes.getWkls_Telefone()");
              pst.setString(4, "wklsClientes.getWkls_Rg()");
              pst.setString(5, "wklsClientes.getWkls_Cpf()");
              pst.setDate(6, null);//Wkls_dataNascimento
              pst.setString(7, "wklsClientes.getWkls_Sexo()");
              pst.setString(8, "wklsClientes.getWkls_Idade()");
              pst.setString(9, "wklsClientes.getWkls_Cep()");
              pst.setString(10, "wklsClientes.getWkls_Email()");
              pst.setString(11, "wklsClientes.getWkls_Bairro()");
              pst.setString(12, "wklsClientes.getWkls_Rua()");
              pst.setString(13, "wklsClientes.getWkls_Numero()");
              pst.setString(14, "wklsClientes.getWkls_Cidade()");
              pst.setString(15, "wklsClientes.getWkls_Estado()");
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsClientes wklsClientes = (WklsClientes) object;
    }

    public void delete(Object object) {
        WklsClientes wklsClientes = (WklsClientes) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
