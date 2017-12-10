/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
  * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 03/12/2017
 * 
 */
public class ModelDAO {

    //        insert  the new Model
    public boolean insert(Model m) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into model (id_model, name_model) values (?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, m.getModel_id());
            smt.setString(2, m.getModel_name());
   

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      To see if the model exists
    public boolean isModelExist(Model m) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from model where id_model = ? and name_model = ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, m.getModel_id());
            smt.setString(2, m.getModel_name());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select num from model where id_model = ? and name_model = ?";
            smt = con.prepareStatement(sql);
            smt.setString(1, m.getModel_id());
            smt.setString(2, m.getModel_name());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

//         Load the model
//         @return all models
    public LinkedList<Model> charge() {
        LinkedList<Model> models = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from model order by num";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Model m = new Model() {

                };
                m.setNum(rs.getInt("num"));
                m.setModel_id(rs.getString("id_model"));
                m.setModel_name(rs.getString("name_model"));


            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return models;
    }

//     Modify the Model
//     @param mod Model to modify
//     @return
//     @throws Exception
    public boolean modify(Model mod) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update model set id_model =?, name_model =? where num = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, mod.getModel_id());
            smt.setString(2, mod.getModel_name());
            smt.setInt(3, (mod.getNum()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected Model
//      @param mod Model
//      @throws Exception
    public void delete(Model mod) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from model where num=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, mod.getNum());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }    
}
