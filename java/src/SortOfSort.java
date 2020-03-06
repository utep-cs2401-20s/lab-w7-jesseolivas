public class SortOfSort {
    public static int[] sortOfSort(int[] a){
        if(a.length< 2) {
            return a;
        }
        int end = a.length-1; // last index
        int start = 0; // first index
        int max; // highest value in the array
        int index; // current index being compared and swapped
        int temp; // temporary value for swapping
        int count = 0;
        boolean front = false; // boolean to check if we want to sort in the front or not
        int steps = 0;

        // This for loop iterates n times, linear
        for(int i = 0; i < a.length-1; i++){ // O(n) complexity
            max = Integer.MIN_VALUE;
            index = i; // O(1) complexity

            // This for loop also iterates n times, linear
            for(int j = start ; j <= end; j++){ // O(n) complexity
                steps ++;
                if(a[j] > max){
                    max = a[j];
                    index = j;
                }
            }
            // There are two linear algorithms in this method when n > 1,
            // making it a quadratic algorithm where O(n^2)

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
        System.out.println(steps);
        return a;
    }
}
