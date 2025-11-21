class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        int st=0;
        int max=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(st<i && mp.get(ch)>=2){
                int x=mp.get(s.charAt(st));
                if(x==1)mp.remove(s.charAt(st));
                else
                mp.put(s.charAt(st),x-1);
                st++;
            }
            max=Math.max(max,mp.size());
        }
        return max;
    }
}