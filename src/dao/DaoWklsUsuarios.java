/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WklsUsuarios;
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
public class DaoWklsUsuarios extends DaoWklsAbstract{

    public void insert(Object object) {
        WklsUsuarios wklsUsuarios = (WklsUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_wander_saraiva";
            user = "wander_saraiva";
            password = "wander_saraiva";

            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);

              String sql = "Insert into wkls_usuarios values(?,?,?,?,?,?,?,?) ";
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1,wklsUsuarios.getWkls_id_Usuarios());
              pst.setString(2, "wklsUsuarios.getWkls_Nome()");
              pst.setString(3, "wklsUsuarios.getWkls_Apelido()");
              pst.setString(4, "wklsUsuarios.getWkls_Cpf()");
              pst.setDate(5, null);//Wkls_dataNascimento
              pst.setInt(6, wklsUsuarios.getWkls_nivel());
              pst.setString(7, "wklsUsuarios.getWkls_Senha()");
              pst.setString(8, "wklsUsuarios.getWkls_Ativo()");
              pst.executeUpdate();
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoWklsUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoWklsUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Object object) {
        WklsUsuarios wklsUsuarios = (WklsUsuarios) object;
    }

    public void delete(Object object) {
        WklsUsuarios wklsUsuarios = (WklsUsuarios) object;
    }

    public Object list(int id) {
        return null;
    }

    public Object listAll() {
        return null;
    }
    
}
