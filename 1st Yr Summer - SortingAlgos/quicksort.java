
public class quicksort {

    int data[];

    public quicksort(int [] data){ this.data = data; }

    public void sSort(int a, int b){
        if(a < b){
            printData();
            int p = partition(a,b);
            sSort(a,p-1);
            sSort(p+1, b);
        }
    }

    public int partition(int a, int b){
        int focus = data[b];

        var i = a - 1;
        int temp;

        for(var c1 = a; c1 <= b; c1++){
            if(data[c1] < focus){
                i++;
                temp = data[i];
                data[i] = data[c1];
                data[c1] = temp;
            }
        }

        temp = data[b];
        data[b] = data[++i];
        data[i] = temp;
        
        return i;
    }

    public void sort(){ sSort(0, data.length-1); }   

    public void printData(){
        System.out.print("[");
        for(int x = 0 ; x < data.length; x++) System.out.print(data[x]+(x == data.length - 1 ? "":", "));
        System.out.println("]");
    }

    public int [] getData(){ return data; }
    
}