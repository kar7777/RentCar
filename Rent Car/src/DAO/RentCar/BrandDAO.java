/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Brand;
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
public class BrandDAO {
    
    //        insert  the new brand
    public boolean insert(Brand b) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into brand (brand_id, brand_name) values (?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, b.getBrand_id());
            smt.setString(2, b.getBrand_name());


            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

////      To see if the user exists
//    public boolean isUserExist(Customer c) {
//        int count = 0;
//        boolean isExist = false;
//        try (Connection con = ConnectionDB.connection()) {
//            String sql = "select count(*) from brand where id_customer = ? and password_customer = ?";
//            PreparedStatement smt = con.prepareStatement(sql);
//            smt.setInt(1, c.getId_customer());
//            smt.setString(2, c.getPassword());
//            ResultSet rs = smt.executeQuery();
//
//            while (rs.next()) {
//                count = rs.getInt(1);
//                if (count == 1) {
//                    isExist = true;
//                }
//            }
//
//            sql = "select id_nm from brand where brand_id = ? and password_customer = ?";
//            smt = con.prepareStatement(sql);
//            smt.setInt(1, c.getId_customer());
//            smt.setString(2, c.getPassword());
//            rs = smt.executeQuery();
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return isExist;
//    }

    
    
//         Load the customer
//         @return all customer
    public LinkedList<Brand> charge() {
        LinkedList<Brand> brandList = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from brand order by num";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Brand b = new Brand() {

                };
                b.setNum(rs.getInt("num"));
                b.setBrand_id(rs.getString("brand_id"));
                b.setBrand_name(rs.getString("brand_name"));


            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return brandList;
    }

//     Modify the Brand
//     @param brand Brand to modify
//     @return
//     @throws Exception
    public boolean modify(Brand brand) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update brand set brand_id =?, brand_name =? where num = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, brand.getBrand_id());
            smt.setString(2, brand.getBrand_name());
            smt.setInt(3, (brand.getNum()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected brand
//      @param brand Brand
//      @throws Exception
    public void delete(Brand brand) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from brand where num=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, brand.getNum());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }

}
