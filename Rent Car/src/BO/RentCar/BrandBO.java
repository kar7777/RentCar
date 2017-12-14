/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.BrandDAO;
import Logic.RentCar.Brand;
import java.util.LinkedList;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 03/12/2017
 * 
 */
public class BrandBO {

    /**
     *
     * @param brd Brand to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    
    public boolean register(Brand brd) throws Exception {
        if (brd.getBrand_id().isEmpty()) {
            throw new Exception("Required ID");
        }
        if (brd.getBrand_name().isEmpty()) {
            throw new Exception("Required Name");
        }

        BrandDAO brddao = new BrandDAO();
        if (brd.getNum() > 0) {
            return brddao.modify(brd);
        } else {
            return brddao.insert(brd);
        }
    }

//    Check if the office exists
    public boolean brandExist(Brand brd) {
        BrandDAO brddao = new BrandDAO();
        return brddao.isBrandExist(brd);
    }
    
    
    
    public LinkedList<Brand> brandList() {
        BrandDAO branddao = new BrandDAO();
        return branddao.charge();
    }
    
//    public LinkedList<Brand> find() {
//        BrandDAO musdao = new BrandDAO();
//
//            Brand m = musdao.chargeByAuthor();
//            LinkedList<Brand> result = new LinkedList<>();
//            if (m != null) {
//                result.add(m);
//            }
//            return result;
//        
//    }

    /**
     * delete to brand
     * @param brd brand
     * @throws Exception
     */
    
    public void remove(Brand brd) throws Exception {
        if (brd.getNum() <= 0) {
            throw new Exception("Please select the brand to remove: ");
        }
        BrandDAO brddao = new BrandDAO();
        brddao.delete(brd);
    }    
    
}
