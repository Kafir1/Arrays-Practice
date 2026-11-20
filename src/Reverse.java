public class Reverse {
    public static void main(String[] args){
        int[] nums = {-3, 4, 0, 7, -9, 0, 0, 10, 5, -13};
        System.out.print("Original: " );
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.print("Reversed: ");
        for (int i= nums.length-1; i>=0; i--)
            System.out.print(nums[i] + " ");
    }
}
