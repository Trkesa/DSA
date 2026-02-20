class Solution {
    public int reverseBits(int n) {
        int num=0,ans=0;
        for(int i=0;i<32;i++){
            if((1 & (n>>i))==1){
                ans=ans|(1<<(31-i));
            }
          
        }
        return ans;
    }
}