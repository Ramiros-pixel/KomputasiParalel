package Shorting;

public class quickShort {
static int pi;

    static void partisi(Integer[] arr, int low, int high){
        int tamp=2;

     
        int temp = arr[high];
        int pivot= arr[high];

        int i= low -1;
        for(int j =low ; j<high; j++){
            if (arr[j]<pivot){
                i+=1;
                int tump = arr[i];
                arr[i]=arr[j];
                arr[j]= tump;
            }
            pi = i+1;
        }
            int combine =arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = combine;

        
    

    }
    static void quickShort(Integer[] arr, int low, int high){
        if(low<high){
        partisi(arr, low, high);
        quickShort(arr, low, pi-1);
        quickShort(arr, pi+1, high);
    }
    }
    public static void main(String[] args) {
     Integer[] data = {5, 3, 8, 4, 2};
        quickShort(data, 0, data.length - 1);

        for (int x : data) {
            System.out.print(x + " ");
        }
    }
}
