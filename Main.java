import java.util.Arrays;

public static void sort(int[] a){
    int indexOfSmallest;
        for (int index = 0; index < a.length; index++){
            indexOfSmallest = index;
            for (int j = index+1; j < a.length; j++){
                if (a[j] < a[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            swap(index, indexOfSmallest, a);
        }
}
private static void swap(int i, int j, int[] a) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
public static void main(String[] args) {
    int[] array = {2,5,35,4,7};
    sort(array);
    System.out.println(Arrays.toString(array));
}
