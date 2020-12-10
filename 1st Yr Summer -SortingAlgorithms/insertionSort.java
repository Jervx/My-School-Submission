

public class insertionSort {

    private int [] data;

    public insertionSort(int [] data){
        this.data = data;
    }

    /* 1, 3, 2, 4, 5, 8
     
    i = 5
    key = 8
    j = 4
    pointing -> 5

    */

    int i = 0;

    public void sort(){
        for(int x = 1; x < data.length; x++){
            var k = data[x];
            var j = x - 1;
            i ++;
            while(j >= 0 && data[j] > k){
                data[j + 1] = data[j];
                j -= 1;
            }
            data[j + 1] = k;
        }
    }

    public void printData(){
        System.out.print("[");
        for(int x = 0 ; x < data.length; x++) System.out.print(data[x]+(x==data.length - 1? "":", "));
        System.out.println("] -> Iteration : "+ i);
    }

    public int [] getData(){ return data; }
    
}