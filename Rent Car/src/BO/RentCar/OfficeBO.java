/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.OfficeDAO;
import Logic.RentCar.Office;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 03/12/2017
 * 
 */
public class OfficeBO {
 
    /**
     *
     * @param off Office to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    
    public boolean register(Office off) throws Exception {
        if (off.getOffice_id().isEmpty()) {
            throw new Exception("Required ID");
        }
        if (off.getOffice_name().isEmpty()) {
            throw new Exception("Required Name");
        }

        OfficeDAO offdao = new OfficeDAO();
        if (off.getNum() > 0) {
            return offdao.modify(off);
        } else {
            return offdao.insert(off);
        }
    }

//    Check if the office exists
    public boolean OfficeExist(Office off) {
        OfficeDAO offdao = new OfficeDAO();
        return offdao.isOfficeExist(off);
    }

    /**
     * delete to office
     * @param off office
     * @throws Exception
     */
    
    public void remove(Office off) throws Exception {
        if (off.getNum() <= 0) {
            throw new Exception("Please select the office to remove: ");
        }
        OfficeDAO offdao = new OfficeDAO();
        offdao.delete(off);
    }
    
}
