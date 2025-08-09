package Help123;

public class Help1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()* 100);
        }
        print(array);
        sort(array);
        print(array);
    }


    static void print(int arr[]){
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();;
    }

    static void sort(int arr[]){
        int temp = 0;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1 ; j >= i; j--) {
                        if(arr[j -1] > arr[j]){
                            temp = arr[j];
                            arr[j] = arr[j-1];
                            arr[j-1] = temp;
                        }
            }
        }
    }
}
