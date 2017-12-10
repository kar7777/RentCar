/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RentCar;

import Logic.RentCar.Style;
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
public class StyleDAO {

    //        insert  the new Style
    public boolean insert(Style s) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into style (id_style, name_style) values (?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, s.getStyle_id());
            smt.setString(2, s.getStyle_name());
   

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      To see if the style exists
    public boolean isStyleExist(Style s) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from style where id_style = ? and name_style = ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, s.getStyle_id());
            smt.setString(2, s.getStyle_name());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select num from style where id_style = ? and name_style = ?";
            smt = con.prepareStatement(sql);
            smt.setString(1, s.getStyle_id());
            smt.setString(2, s.getStyle_name());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

//         Load the style
//         @return all styles
    public LinkedList<Style> charge() {
        LinkedList<Style> styles = new LinkedList<>();
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from style order by num";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
                Style s = new Style() {

                };
                s.setNum(rs.getInt("num"));
                s.setStyle_id(rs.getString("id_style"));
                s.setStyle_name(rs.getString("name_style"));


            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return styles;
    }

//     Modify the style
//     @param sty Style to modify
//     @return
//     @throws Exception
    public boolean modify(Style sty) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update style set id_style =?, name_style =? where num = ? ";
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setString(1, sty.getStyle_id());
            smt.setString(2, sty.getStyle_name());
            smt.setInt(3, (sty.getNum()));
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }

//      Delete selected Style
//      @param sty Style
//      @throws Exception
    public void delete(Style sty) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from style where num=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, sty.getNum());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }    
}
