
public class Main {

    public void main(){
        int [] data = {1,12,3,4,61,6,27,8,9,310,11,42,13,24,15};
        int [] data2 = {1,12,3,4,61,6,27,8,9,310,11,42,13,24,15};
        bubble bbsort = new bubble(data);
        quicksort qsort = new quicksort(data);
        insertionSort isort = new insertionSort(data);
        selectionSort ssort = new selectionSort(data2);

        bbsort.printData();
        bbsort.sort();
        bbsort.printData();
        System.out.println("====================================================================================");
        ssort.printData();
        ssort.sort();
        ssort.printData();
    }

    public static void main(String [] args){
        Main a = new Main();
        a.main();
    }
    
}
