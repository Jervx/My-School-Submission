public abstract class Appliance {
    protected boolean power;
    protected String brand; // manufacturer
    protected String model; // model of the appliance
	
    public Appliance() {
        power = false;
        brand = "Samsung";
        model = "SM-01";
        System.out.println("Appliance default constructor");
        System.out.println(toString());
    }
    
	public Appliance(String brand, String model) {
        power = false;
        this.brand = brand;
        this.model = model;
        System.out.println("Appliance overloaded constructor");
        System.out.println(toString());
	}
    
    public void power() {
        if(power)
            power = false; else
        power = true;
        System.out.println("Appliance power");
        System.out.println(toString());
    }
    
  	public abstract void work();
    
    public boolean getPower() {
        return power;
    }
    
  	public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
	public String toString() {
        System.out.println("Appliance toString()");
        return new String("Appliance Brand: " + brand + ", Model: " + model + " Power: " + power); 
    }
}