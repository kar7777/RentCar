/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 17/11/2017
 *
 */
public class CustomerDAO {

    //        insert  the new Customer
    public boolean insert(Customer c) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into customer (id_customer, name_customer, lastname_customer, telephone_customer"
                    + ", direction_customer, photo_customer, password_customer) values (?,?,?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_customer());
            smt.setString(2, c.getName());
            smt.setString(3, c.getLastname());
            smt.setInt(4, c.getTelephone());
            smt.setString(5, (c.getDirection()));
            smt.setString(6, c.getPhoto());
            smt.setString(7, c.getPassword());

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      To see if the user exists
    public boolean isUserExist(Customer c) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from customer where id_customer = ? and password_customer = ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_customer());
            smt.setString(2, c.getPassword());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select id_nm from customer where id_customer = ? and password_customer = ?";
            smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_customer());
            smt.setString(2, c.getPassword());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

//         Load the customer
//         @return all customer
    public LinkedList<Customer> charge() {
        LinkedList<Customer> customer = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from customer order by id_nm";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Customer c = new Customer() {

                };
                c.setId(rs.getInt("id_nm"));
                c.setId_customer(rs.getString("id_customer"));
                c.setName(rs.getString("name_customer"));
                c.setLastname(rs.getString("lastname_customer"));
                c.setTelephone(rs.getInt("telephone_customer"));
                c.setDirection(rs.getString("direction_customer"));
                c.setPhoto(rs.getString("photo_customer"));
                c.setPassword(rs.getString("password_customer"));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return customer;
    }

//     Modify the customer
//     @param cus customer to modify
//     @return
//     @throws Exception
    public boolean modify(Customer cus) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update customer set id_customer =?, name_customer =?, lastname_customer =?, "
                    + " telephone_customer =?, direction_customer =?, photo_customer =?,"
                    + " password_customer =? where id_nm = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, cus.getId_customer());
            smt.setString(2, cus.getName());
            smt.setString(3, cus.getLastname());
            smt.setInt(4, cus.getTelephone());
            smt.setString(5, cus.getDirection());
            smt.setString(6, cus.getPhoto());
            smt.setString(7, cus.getPassword());
            smt.setInt(8, (cus.getId()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected customer
//      @param cus customer
//      @throws Exception
    public void delete(Customer cus) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from customer where id_nm=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, cus.getId());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }

}
