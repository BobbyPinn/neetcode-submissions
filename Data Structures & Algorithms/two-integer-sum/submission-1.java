class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] a = new int[2];
        for(int i = 0; i < nums.length; i ++){
            Integer compIndex = hash.get(nums[i]);
            if(compIndex != null){
                return new int []{compIndex, i};
            }
            hash.put(target - nums[i], i);
        }
        
        return new int[2];
    }
}
