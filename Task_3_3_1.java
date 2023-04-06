
//Алгоритм сортировки выборкой

package For_java_HW;
import java.util.*;
public class Task_3_3_1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(list));
        selectSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }    
}
