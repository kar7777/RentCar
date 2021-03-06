/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.RentCar;

/**
 *
 * @author María Fernanda Murillo Alfaro
 * @author Karla Vanessa Ballestero Castro
 * @date 17/11/2017
 * 
 */
public class Car {
    private int num_car;
    private String id_car;
    private String brand_car;
    private String model_car;
    private String style_car;
    private String transmission_car;
    private String year_car;
    private int price_car;
    private String photo_car;
    private String available_car;

    public Car() {
    }

    public Car(int id, String id_car, String brand_car, String model_car, String style_car, String transmission_car,
            String year_car, int price_car, String photo_car, String available_car) {
        this.num_car = num_car;
        this.id_car = id_car;
        this.brand_car = brand_car;
        this.model_car = model_car;
        this.style_car = style_car;
        this.transmission_car = transmission_car;
        this.year_car = year_car;
        this.price_car = price_car;
        this.photo_car = photo_car;
        this.available_car = available_car;
    }

    public int getNum_car() {
        return num_car;
    }

    public void setNum_car(int id) {
        this.num_car = num_car;
    }

    public String getId_car() {
        return id_car;
    }

    public void setId_car(String id_car) {
        this.id_car = id_car;
    }

    public String getBrand_car() {
        return brand_car;
    }

    public void setBrand_car(String brand_car) {
        this.brand_car = brand_car;
    }

    public String getModel_car() {
        return model_car;
    }

    public void setModel_car(String model_car) {
        this.model_car = model_car;
    }

    public String getStyle_car() {
        return style_car;
    }

    public void setStyle_car(String style_car) {
        this.style_car = style_car;
    }

    public String getTransmission_car() {
        return transmission_car;
    }

    public void setTransmission_car(String transmission_car) {
        this.transmission_car = transmission_car;
    }

    public String getYear_car() {
        return year_car;
    }

    public void setYear_car(String year_car) {
        this.year_car = year_car;
    }

    public int getPrice_car() {
        return price_car;
    }

    public void setPrice_car(int price_car) {
        this.price_car = price_car;
    }

    public String getPhoto_car() {
        return photo_car;
    }

    public void setPhoto_car(String photo_car) {
        this.photo_car = photo_car;
    }

    public String getAvailable_car() {
        return available_car;
    }

    public void setAvailable_car(String available_car) {
        this.available_car = available_car;
    }
    
}
