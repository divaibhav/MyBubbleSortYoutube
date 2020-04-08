/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 09-Apr-20
 *  Time: 1:43 AM
 */
package youtube.example.bubblesort;

import java.util.Arrays;
//sorting an integer array
public class MyBubbleSort {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {25,2,8,60,3};
        MyBubbleSort object = new MyBubbleSort();
        System.out.println("Unsorted -->" + Arrays.toString(arr));

        object.bubbleSort(arr);
        System.out.println("Sorted -->" + Arrays.toString(arr));
    }
}
