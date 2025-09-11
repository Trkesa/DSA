class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length==0) return 0;
    int unique=0;
    for(int i=0;i<=nums.length-1;i++){
        if(nums[i]!=nums[unique]){
            unique++;
            nums[unique]=nums[i];
        }

    }
    return unique+1;
    }
}
// if(nums.length==0)return 0;
// int arr[]=new int[nums.length];
// HashSet<Integer> set =new HashSet<>();
// int index=0;

// for(int num : nums){
//     if(!set.contains(num)){
//         set.add(num);
//         arr[index++]=num;
//     }
// }
//  return index;
//     }
// }
       