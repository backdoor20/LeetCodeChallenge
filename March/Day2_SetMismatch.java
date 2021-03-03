class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int duplicate=-1,missing=-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)>1)
                    duplicate=i;
            }else{
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }
}