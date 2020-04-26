/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
 * This  class encapsulates concepts of a tv including brand and price.
 assuming a team has only team name as an attribute. Include a constructor,
 * the accessor and mutator, and methods toString and equals. Write a client
 * class to test all methods.
 * @author Uzair Ahmed 
 */
public class Television {
  
  private String brand;
  private double price;
  
  public Television() {
    setBrand(brand);
    setPrice(price);
  }
    
  public void setBrand(String Brand) {
    this.brand = Brand;
  }
  public void setPrice(double Price) {
    this.price = Price;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public double getPrice() {
    return price;
  }
  
  public String toString(){
        return("\nThe brand name is " + this.brand);
    }
    
  public boolean equals(Television other){
        return brand.equals(other.brand);
    }
}
  
