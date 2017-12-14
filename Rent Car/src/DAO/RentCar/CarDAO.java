/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Car;
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
public class CarDAO {
    //        insert  the new Car
    public boolean insert(Car c) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into car (id_car, brand_car, model_car, style_car, transmission_car"
                    + ", year_car, price_car, photo_car, available_car) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_car());
            smt.setString(2, c.getBrand_car());
            smt.setString(3, c.getModel_car());
            smt.setString(4, c.getStyle_car());
            smt.setString(5, c.getTransmission_car());
            smt.setString(6, (c.getYear_car()));
            smt.setInt(7, c.getPrice_car());
            smt.setString(8, c.getPhoto_car());
            smt.setString(9, c.getAvailable_car());

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      To see if the car exists
    public boolean isCarExist(Car c) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from car where id_car = ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_car());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select num_car from car where id_car = ? ";
            smt = con.prepareStatement(sql);
            smt.setString(1, c.getId_car());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

//         Load the car
    
//         @return all car
    public LinkedList<Car> charge() {
        LinkedList<Car> carList = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from car order by num_car";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Car c = new Car() {
               
                };
                c.setNum_car(rs.getInt("num_car"));
                c.setId_car(rs.getString("id_car"));
                c.setBrand_car(rs.getString("brand_car"));
                c.setModel_car(rs.getString("model_car"));
                c.setStyle_car(rs.getString("style_car"));
                c.setTransmission_car(rs.getString("transmission_car"));
                c.setYear_car(rs.getString("year_car"));
                c.setPrice_car(rs.getInt("price_car"));
                c.setPhoto_car(rs.getString("photo_car"));
                c.setAvailable_car(rs.getString("available_car"));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return carList;
    }

//     Modify the car
//     @param car car to modify
//     @return
//     @throws Exception
    public boolean modify(Car car) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update car set id_car =?, brand_car =?, model_car =?, style_car =?, "
                    + " transmission_car =?, year_car =?, price_car =?,"
                    + " photo_car =?, available_car where num_car = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, car.getId_car());
            smt.setString(2, car.getBrand_car());
            smt.setString(3, car.getModel_car());
            smt.setString(4, car.getStyle_car());
            smt.setString(5, car.getTransmission_car());
            smt.setString(6, car.getYear_car());
            smt.setInt(7, car.getPrice_car());
            smt.setString(8, car.getPhoto_car());
            smt.setString(9, car.getAvailable_car());
            smt.setInt(10, (car.getNum_car()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected car
//      @param car car
//      @throws Exception
    public void delete(Car car) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from car where num_car=?";
            PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, car.getNum_car());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }    
}
