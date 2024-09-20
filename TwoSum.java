//https://leetcode.com/problems/two-sum/
class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] indexs = twoSum.twoSum(nums, target);
        System.out.println(indexs[0] + " " + indexs[1]);
    }
    
    public int[] twoSum(int[] nums, int target) {
        int pair = 2;
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //add inner loop to find other place instead of consuctive
            for(int j = i + 1; j< nums.length; j++)
            /*if ((nums[i] + nums[i + 1]) == target) {
                indexs[0] = i;
                indexs[1] = i + 1;
            }*/

            if(nums[j] == (target - nums[i])){
                indexs[0] = i;
                indexs[1] = j;
            }

        }
        return indexs;
    }
}