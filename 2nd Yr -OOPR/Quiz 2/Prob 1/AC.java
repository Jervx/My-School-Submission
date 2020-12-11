public class AC{

    private String brand;
    private boolean type, power;
    private int thermostat;
    private double temperature;

    public AC(){
        thermostat = 1;
        temperature = 16.0;
        brand = "AC Brand";
        type = true;
        power = false;
        System.out.println("Default Constructor");
    }

    public AC(String brand,boolean type){
        thermostat = 1;
        temperature = 16.0;
        this.brand = brand;
        this.type = type;
        power = false;
        System.out.println("Overloaded Constructor");
    }

    void power(){
        power = !power;
    }

    void thermostatUp(){
        if(thermostat >= 10) return;
        thermostat ++;
    }

    void thermostatDown(){
        if(thermostat <= 1) return;
        thermostat --;
    }

    void temperatureUp(){
        if(temperature >= 30) return;
        temperature += 0.5;
    }

    void temperatureDown(){
        double curtemp = temperature - 1;
        if(curtemp <= 16){
            temperature = 16;
            return;
        }
        temperature--;
    }

    public String getBrand(){ return brand; }

    public boolean getType(){ return type; }

    public boolean getPower(){ return power; }

    public int getThermostat(){ return thermostat; }

    public double getTemperature(){ return temperature; }

    void display(){
        System.out.printf("Brand: %s\nType: %b\nPower status: %b\nThermostat: %s\nTemperature: %.1f\n",brand,type,power,thermostat,temperature);
    }
}