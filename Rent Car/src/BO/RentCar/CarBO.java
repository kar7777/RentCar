/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.RentCar;

import DAO.RentCar.CarDAO;
import Logic.RentCar.Car;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 17/11/2017
 * 
 */
public class CarBO {
    /**
     *
     * @param c Car to be added
     * @return true is added false can not be added
     * @throws Exception returns the error that needs to be repaired
     */
    public boolean register(Car c) throws Exception {
        if (c.getId_car().isEmpty()) {
            throw new Exception("Required Id car");
        }
        if (c.getBrand_car().isEmpty()) {
            throw new Exception("Required brand");
        }
        if (c.getModel_car().isEmpty()) {
            throw new Exception("Model required");
        }
        if (c.getStyle_car().isEmpty()) {
            throw new Exception("Style required");
        } 
        if (c.getTransmission_car().isEmpty()) {
            throw new Exception("transmission required");
        }        
        if (c.getYear_car()<= 0) {
            throw new Exception("Year required");
        }
        if (c.getPrice_car()<= 0) {
            throw new Exception("Price required");
        }
        if (c.getPhoto_car().isEmpty()) {
            throw new Exception("A photo is needed to carry out the registration");
        }
        if (c.getAvailable_car().isEmpty()) {
            throw new Exception("Available required");
        }        


        CarDAO cardao = new CarDAO();
        if (c.getNum_car() > 0) {
            return cardao.modify(c);
        } else {
            return cardao.insert(c);
        }
    }

//    Check if the user exists
    public boolean userLogin(Car car) {
        CarDAO cardao = new CarDAO();
        return cardao.isCarExist(car);
    }

    /**
     * delete to car
     *
     * @param car car
     * @throws Exception
     */
    public void remove(Car car) throws Exception {
        if (car.getNum_car()<= 0) {
            throw new Exception("Please select the car to remove: ");
        }
        CarDAO cardao = new CarDAO();
        cardao.delete(car);
    }
       
}
