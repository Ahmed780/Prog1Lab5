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
  
