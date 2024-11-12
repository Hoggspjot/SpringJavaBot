public class TwoD {
    public static void main(String[] args) {

        int table[][] = new int[3] [4];
        
        for (int j = 0; j < table.length; j++) {
            for (int j2 = 0; j2 < table[j].length; j2++) {
                table[j][j2] = (j*4)+j2+1;
                System.out.print(table[j][j2]+ " ");
            }    
            System.out.println();
        }
    }
}
