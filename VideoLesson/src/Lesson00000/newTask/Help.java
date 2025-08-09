



public class Help {
    public static void main(String[] args) {
        double sum = 0.0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 100.0);
        }

        print(array);



        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("Среднее арифметическое равно %.2f",sum/array.length);
    }

    static void print(double[] arr){
        for(double x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}


