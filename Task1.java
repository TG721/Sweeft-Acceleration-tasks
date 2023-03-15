public class Task1 {
    static int singleNumber(int[] nums) {
        boolean ind= true;
        int result = 0;
        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums.length; j++)
            {
                if (nums[i]==nums[j] && i!=j)
                {
                    ind = false;
                }
            }
            if(ind) result = nums[i];
            else ind = true;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,4,5,6,3,5,-2,3,-2};
        System.out.println(singleNumber(arr));
    }
};
