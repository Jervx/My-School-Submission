class selectionSort{
    
    int data[];

    public selectionSort(int [] data){
        this.data = data;
    }

    int iteration = 0;
    int swaps = 0;

    public void sort(){
        if(data.length == 0) return;

        int minP = 0;

        for(int x = 0; x < data.length; x++){
            for(int y = x+1; y < data.length; y++){
                minP = data[minP] > data[y]? y : minP;
                iteration++;
            }
            if(data[x] > data[minP]){
                int temp = data[x];
                data[x] = data[minP];
                data[minP] = temp;
                swaps++;
            }
            minP = x+1;
            iteration++;
        }
    }

    void selectionSortS() {
        iteration = 0;
        int size = data.length;
        for (int step = 0; step < size - 1; step++) {
          int min_idx = step;
    
          for (int i = step + 1; i < size; i++) {
            if (data[i] < data[min_idx]) {
              min_idx = i;
            }
            iteration++;
          }
          int temp = data[step];
          data[step] = data[min_idx];
          data[min_idx] = temp;
          swaps++;
          iteration++;
        }
      }

    public void printData(){
        System.out.print("[");
        for(int x = 0 ; x < data.length; x++) System.out.print(data[x]+(x == data.length - 1 ? "":", "));
        System.out.println("] Iteration -> "+iteration+" swaps -> "+swaps);
    }

    public int [] getData(){ return data; }
    
}
