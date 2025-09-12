class Solution {
    public int singleNumber(int[] nums) {
       Set<Integer> map=new HashSet<>();
       for(int num : nums){
        if(!map.contains(num)){
          map.add(num);
        }
        else{
            map.remove(num);
        }
       } 
       for(int num : map){
        return num;
       }
      return -1;
    // int single=nums[0];
    // for(int i=1;i<nums.length;i++){
    //     single=single^nums[i];
    // }
    // return single;
    }
}