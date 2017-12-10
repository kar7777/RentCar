/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Office;
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
public class OfficeDAO {

    //        insert  the new Office
    public boolean insert(Office o) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into office (id_office, name_office) values (?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, o.getOffice_id());
            smt.setString(2, o.getOffice_name());
   

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      To see if the office exists
    public boolean isOfficeExist(Office o) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from office where id_office = ? and name_office = ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, o.getOffice_id());
            smt.setString(2, o.getOffice_name());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select num from office where id_office = ? and name_office = ?";
            smt = con.prepareStatement(sql);
            smt.setString(1, o.getOffice_id());
            smt.setString(2, o.getOffice_name());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

//         Load the office
//         @return all offices
    public LinkedList<Office> charge() {
        LinkedList<Office> offices = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from office order by num";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Office o = new Office() {

                };
                o.setNum(rs.getInt("num"));
                o.setOffice_id(rs.getString("id_office"));
                o.setOffice_name(rs.getString("name_office"));


            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return offices;
    }

//     Modify the Office
//     @param off Office to modify
//     @return
//     @throws Exception
    public boolean modify(Office off) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update office set id_office =?, name_office =? where num = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, off.getOffice_id());
            smt.setString(2, off.getOffice_name());
            smt.setInt(3, (off.getNum()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected Office
//      @param off Office
//      @throws Exception
    public void delete(Office off) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from office where num=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, off.getNum());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
}
