package Encapsulation.prob1;
class Television extends Appliance{
    private String type;
    private int volume, channel;

    public String getType(){ return type; }
    public int getVolume(){ return volume; }
    public int getChannel(){ return channel; }

    public void volumeUp(){ if(getPowerstatus()) volume++; }
    public void volumeDown(){ if(getPowerstatus()) volume--; }
    public void channelUp(){ if(getPowerstatus()) channel++; }
    public void channelDown(){ if(getPowerstatus()) channel--; }

    @Override
    public String toString(){
        return "Brand: "+getBrand()+
        ", Cost: PhP "+String.format("%.2f",getCost())+
        ", Power: "+(getPowerstatus()?"ON":"OFF")+
        ", Type: "+type+
        ", Volume: "+volume+
        ", Channel: "+channel;
    }

    public Television(String brand, double cost, String type){
        super(brand,cost);
        this.type = type;
        volume = 0;
        channel = 1;
        System.out.println("Television Constructor");
    }
}