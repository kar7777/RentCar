/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.ModelDAO;
import Logic.RentCar.Model;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 03/12/2017
 * 
 */
public class ModelBO {

    /**
     *
     * @param mod Model to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    
    public boolean register(Model mod) throws Exception {
        if (mod.getModel_id().isEmpty()) {
            throw new Exception("Required ID");
        }
        if (mod.getModel_name().isEmpty()) {
            throw new Exception("Required Name");
        }

        ModelDAO moddao = new ModelDAO();
        if (mod.getNum() > 0) {
            return moddao.modify(mod);
        } else {
            return moddao.insert(mod);
        }
    }

//    Check if the model exists
    public boolean ModelExist(Model mod) {
        ModelDAO moddao = new ModelDAO();
        return moddao.isModelExist(mod);
    }

    /**
     * delete to Model
     * @param mod Model
     * @throws Exception
     */
    
    public void remove(Model mod) throws Exception {
        if (mod.getNum() <= 0) {
            throw new Exception("Please select the model to remove: ");
        }
        ModelDAO moddao = new ModelDAO();
        moddao.delete(mod);
    }    
}
