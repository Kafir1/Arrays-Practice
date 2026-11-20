public class Avg {
    public static void main(String[] args){
        int[] nums = {28, 90, 34, 110, 15, 40};
        int sum = 0;
        for (int num : nums)
            sum+=num;
        double avg = sum/ nums.length;
        System.out.print("Array: ");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Average: " + avg);
        System.out.print("Numbers above average: ");
        for (int num : nums){
            if (num > avg)
                System.out.print(num + " ");
        }
    }
}
