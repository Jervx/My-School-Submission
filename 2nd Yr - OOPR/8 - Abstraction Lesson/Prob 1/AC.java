public class AC extends Appliance {

    boolean type;
    int thermostat,temperature;

    public AC(){
        super();
        thermostat = 0;
        temperature = 0;
        type = true;
        System.out.println("Default Constructor");
    }

    public AC(String brand, String model, boolean type){
        super(brand,model);
        thermostat = 0;
        temperature = 0;
        this.type = type;
        System.out.println("Overloaded Constructor" );
    }

    public void thermostatUp(){
        if(!power || thermostat >= 10) return;
        thermostat++;
    }

    public void thermostatDown(){
        if(!power || thermostat <= 1) return;
        thermostat--;
    }

    public void temperatureUp(){
        if(!power || temperature >= 30) return;
        temperature++;
    }

    public void temperatureDown(){
        if(!power || temperature <= 16) return;
        temperature--;
    }

    public int getTemperature(){ return temperature; }
    public int getThermostat() { return thermostat; }
    public boolean getType(){ return type; }

    @Override
    public void power(){
        super.power();
        if(power){
            thermostat = 1;
            temperature = 16;
        }else{
            thermostat = 0;
            temperature = 0;
        }
    }

    @Override
    public String toString(){
        return super.toString() + 
        String.format(", Type: %s, Thermostat: %d, Temperature: %d",type,thermostat,temperature);
    }

    @Override
    public void work() {
        if(!power) return;
        System.out.println("AC now blowing air with thermostat set to "+
        thermostat+" and temperature set to "+temperature);
    }

}