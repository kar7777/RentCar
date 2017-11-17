/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.CustomerDAO;
import Logic.RentCar.Customer;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 17/11/2017
 * 
 */
public class CustomerBO {
    /**
     *
     * @param c Customer to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    public boolean register(Customer c) throws Exception {
        if (c.getId_customer()<= 0) {
            throw new Exception("Required ID");
        }
        if (c.getName().isEmpty()) {
            throw new Exception("Required Name");
        }
        if (c.getLastname().isEmpty()) {
            throw new Exception("Last name required");
        }
        if (c.getTelephone() <= 0) {
            throw new Exception("Telephone required");
        }
        if (c.getDirection().isEmpty()) {
            throw new Exception("Direction required");
        }
        if (c.getPhoto().isEmpty()) {
            throw new Exception("Photo required");
        }        
        if (c.getPassword().isEmpty()) {
            throw new Exception("Password required");
        }


        CustomerDAO cdao = new CustomerDAO();
        if (c.getId() > 0) {
            return cdao.modify(c);
        } else {
            return cdao.insert(c);
        }
    }

//    Check if the user exists
    public boolean userLogin(Customer cus) {
        CustomerDAO cdao = new CustomerDAO();
        return cdao.isUserExist(cus);
    }

    /**
     * delete to customer
     *
     * @param cus customer
     * @throws Exception
     */
    public void remove(Customer cus) throws Exception {
        if (cus.getId() <= 0) {
            throw new Exception("Please select the customer to remove: ");
        }
        CustomerDAO cdao = new CustomerDAO();
        cdao.delete(cus);
    }
   
}
