

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287,49};
        int t;
        int size;

        size = nums.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        for (int i = 1; i < size; i++) {
            for (int j = size-1;j >= i; j--) {
                if (nums[j-1] > nums[j]){
                    t = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = t;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
