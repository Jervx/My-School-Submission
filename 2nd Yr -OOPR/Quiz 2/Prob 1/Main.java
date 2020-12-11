import java.util.Scanner;

class Main{

    public static void main(String [ ] jervx){
        Scanner in = new Scanner(System.in);
        AC ac;

        if(in.nextInt()== 2){
            in.nextLine();
            ac = new AC(in.nextLine(),in.nextBoolean());
        }
        else
            ac = new AC();
        
        int m = in.nextInt();

        for(int x = 0; x < m; x++)
            switch(in.nextInt()){
                case 3 : ac.power();
                        break;
                case 4: ac.thermostatUp();
                        break;
                case 5: ac.thermostatDown();
                        break; 
                case 6: ac.temperatureUp();
                        break;
                case 7: ac.temperatureDown();
                        break;
                case 8: System.out.println("Brand: "+ac.getBrand());
                        break;
                case 9: System.out.println("Type: "+ac.getType());
                        break;
                case 10: System.out.println("Power: "+ac.getPower());
                        break;
                case 11: System.out.println("Thermostat: "+ac.getThermostat());
                        break;
                case 12: System.out.println("Temperature: "+ac.getTemperature());
                        break;
                case 13: ac.display();
                        break;
            }
    }
}