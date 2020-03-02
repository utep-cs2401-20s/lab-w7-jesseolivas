public class SortOfSort {
    public static int[] sortOfSort(int[] a){
        int i;
        int j;
        int k = a.length-1;
        int temp;
        int count = 0;
        // This loop sorts the array
        for(i = 0; i < a.length-1; i++){
            for(j = i+1; j < a.length-i-1;j++){
                if(i > j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
    public int m(int[]a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum+= a[i];
        }
        return sum;
    }
}
