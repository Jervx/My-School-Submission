import java.util.Arrays;
public class bubble{

    int data[];
    int iteration = 0;
    int swaps = 0;

    public bubble(int [] data){this.data = data;}

    public void sort(){
        for(int p1 = 0; p1 < data.length; p1++){
            for(int p2 = p1; p2 < data.length; p2++){
                iteration++;
                if(data[p1] > data[p2]){
                    int temp = data[p1];
                    data[p1] = data[p2];
                    data[p2] = temp;
                    swaps++;
                }
            }
            iteration++;
        }
    }

    public int [] getData(){ return data; }

    public void printData(){
       System.out.println(Arrays.toString(data));
    }

}
