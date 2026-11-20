public class LargeSmall {
    public static void main(String[] args){
        int[] nums = {12, 5, 28, 3, 19, 7, 15, 9};
        int min = nums[0];
        int minind = 0;
        int max = nums[0];
        int maxind = 0;
        int i = 0;
        System.out.print("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
            if (num < min){
                min = num;
                minind = i;
            }
            if (num > max){
                max = num;
                maxind = i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Largest: " + max + "  at index " + maxind);
        System.out.println("Smallest " + min + " at index " + minind);
    }
}
