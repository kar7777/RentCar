/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.StyleDAO;
import Logic.RentCar.Style;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 03/12/2017
 * 
 */
public class StyleBO {

    /**
     *
     * @param sty Style to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    
    public boolean register(Style sty) throws Exception {
        if (sty.getStyle_id().isEmpty()) {
            throw new Exception("Required ID");
        }
        if (sty.getStyle_name().isEmpty()) {
            throw new Exception("Required Name");
        }

        StyleDAO stydao = new StyleDAO();
        if (sty.getNum() > 0) {
            return stydao.modify(sty);
        } else {
            return stydao.insert(sty);
        }
    }

//    Check if the stylr exists
    public boolean styleExist(Style sty) {
        StyleDAO stydao = new StyleDAO();
        return stydao.isStyleExist(sty);
    }

    /**
     * delete to style
     * @param sty style
     * @throws Exception
     */
    
    public void remove(Style sty) throws Exception {
        if (sty.getNum() <= 0) {
            throw new Exception("Please select the style to remove: ");
        }
        StyleDAO stydao = new StyleDAO();
        stydao.delete(sty);
    }    
}
