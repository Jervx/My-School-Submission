import java.util.Scanner;
/* 🍇 Jervx 🍇 */
public class Main {

    public static void main(String [] jervx){
        Scanner in = new Scanner(System.in);

        AC ac = null;

        int T = in.nextInt();
        ac = T==1? new AC() : new AC(
            in.next(),
            in.next(),
            in.nextInt() == 1? true : false);

        T = in.nextInt();
        while(T-->0){
            int A = in.nextInt();
            if(A == 3) ac.power();
            else if(A == 4) ac.thermostatUp();
            else if(A == 5) ac.thermostatDown();
            else if(A == 6) ac.temperatureUp();
            else if(A == 7) ac.temperatureDown();
            else if(A == 8) System.out.println("Brand: "+ac.getBrand());
            else if(A == 9) System.out.println("Type: "+ac.getType());
            else if(A == 10) System.out.println("Power: "+ac.getPower());
            else if(A == 11) System.out.println("Thermostat: "+ac.getThermostat());
            else if(A == 12) System.out.println("Temperature: "+ac.getTemperature());
            else if(A == 13) System.out.println("Model: "+ac.getModel());
            else System.out.println(ac.toString());
        }
    }
    
}
