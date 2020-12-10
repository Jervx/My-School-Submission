class Appliance{
    private String brand;
    private double cost;
    private boolean powerstatus;

    public Appliance(String brand, double cost ){
        this.brand = brand;
        this.cost = cost;
        powerstatus = false;
        System.out.println("Appliance Constructor");
    }

    public String getBrand(){ return brand; }
    public double getCost() { return cost; }
    public boolean getPowerstatus() { return powerstatus; }

    public void power(){ powerstatus = !powerstatus; }

    public String toString(){
        return "Brand: "+brand+
        ", Cost: PhP "+String.format("%.2f",cost)+
        ", Power: "+(powerstatus?"ON":"OFF");
    }

}