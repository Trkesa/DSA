class Solution {
    public int[] getNoZeroIntegers(int n) {
      
        for(int i=1;i<n;i++){
             int first=i;
             int diff=n-first;
        if(!(first + "").contains("0") && !(diff + "").contains("0")) {
                return new int[]{first,diff};
             }
        }
        return new int[]{};
    }
}