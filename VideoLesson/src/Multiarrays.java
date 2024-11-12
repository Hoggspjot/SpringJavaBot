

public class Multiarrays {
    public static void main(String[] args) {
        int[] number ={1,2,3};
        int[][] numbers =  {{1,2,3}, 
                            {4,5,6},
                            {7,8,9}};
    System.out.println(numbers[2][2]);
    System.out.println(numbers[1][0]);   


    int[] num = new int[10];

    String[][] str1 = new String[2][3];
    System.out.println(str1[0][0]);


    for (int i = 0; i < numbers.length; i++){
        for(int j = 0; j < numbers[i].length; j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
    }
}
