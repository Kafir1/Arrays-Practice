public class Main {
    public static void main(String[] args){
        int[] nums = {-3, 4, 0, 7, -9, 0, 0, 10, 5, -13};
        int pos = 0;
        int neg = 0;
        int zero = 0;
        System.out.print("Array: ");
        for (int num : nums){
            System.out.print(num + " ");
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else {
                zero++;
            }
        }
        System.out.println();
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}