import java.util.*;

class BubbleSort{
    //method to sort
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
        }
    }
}
        for(int num :arr){
            System.out.print(num +" ");
        }
}

    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        //display
        bubbleSort(arr);

    }
}
/*11 12 22 25 34 64 90  */