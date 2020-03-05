public class SortOfSort {
    public static int[] sortOfSort(int[] a){
        int end = a.length-1; // last index
        int start = 0; // first index
        int max; // highest value in the array
        int index; // current index being compared and swapped
        int temp; // temporary value for swapping
        int count = 0;
        boolean front = false; // boolean to check if we want to sort in the front or not

        for(int i = 0; i < a.length-1; i++){
            max = Integer.MIN_VALUE;
            index = i;
            for(int j = start ; j <= end; j++){
                if(a[j] > max){
                    max = a[j];
                    index = j;
                }
            }
            // Conditionals that compare start and and indexes
            if(start < end) {

                // starting from the end, so not the start, sort the highest two values
                // in descending order
                if (!front) {
                    temp = a[end];
                    a[end] = max;
                    a[index] = temp;
                    end--;
                }

                // moving onto the front, sort the highest two values in ascending order
                else{
                    temp = a[start];
                    a[start] = max;
                    a[index] = temp;
                    start++;
                }
            }
            count++;

            // After two iterations, the boolean changes to satisfy the front conditional
            if(count == 2){
                count = 0;
                front = !front;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,1,6,5};
        sortOfSort(a);
        for(int i= 0; i < a.length;i++){
            System.out.print(a[i]);
        }

    }
}
