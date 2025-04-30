package interfaceExercises;

import java.util.Arrays;

public class QuickSort implements Sortable{
    
  static int partition(int[] arr, int low, int high) {
    int pi = arr[high];
    int i = low -1;
    int j = low;
    while(j < high){
      if(arr[j] < pi) {
        i++;
        swap(arr,i,j);
      }
      j++;
    }
    swap(arr,i + 1,high);
    System.out.println(Arrays.toString(arr));
    return i + 1;
    
}

// Swap function
static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// The QuickSort function implementation
@Override
public void sort(int[] arr, int low, int high) {
    if(low < high) {
      int pi = partition(arr, low, high);
      sort(arr,low,pi -1);
      sort(arr, pi + 1, high);
    }
}

}
