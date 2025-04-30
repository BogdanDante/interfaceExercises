package interfaceExercises;

import java.util.Arrays;

public class MergeSort implements Sortable{
  
  @Override
  public void sort(int array[], int low,int high) {
    if(array.length < 2) {
      return;
    }
    int size = array.length;
    int s = size/2;
    int[] arrayL = new int[s];
    int[] arrayR = new int[size - s];
    
    for(int i = 0; i < s; i++) {
      arrayL[i] = array[i];
    }
    for(int i = 0; i < size - s; i++) {
      arrayR[i] = array[s + i];
    }
    
    sort(arrayL,0,1);
    sort(arrayR,0,1);
    merge(arrayL,arrayR,array);
  }
  
  public void merge(int[] arrayL, int[] arrayR, int[] array) {
    int sizeL = arrayL.length;
    int sizeR = arrayR.length;
    int i = 0, j = 0, t = 0;
    while(i < sizeL && j < sizeR) {
      if (arrayL[i] >= arrayR[j]) {
        array[t++] = arrayL[i++];
      } else {
        array[t++] = arrayR[j++];
      }
    }
    while(i < sizeL) {
      array[t++] = arrayL[i++];
    }
    while(j < sizeR) {
      array[t++] = array[j++];
    }
    //System.out.println(Arrays.toString(array));
  }
}
