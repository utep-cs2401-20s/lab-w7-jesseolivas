public class SortOfSort {
    public static int[] sortOfSort(int[] a){
        int max = a.length-1;
        int min = 0;
        int size = a.length;
        int temp;
        int count;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int[] temp1 = new int[a.length];
        for(int i = 0;i < a.length;i++){
            temp1[i] = a[i];
        }
        while (size > 0 ){
            count = 0;
            while (count < 2 && max >=0) {
                a[max] = temp1[max];
                max--;
                count++;
                size--;
            }
            count = 0;
            while(count<2 && max >=0){
                a[min] = temp1[max];
                min++;
                max--;
                count++;
                size--;
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
